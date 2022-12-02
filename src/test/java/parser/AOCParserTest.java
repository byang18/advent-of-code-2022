package test.java.parser;

import main.java.Parser.AOCParser;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class AOCParserTest {

    final ArrayList<String> fileItems = new ArrayList<String>(
            Arrays.asList("hello", "my", "", "0"));

    @Test
    public void testReadFile() throws IOException {
        ArrayList<String> result = AOCParser.readFile("assets/dummyFile.txt");
        assertAll(
                () -> assertThat(result, equalTo(fileItems))
        );
    }
}
