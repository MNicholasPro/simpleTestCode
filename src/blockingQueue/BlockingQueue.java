package blockingQueue;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by April_Chou on 2017/2/19.
 */
public class BlockingQueue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base directory (e.g. /user/local/jdk1.6.0/src");
        String directory = in.nextLine();
        System.out.print("Enter keyword (e.g. volatile");
        String keyword = in.nextLine();

        final int FILE_QUEUE_SIZE = 10;
        final int SEARCH_THREADS = 100;

        BlockingQueue<File> queue = new ArrayBlockingQueue<File>(FILE_QUEUE_SIZE);

        FileEnumertionTask enumerator = new FileEnumertionTask(queue,new File(directory));
        new Thread(enumerator).start();
        for (int i = 1; i <= SEARCH_THREADS; i ++){
            new Thread(new SearchTask(queue, keyword)).start();
        }
    }
}

class FileEnumertionTask implements Runnable{
    public static File DUMMY = new File("");
    private BlockingQueue<File> queue;
    private File startingDiretory;

    public FileEnumertionTask(BlockingQueue<File> queue, File startingDiretory){
        this.queue = queue;
        this.startingDiretory = startingDiretory;
    }

    public void run(){
        try{
            enumerate(startingDiretory);
            queue.put(DUMMY);
        }catch (InterruptedException e ){

        }
    }

    public void enumerate(File directory) throws InterruptedException{
        File[] files = directory.listFiles();
        for (File file : files){
            if (file.isDirectory()){
                enumerate(file);
            }else{
                queue.put(file);
            }
        }
    }
}

class SearchTask implements Runnable {
    private BlockingQueue<File> queue;
    private String keyword;

    public SearchTask(BlockingQueue<File> queue, String keyword) {
        this.queue = queue;
        this.keyword = keyword;
    }

    public void run() {
        try {
            boolean done = false;
            while (!done) {
                File file = queue.take();
                if (file == FileEnumertionTask.DUMMY) {
                    queue.put(file);
                    done = true;
                } else {
                    search(file);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {

        }
    }
}



    public void search(File file ) throws IOException{
        try(Scanner in = new Scanner(file)){
            int lineNumber = 0;
            while(in.hasNextLine()){
                lineNumber++;
                String line = in.nextLine();
                if (line.contains(keyword)){
                    System.out.printf("%s:%d:%s%n", file.getPath(), lineNumber,line);
                }
            }
        }
    }
}