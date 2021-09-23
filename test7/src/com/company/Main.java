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

            int[] banknotes = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
            int[] notesUsed = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

            while ((line = br.readLine()) != null) {
                currentAmount = Integer.parseInt(line);
                while (currentAmount > 0) {
                    total++;
                    for (int i = 0; i < banknotes.length; i++) {
                        if (currentAmount >= banknotes[i]) {
                            currentAmount -= banknotes[i];
                            notesUsed[i]++;
                            break;
                        }
                    }
                }
            }
            System.out.println(total);
            /*
            for (int i = 0; i < notesUsed.length; i++) {
                System.out.println(banknotes[i] + ": " + notesUsed[i]);
            }
            */

        } catch (Exception e) {
            System.out.println("not found");
        }
    }
}
