package com.codewithzia;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;
    
        public Node(int value){
            this.value = value;
        }
    }
    
    private Node first;
    private Node last;

    //addLast
    public void addLast(int item){
        var node = new Node(item);
        
        //check if node is first
        if(isEmpty()) 
            first = last = node;
        //add node at last
        else{
            last.next = node;
            last = node;
        }
    }
    //addFirst
    public void addFirst(int item){
        var node = new Node(item);

        //check if node is first
        if(isEmpty())
            first = last = node;
        // add node at last
        else{
            node.next = first;
            first = node;
        } 


    }
    //deleteFirst
    //deleteLast
    //contains
    //indexOf
    private boolean isEmpty(){
        return first == null;
    }
}
