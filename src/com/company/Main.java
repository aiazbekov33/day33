package com.company;

public class Main {

    public static void main(String[] args) {
//        //Одномерный массив
//        int[] numbers = {34, 76, 988, -89, 432, 12};
//        System.out.println(numbers[5]);
//        //Перезапись элемента
//        numbers[5] = 77;
//        System.out.println(numbers[5]);

//        int[] numbers2 = new int[3];
//        numbers2[0] = 5;
//        numbers2[1] = 99;
//        numbers2[2] = 45;
//        System.out.println(numbers2[1]);

//        //Двумерные массивы
//        int[][] array = new int[2][3]   ;
//        array[0][0] = 45;
//        array[0][1] = 879;
//        array[0][2] = -7;
//        array[1][0] = 15;
//        array[1][1] = 432;
//        array[1][2] = -9;
//        System.out.println(array[0][2]);

//        int[][] array2 = {{45, 879, -7},
//                {15, 432, -9}};
//        System.out.println(array2[0][1]);
        //Цикл while
//        int a = 1;
//        while (a <= 10){
//            System.out.println("Hello: " +a);
//            a++; //a = a + 1
//        }
//        int a = 0;
//        while (a <= 100){
//            if(a % 3 == 0) {
//                System.out.println(a);
//            }
//            a++;
//        }
                      //Цикл Do while
//        int i = 6;
//        do {
//            i++;
//            System.out.println(i);
//        }while (i < 5);

//        for(int i = 0; i <= 10; i++){
//            System.out.println(i);
 //       }
//        for(int i = 1; i <= 10; i++) {
//            System.out.println("7 * " + i + " = " + i * 7);
//        }
//        for(int i = 10; i > 0; i--) {
//            System.out.println("7 * " + i + " = " + i * 7);
//        }

        //Массивы и FOR
//        int[] num = {56, 238, 989, 90, 77, 88};
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(num[i]);
//        }

//        for (int i = 0; i <= 10; i++) {
//            if(i == 5)
//            //break; or
//            continue;
//            System.out.println(i);
//        }

        //For -each
        int[] numbers = {56,238, 999, 90, 77};
        for (int newNum: numbers){
            System.out.println(newNum);
        }

        System.out.println("___________________________");

        String[] names = new String[3];
        names[0] = "name1";
        names[2] = "name2";
        names[3] = "name3";

        for (String newNames: names){
            System.out.println(newNames);
        }
    }
}
