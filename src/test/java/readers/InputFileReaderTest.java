package readers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InputFileReaderTest {
    String fileName;

    @Test
    void readFileTest() {
        InputFileReader.path = "D:\\work\\repository\\test-project\\src\\test\\resources\\";
        fileName = "input.txt";
        String[] input = InputFileReader.readFile(fileName);
        assertEquals(6, input.length);
        assertEquals("card-1234", input[5]);
    }
}