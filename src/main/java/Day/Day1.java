package main.java.Day;

import main.java.Parser.AOCParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import static main.java.Util.Util.pathTemplateString;

public class Day1 {

    public static int solvePart1() throws IOException {
        ArrayList<String> data = AOCParser.readFile(String.format(pathTemplateString, 1));
        int maxSum = 0;
        int currSum = 0;

        for (String item : data) {
            if (item.equals("")) {
                maxSum = Math.max(currSum, maxSum);
                currSum = 0;
            }
            else {
                currSum += Integer.parseInt(item);
            }
        }

        return maxSum;
    }

    public static int solvePart2() throws IOException {
        ArrayList<String> data = AOCParser.readFile(String.format(pathTemplateString, 1));
        ArrayList<Integer> sums = new ArrayList<Integer>();
        int currSum = 0;
        for (String item : data) {
            if (item.equals("")) {
                sums.add(currSum);
                currSum = 0;
            }
            else {
                currSum += Integer.parseInt(item);
            }
        }

        sums.sort(Comparator.reverseOrder());

        int[] out = new int[3]; // Get first 3 elements of array
        for (int i = 0; i < 3; i ++ ) {
            out[i] = sums.get(i);
        }

        return Arrays.stream(out).sum();
    }
}
