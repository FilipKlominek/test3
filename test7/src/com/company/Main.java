package com.company;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line;
            int currentAmount;
            int total = 0;

            while ((line = br.readLine()) != null) {
                currentAmount = Integer.parseInt(line);
                while (currentAmount > 0) {
                    total++;
                    if (currentAmount >= 5000) currentAmount -= 5000;
                    else if (currentAmount >= 2000) currentAmount -= 2000;
                    else if (currentAmount >= 1000) currentAmount -= 1000;
                    else if (currentAmount >= 500) currentAmount -= 500;
                    else if (currentAmount >= 200) currentAmount -= 200;
                    else if (currentAmount >= 100) currentAmount -= 100;
                    else if (currentAmount >= 50) currentAmount -= 50;
                    else if (currentAmount >= 20) currentAmount -= 20;
                    else if (currentAmount >= 10) currentAmount -= 10;
                    else if (currentAmount >= 5) currentAmount -= 5;
                    else if (currentAmount >= 2) currentAmount -= 2;
                    else currentAmount -= 1;
                }
            }
            System.out.println(total);

        } catch (Exception e) {
            System.out.println("not found");
        }
    }
}
