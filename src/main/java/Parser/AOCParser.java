package main.java.Parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AOCParser {
    public static ArrayList<String> readFile(String fp) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fp));
        ArrayList<String> items = new ArrayList<String>();
        String line;
        while ( (line = reader.readLine()) != null ) {
            items.add(line);
        }
        return items;
    }
}
