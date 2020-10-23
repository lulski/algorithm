import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        // int[] numbers = { 100, 300, 200 };
        // int[] numbers;
        String fileToGet = "randomNumber.txt";
        Path path = Paths.get(fileToGet);
        long lineCount;
        int arraySize;

        try (Stream<String> stream = Files.lines(path)) {
            lineCount = stream.count();
            arraySize = ((Number) lineCount).intValue();

            try (BufferedReader in = new BufferedReader(new FileReader(fileToGet));) {
                String strNumber;
                int[] numbers = new int[arraySize];
                int arrayIdx = 0;
                while ((strNumber = in.readLine()) != null) {
                    numbers[arrayIdx] = Integer.parseInt(strNumber);
                    arrayIdx++;
                }

                System.out.println(numbers.length);

                Arrays.sort(numbers);

                int position = BinarySearch.rank(300, numbers);
                // int position = Arrays.binarySearch(numbers, 300);

                System.out.println(position);

            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
