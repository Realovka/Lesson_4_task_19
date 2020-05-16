package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите размерность массива");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        Random random = new Random();

        for(int i=0; i<array.length; i++){
            array[i]=random.nextInt(20);

        }

        System.out.println(Arrays.toString(array));

        int min=array[2];
        for (int i=2; i<array.length; i+=2){
            if (array[i]<min){
                min=array[i];
            }

        }
        System.out.println("Наименьший элемент массива с четным индексом "+min);
    }
}
