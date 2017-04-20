package yanghuisanjiao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by April_Chou on 2017/4/21.
 */
public class Shuchu {







    public static void getRow(int rowIndex) {

        ArrayList<Integer> res = new
                ArrayList<Integer>(rowIndex);



    if(rowIndex<0)

   return;



   for(int i=0; i<=rowIndex; i++) {

   res.add(1);
   for(int j=i-1;j>0; j--) {

   res.set(j, res.get(j-1)+res.get(j));

   }

   }

   for(int i=0;i<res.size();i++)

   {

   System.out.print(res.get(i)+" ");

   }

   }




    public static void main(String[] args)throws Exception {

   Scanner in=new Scanner(System.in);

   int a=in.nextInt();

   getRow(a-1);






    }
}
