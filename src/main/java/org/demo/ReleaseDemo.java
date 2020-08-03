package org.demo;


public class ReleaseDemo {
    public static void main(String args[]) {
        System.out.println("Hello .");
        System.out.println();
        System.out.println("This program is running version "+ ReleaseDemo.class.getPackage().getImplementationVersion());
    }
}
