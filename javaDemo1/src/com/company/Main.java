package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    findNumber();

    }
    public static void findNumber (){
        int [] numbers = new int[] {1,2,5,6,7,9,0};
        int numberToFind = 6;
        boolean included = false;
        for (int number : numbers){
            if(number == numberToFind){
                included = true;
                break;
            }
        }
        if(included){
            returnResult("The array includes the number " + numberToFind);
        }else {
            returnResult("Number Couldn't found. " + numberToFind);
        }
    }

    public static void returnResult (String result){
        System.out.println(result);
    }
}
