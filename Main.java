package com.company;

import java.util.Scanner;

public class Main
{
    public static void quickSort(int[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source[(leftMarker + rightMarker) / 2];
        do {
            while (source[leftMarker] < pivot) {
                leftMarker++;
            }
            while (source[rightMarker] > pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер 1 измерения массива");

        int lengthOfArray = scanner.nextInt();

        System.out.println("Введите размер 2 измерения массива");

        int lengthOfArray1 = scanner.nextInt();
        int[][] myArray = new int[lengthOfArray][];


        for (int i = 0; i < lengthOfArray; i++)
        {
            myArray[i] = new int[lengthOfArray1];
            for (int j = 0; j < lengthOfArray1; j++)
            {
                myArray[i][j]=(int)(Math.random()*10);
                System.out.print(myArray[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < lengthOfArray; i++)
        {
            quickSort(myArray[i],0,lengthOfArray1-1);
        }

        for (int i = 0; i < lengthOfArray; i++)
        {
            for (int j = 0; j < lengthOfArray1; j++)
            {
                System.out.print(myArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
