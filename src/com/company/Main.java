package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws FileNotFoundException {
        String plikS = "Pliktekstowy.txt.txt";
        int tablica[] = new int[3];
        tablica[0] = metoda1(plikS);
        tablica[1] = metoda2(plikS);
        tablica[2] = metoda3(plikS);
        System.out.println("Znaki: " + tablica[0]);
        System.out.println("Znaki białe: " + tablica[1]);
        System.out.println("Słowa: " + tablica[2]);
    }
    // znaki
    public static int metoda1(String plik)throws FileNotFoundException {
        Scanner scaner = new Scanner(new File(plik)).useDelimiter("[\\x00-\\x7F]");
        int zmienna = 0;
        while (scaner.hasNext()) {
            scaner.next();
            zmienna++;
        }
        scaner.close();
        return zmienna;
    }
    //znaki białe
    public static int metoda2(String plik)throws FileNotFoundException {
        Scanner scaner = new Scanner(new File(plik)).useDelimiter("[ \\t\\n\\x0B\\f\\r]");
        int zmienna = 0;
        while (scaner.hasNext()) {
            scaner.next();
            zmienna++;
        }
        scaner.close();
        return zmienna;
    }
    // słowa
    public static int metoda3(String plik)throws FileNotFoundException {
        Scanner scaner = new Scanner(new File(plik));
        int zmienna = 0;
        while (scaner.hasNext()) {
            scaner.next();
            zmienna++;
        }
        scaner.close();
        return zmienna;
    }
}