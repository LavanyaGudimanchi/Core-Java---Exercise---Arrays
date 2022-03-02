package com.perscholas.java_basics;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*Write a program that creates an array of integers with a length of 3.
        Assign the values 1, 2, and 3 to the indexes. Print out each array element.
         */
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        //2nd method
        int[] nums= {1,2,3};
        for(int i=0;i<3;i++)
            System.out.println(nums[i]);

        System.out.println("*************************");

       int[] arr5 = new int[]{2,3,5,7,8}; // array of size 5
        int[] arr2 = new int[7]; // new array declared of size 7
        for(int i = 0 ; i < 5 ; i++) {
            // adding all the elements of orignal array arr1 to new array arr2
            arr2[i] = arr5[i];
        }
        arr2[5] = 10; // added value 10 to 6th element of new array
        arr2[6] = 12; // added value 12 to 7th element of new array
        System.out.print(arr2[6]);  // printing element at index 6
       for(int j=0;j<arr2.length;j++)
           System.out.println(arr2[j]);

        System.out.println("*************************");

      /*  Write a program that returns the middle element in an array.
       Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
       */
       int[] nums1 = {13, 5, 7, 68, 2};
        System.out.println(nums1[2]);
        System.out.println("*************************");

        /*Write a program that creates an array of String type and initializes it with the strings “red”, “green”, “blue” and “yellow”.
         Print out the array length. Make a copy using the clone( ) method.
         Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
         */
 String [] colors={"red","green","blue","yellow"};
           System.out.println(colors.length);
     //copying 2 arrays
     String [] copyOfcolours;
      copyOfcolours=colors;
      for (int i = 0; i <colors.length ; i++)
          System.out.println(colors[i]);
        for (int i = 0; i <colors.length ; i++)
            System.out.println(copyOfcolours[i]);
       copyOfcolours[2]="purple";
       System.out.println(Arrays.toString(colors)) ;

       System.out.println(Arrays.toString(copyOfcolours));

        //Copying arrays using clone method

       String [] copyClone=colors.clone();
        copyClone[2]="purple";
        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(copyClone));
        System.out.println("*************************");

        /*Write a program that creates an integer array with 5 elements (i.e., numbers).
        The numbers can be any integers.  Print out the value at the first index and the last index using length - 1 as the index.
        Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).
         Notice the type of exception which is produced. Now try to assign a value to the array index 5.
         You should get the same type of exception.
         */

       Random rd=new Random();
        int[] arr= new int[5];
        for (int i = 0; i < arr.length; i++)
            arr[i]=rd.nextInt();
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);

        /*Write a program where you create an integer array with a length of 5.
        Loop through the array and assign the value of the loop control variable (e.g., i)
         to the corresponding index in the array.
         */

        int[] arr3 = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < arr3.length; i++)
            System.out.println(arr[i]);
        System.out.println("*************************");

        /*Write a program where you create an integer array of 5 numbers.
         Loop through the array and assign the value of the loop control variable
          multiplied by 2 to the corresponding index in the array.*/
try {
    int[] arrint = new int[5];
    for (int i = 0; i < arrint.length; i++)
    {
        arrint[i]=i*2;

    }
    System.out.println(Arrays.toString(arrint));
}
catch (Exception e)
{
    System.out.println("testing");
}
        System.out.println("*************************");
/*Write a program where you create an array of 5 elements.
 Loop through the array and print the value of each element,
  except for the middle (index 2) element.
 */
        String[] str = new String[]{"lavanya", "Sirisha", "Soujanya", "Ashwini", "Sravani"};
        for (int i = 0; i <str.length ; i++) {
            if(i==2)
                continue;
            System.out.println(str[i]);

        }
        System.out.println("*************************");
        /*Write a program that creates a String array of 5 elements and swaps the first element
         with the middle element without creating a new array.
         */
        String [] names = {"Sridevi","JayaPrada","Suhasini","Radhika","Samantha"};
        System.out.println("Original Array: "+Arrays.toString(names));
        String temp = names[0];
       names[0] = names[names.length-3];
        names[names.length-3] = temp;
        System.out.println("New array after swaping the first and last elements: "+Arrays.toString(names));

        /*Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
        Print the array in ascending order, print the smallest and the largest element of the array.
        The output will look like the following:


          Array in ascending order: 0, 1, 2, 4, 9, 13

           The smallest number is 0

The biggest number is 13      */

        int [] array =new int[]{4, 2, 9, 13, 1, 0};
        Arrays.sort(array);
        System.out.println(array[0]);
        System.out.println(array[5]);
        System.out.println("*************************");

        /*Create an array that includes an integer, 3 strings, and 1 double. Print the array.

         */
Object [] obj=new Object[]{1,"lavanya","Sirisha","Manasa",5.5};
    int a = Integer.parseInt(obj[0].toString());
        System.out.println(a);
        System.out.println(obj[1].toString());
        System.out.println(obj[2].toString());
        System.out.println(obj[3].toString());
        double d= Double.parseDouble(obj[4].toString());
        System.out.println(d);


    }
}
