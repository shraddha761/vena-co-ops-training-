package fileioworksheet;

import java.io.*;

public class LogFileAnalyzer {

    public static void main(String[] args) {
        // Default file names
        String inputFile = "server.log";
        String outputFile = "summary.txt";

        // Use command-line arguments if provided
        if (args.length >= 2) {
            inputFile = args[0];
            outputFile = args[1];
        }

        int totalLines = 0;
        int errorCount = 0;
        int warningCount = 0;

        // Try-with-resources for reading the log file
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;

            // Read and analyze line by line
            while ((line = reader.readLine()) != null) {
                totalLines++;
                if (line.contains("ERROR")) {
                    errorCount++;
                }
                if (line.contains("WARNING")) {
                    warningCount++;
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("Input file not found: " + inputFile);
            return;
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        // Try-with-resources for writing the summary
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("Log Summary Report\n");
            writer.write("------------------\n");
            writer.write("Total log entries: " + totalLines + "\n");
            writer.write("ERROR entries: " + errorCount + "\n");
            writer.write("WARNING entries: " + warningCount + "\n");

            // Bonus: percentages
            if (totalLines > 0) {
                double errorPercentage = (errorCount * 100.0) / totalLines;
                double warningPercentage = (warningCount * 100.0) / totalLines;
                writer.write(String.format("ERROR percentage: %.2f%%\n", errorPercentage));
                writer.write(String.format("WARNING percentage: %.2f%%\n", warningPercentage));
            }

            System.out.println("Summary written to " + outputFile);
        } catch (IOException e) {
            System.err.println("Error writing summary: " + e.getMessage());
        }
    }
}
