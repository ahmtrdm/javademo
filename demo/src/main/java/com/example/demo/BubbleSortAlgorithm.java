package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm{
    public int[] sort(int[] numbers){
        //logic for buble sort
        return numbers;
    }
}
