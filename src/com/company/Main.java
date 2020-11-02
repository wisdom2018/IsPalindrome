package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isPalindrome(number));;
    }

    private static boolean isPalindrome(int number) {
        int result = number;
        boolean isNegative = false;
        int revernumber = 0 ;
        if(number<0){
            return isNegative;
        }else{
            while(number!=0){
                int temp = number%10;
                revernumber = 10*revernumber+temp;
                number = number/10;
            }
        }
        System.out.println(revernumber);
        if(revernumber == result) {
            isNegative = true;
        }
        return isNegative;
    }
}
