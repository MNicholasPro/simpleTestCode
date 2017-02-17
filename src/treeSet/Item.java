package treeSet;

import java.util.Iterator;
import java.util.Objects;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/2/16.
 */
public class Item implements Comparable<Item>{
    private String description;
    private int partNumber;

    public Item(String aDescription, int aPartNumber){
        description = aDescription;
        partNumber = aPartNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
}

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public String toString(){
        return "[description = " + description + ",partNuber = " + partNumber + "]";
    }

    public boolean equals(Object otherObject){
        if (this == otherObject){
            return true;
        }
        if (otherObject == null){
            return false;
        }
        if (getClass() != otherObject.getClass()){
            return false;
        }
        Item other = (Item)otherObject;
        return Objects.equals(description, other.description) && partNumber == other.partNumber;
    }

    public int hashCode(){
        return Objects.hash(description,partNumber);
    }
    public int compareTo(Item other){
        return Integer.compare(partNumber,other.partNumber);
    }
}
