package com.epam.rd.autotasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input
        ArrayList <Integer> sequence = new ArrayList<>();
        int i = 0;

        do {
            sequence.add(scanner.nextInt());
            i++;
        } while (sequence.get(i - 1) != 0);

        int result = 0;

        for (int j = 0; j < sequence.size() - 1; j++) {
            result += sequence.get(j);
        }

        result /= (sequence.size() - 1);

        System.out.println(result);

    }

}