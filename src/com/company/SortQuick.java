package com.company;

import java.util.Arrays;

public class SortQuick{
    public static void quickSort(int[] array, int low, int high){
        if (array.length == 0)
            return; //закончить, если длина массива 0
        if (low >= high)
            return; //закончить, если уже нечего делить
        //выбор опорного элемента
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        int i = low, j = high;
        while (i <= j){
            while (array[i] < opora){
                i++;
            }
            while (array[j] > opora){
                j--;
            }
            if (i <= j){
             int temp = array[i];
             array[i] = array[j];
             array[j] = temp;
             i++;
             j--;
            }
        }
        //вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
    }
     public static void main(String[] args) {
	    int mas[] = new int[12];
        for (int i=0; i< mas.length; i++){
            mas[i] = (int) (Math.random()*12);
        }
        System.out.println("Исходный массив : " + Arrays.toString(mas));
        int low = 0;
        int high = mas.length - 1;
        quickSort(mas, low, high);
        System.out.println("Отсортированный массив : " + Arrays.toString(mas));
        }
}
