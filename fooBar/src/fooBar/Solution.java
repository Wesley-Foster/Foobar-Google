package fooBar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class Solution {
    public static int[] solution(int[] data, int n) {
        // Your code here
        ArrayList<Integer> solutionArray = new ArrayList<Integer>(); //array list to hold the new array in a dynamic/modular object
        int counter = 0; //counter to see how many of the number are in the data array
        
        for(int i = 0; i < data.length; i++)
        {
           for(int a = 0; a < data.length; a++)
           {
               if(data[a] == data[i]) counter++;
           }
          
        if(counter <= n) solutionArray.add(data[i]);   
        
        counter = 0;  
        }
    
        int[] returnArray = new int[solutionArray.size()];
        for(int i = 0; i <= solutionArray.size() -1; i++)
        {
        	int number = solutionArray.get(i);
        	returnArray[i] = number;
        	System.out.println(returnArray[i]);
        }
        return returnArray;
    }
    
    public static void main(String[] args)
    {
    	int[] Larray = new int[]{1, 2, 2, 3, 3, 3, 4, 5, 5};
    	int[] output = Solution.solution(Larray, 1);
    	System.out.println(output);
    }
    
}