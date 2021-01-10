package com.codewithzia;

public class App {
    public static void main(String[] args) {
        Array numbers = new Array(3);
         numbers.insert(10);
         numbers.insert(20);
         numbers.insert(30);
         numbers.insert(40);
        //  numbers.removeAt(3);
         System.out.println("Element present at index "+numbers.indexOf(400)); 
        numbers.print();
    }
}
