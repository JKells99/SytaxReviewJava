import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Syntax {

    public static void main(String[] args) {
//        System.out.println("Hello World");

        // Primative Types/ Varibles Decleration
        int myNumber = 8;
        double myDouble = 3.14;
        char myChar = 'A';
        boolean myBool = true;

        // Non Primative
        String myString = "Hello World";
        // Arrays, Classes

        // Array Example
        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};

        // Printing An Array
//        System.out.println(Arrays.toString(myIntArray));

//      Example Of Print Error
//        System.err.println("Hello");

        // Single Line Comment
        //*
        // Multi Line /**/
        //
        //
        //
        // *//
        int num1 = 3;
        int num2 = 6;
        int num3 = num1 + num2;
//        System.out.println(num3);
//        if(num1 == num2){
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }

        // Conditionals Switch and If/Else

        if(num2 >= num1){
            System.out.println("Num 2 Is Greater");

        } else if (num2<= num1) {
            System.out.println("Num 2 Is Less");

        } else{
            System.out.println("Num 1 Is Greater");
        }


        // Switch
        int day = 4;

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;

        }

        // ======Loops=====
        // While,Do While, For Loop (2 types)

        // While Loop
//        while(num1 < num2){
////            System.out.println("Hello");
////            num1++;
//
//
//        }

        // Do/While Loop
//        int i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        }
//        while (i < 5);

        // For i Loop
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
            sum+=1;
        }

        System.out.println("Sum: "+ sum);

        // For Each

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for(String car: cars){
            System.out.println("Car Name: "+ car + " ");

        }


















    }

}
