import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        // int[] numbers = { 100, 300, 200 };
        // int[] numbers;

        try (BufferedReader in = new BufferedReader(new FileReader("randomNumber.txt"));) {
            String strNumber;
            int[] numbers = new int[100000];
            int arrayIdx = 0;
            while ((strNumber = in.readLine()) != null) {
                numbers[arrayIdx] = Integer.parseInt(strNumber);
            }

            System.out.println(numbers.length);

            int position = BinarySearch.rank(300, numbers);

            System.out.println(position);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
