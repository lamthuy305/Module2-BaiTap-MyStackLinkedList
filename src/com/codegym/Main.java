package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyStack<String> stack = new MyStack<>();

        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");

        System.out.println("Stack size: "+ stack.size());
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("Stack size: "+ stack.size());

        System.out.println();

        MyStack<Integer> stack2 = new MyStack<>();
        stack2.push(10);
        stack2.push(20);
        stack2.push(30);
        stack2.push(40);
        System.out.println("Stack size: "+ stack2.size());
        while(!stack2.isEmpty()){
            System.out.println(stack2.pop());
        }
        System.out.println("Stack size: "+ stack2.size());
    }
}
