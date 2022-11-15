package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int number = sumOfTwoNumbers(2,4);
        String city = sendRandonCity();
        System.out.println(city + "\n" + number);
        int total = sumOfNumbers(1,2,3,4,5,6,7);
        System.out.println(total);
    }

    public static int sumOfTwoNumbers(int a,int b){
        return a+b;
    }

    public static int sumOfNumbers(int... numbers){
        int total = 0;
        for(int i : numbers){
            total += i;
        }
        return total;
    }

    public static String sendRandonCity(){
        return "Trabzon";
    }
}
