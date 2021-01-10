package com.codewithzia;
public class Array {
    private int[] items;
    private int count = 0;

    public Array(int length){
        items = new int[length];
    }

    public void insert(int item){
        // if the array is full, resize it
        if(items.length == count){
            //create a new array (twice the size)
            int[] newItems = new int[count*2];

            //copy all the existing items
            for(int i = 0; i < count; i++)
                newItems[i] = items[i];

                //set "items" to this new array
                items = newItems;
        }

        //add the new item at the end
        items[count++] = item;
    }

    public void removeAt(int index){
        //Validate the index
        if(index<0 || index>=count)
        //Shift the items to the left to fill the holes
    }

    public void print(){
        for(int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }
}