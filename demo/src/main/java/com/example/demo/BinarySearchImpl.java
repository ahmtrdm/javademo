package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor){
        //sorting
        int [] SortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);



        //Search


        return 3;
    }

    //sorting


    //search
    //return
}
