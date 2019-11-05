package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        for(int i = 1; i<=100;i++) {
            int count = 0;
            if(i > 2) {
                for(int j = 2; j < Math.sqrt(i); j++) {
                    if(i % j == 0) {
                        count++;
                    }
                }
                if(count == 0) {
                    System.out.print(i + " - ");
                }
            }
        }
    }
}
