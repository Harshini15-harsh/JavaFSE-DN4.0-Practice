import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Forecast {
    public static void main(String[] args) {
        String filePath = "revenue.txt";
        double sum = 0;
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                double revenue = Double.parseDouble(line);
                sum += revenue;
                count++;
            }

            if (count > 0) {
                double avg = sum / count;
                System.out.println("Forecasted revenue for next month: Rs " + avg);
            } else {
                System.out.println("No revenue data found.");
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number in file.");
        }
    }
}
