package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     /*   Scanner scanner=new Scanner(System.in);
        List<String> testwork=new ArrayList<>(5);
        System.out.println("Введите 5 значений в ввиде строк ");*/
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        System.out.println("Введите 5 строк: ");
        ArrayList<String> nameC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            A.add(scanner.nextLine());

        }
        System.out.println(A);
        for (int i = 0; i < 5; i++) {
            b.add(scanner.nextLine());

        }
        System.out.println(b);
        Collections.reverse(b);
        System.out.println(b);

        Integer x = 0;
        while (nameC.size()<A.size()+b.size()){
            nameC.add(A.get(x) );
            nameC.add(b.get(x) );
            x++;
        }
        nameC.add(A.get(0));
        nameC.add(b.get(1));
        System.out.println(nameC);
        Collections.sort(nameC, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length() ;
            }
        });
        System.out.println(nameC);
    }
}