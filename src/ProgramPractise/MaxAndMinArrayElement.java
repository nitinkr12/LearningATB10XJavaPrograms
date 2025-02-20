package ProgramPractise;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class MaxAndMinArrayElement {
    public static void main(String[] args) {

        int[] arr1 = {56, 67, 1, 3, 100, 76, 5};
        arr1= Arrays.stream(arr1).sorted().toArray();
        for(int i=0;i<arr1.length;i++)
        {
        System.out.println(arr1[i]);
    }
        System.out.println("min :"+" " +arr1[0]);
        System.out.println("max :"+" " +arr1[arr1.length-1]);


    }}