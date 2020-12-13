package com.company;

import javax.swing.*;

public class Sort extends JFrame {
    static final int WIDTH = 500;                // frame width
    static final int HEIGHT = 400;               // frame height

   /* public Sort(){
        setTitle("Sort list ");

    }*/
    public static <type extends Comparable<type>> type[] Sorting(type[] list, type temp){
        int size = list.length;
        for( int i = 1 ; i < size; ++i){
            int j = i-1;
            type key = list[i];
            while ( j >= 0 && key.compareTo( list[j] ) < 0) {
                temp =  key;
                list[j+1] = list[j];
                j --;
            }
            list[j+1] = key;
        }
        return list;
    }

    @Override
    public String toString() {
        return "Sort{}";
    }

    public static void main(String[] args) {
        Integer[] number = new Integer[]{9,5,1,3,2};
        int num = 0;
        for ( int x : Sorting(number, num)){
            System.out.print(x);
        };
    }
}
