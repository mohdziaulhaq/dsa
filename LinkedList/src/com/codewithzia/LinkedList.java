package com.codewithzia;

import java.util.NoSuchElementException;

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
    private int size;

    //addLast
    public void addLast(int item){
        var node = new Node(item);
        
        //check if linkedlist is empty
        if(isEmpty()) 
            first = last = node;
        //add node at last
        else{
            last.next = node;
            last = node;
        }
        size++;
    }
    //addFirst
    public void addFirst(int item){
        var node = new Node(item);

        //check if linkedlist is empty
        if(isEmpty())
            first = last = node;
        // add node at last
        else{
            node.next = first;
            first = node;
        } 
        size++;

    }
    //indexOf
    public int indexOf(int item){
        int index = 0;
        var current = first;
        while(current != null){
            if(current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }
    
    //contains
    public boolean contains(int item){
        return indexOf(item) != -1;
    }
    
  

    
    //removeFirst
    public void removeFirst(){
        if(isEmpty())
        throw new NoSuchElementException();

        if(first == last){
            first = last = null;
            return;
        }

        var second = first.next;
        first.next = null;
        first = second;

        size--;
    }
    //removeLast
    public void removeLast(){
        if(isEmpty())
        throw new NoSuchElementException();

        if(first == last)
            first = last = null;
        else{
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }   
        size--;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        var current = first;
        var index =0;
        while(current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverse(){
        if(isEmpty()) return;
        // f            l
        //[10 -> 20 -> 30]
        //              p     c     n
        // n = c.next;
        // c.next = p;
        //[10 <- 20 <- 30]
        
        var previous = first;
        var current = first.next;

        while(current != null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;    
        }
        last = first;//to get last pointer
        last.next = null;//last should only point to null
        first = previous;

    }

    private boolean isEmpty(){
        return first == null;
    }

    private Node getPrevious(Node node){
        var current = first;
        while(current != null){
            if(current.next == node) return current;
            current = current.next;
        }
        return null;
    }
}
