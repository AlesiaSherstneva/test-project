package readers;

import java.io.BufferedReader;
import java.io.FileReader;

public class InputFileReader {
    static StringBuilder result;
    static String path = "D:\\work\\repository\\test-project\\src\\main\\resources\\";

    public static String[] readFile(String fileName) {
        result = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path + fileName))) {
            String inputLine = bufferedReader.readLine();
            while (inputLine != null) {
                result.append(inputLine);
                inputLine = bufferedReader.readLine();
            }
        } catch (Exception e) {
            System.out.println("File cannot be read!");
            System.exit(1);
        }
        return result.toString().split(" ");
    }
}