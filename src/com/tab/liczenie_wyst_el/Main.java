package com.tab.liczenie_wyst_el;

public class Main {

    public static void main(String[] args) {


        int[] a = {4, 1, 6, 1, 1}; //inic. zmiennej elem
        int wynik = 0; //inic zmienniej wynik
        int x = 1; //inc zmiennej x

        for (int i =0; i<a.length; i++)
        {
            if(a[i] == x){

                wynik = wynik + 1;

            }




        }
        System.out.println("Element x wystepuje "+wynik+" razy");

    }
}
