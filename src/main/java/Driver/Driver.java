package main.java.Driver;

import java.io.IOException;

import main.java.Day.*;

public class Driver {
    public static void main(String[] args) throws IOException {
        final int DAY = 1;
        int[] results = solve(DAY);
        System.out.println(String.format("Results: %d, %d", results[0], results[1]));
    }

    public static int[] solve(int dayNumber) throws IOException {
        final int[] EMPTY = {};
        int[] results = new int[2];
        switch (dayNumber) {
            case 1:
                results[0] = Day1.solvePart1();
                results[1] = Day1.solvePart2();
                return results;
            default:
                return EMPTY;
        }
    }
}

