package com.codewithzia;

import java.util.Arrays;
import java.util.LinkedList;

// public class App {
//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();
//         list.addLast(10);
//         list.addLast(20);
//         list.addLast(30);
//         // list.removeLast();
//         System.out.println(list.contains(10));
//         System.out.println(list.indexOf(10));
//         System.out.println(list.size());
//         var array = list.toArray();
//         System.out.println(list);
//         System.out.println(Arrays.toString(array));
//     }
// }

public class App{
    public static void main(String[] args) {
        var list = new com.codewithzia.LinkedList();
        // list.addLast(10);
        // list.addLast(20);
        // list.addLast(30);
        // list.addLast(40);
        // list.addFirst(90);
        // System.out.println(list.indexOf(0));
        // System.out.println(list.contains(20));
        // System.out.println(list.contains(50));
        // list.removeFirst();
        // list.removeLast();
        // System.out.println(list.size());
        list.reverse();
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}