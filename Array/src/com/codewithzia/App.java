package com.codewithzia;

public class App {
    public static void main(String[] args) {
        Array numbers = new Array(3);
         numbers.insert(10);
         numbers.insert(20);
         numbers.insert(30);
         numbers.insert(40);
        //  numbers.insert(50);
        // numbers.insert(10);
        // numbers.removeAt(3);
        // numbers.indexOf(100);
        numbers.print();
    }
}