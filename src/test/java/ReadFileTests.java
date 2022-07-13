import org.junit.jupiter.api.Test;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;


public class ReadFileTests {

    @Test
    public void secondLineShouldHabAlloha() throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("src/test/resources/ReadFileTests.txt"), StandardCharsets.UTF_8);

        assertEquals("аллоха", lines.get(1));
    }
}


