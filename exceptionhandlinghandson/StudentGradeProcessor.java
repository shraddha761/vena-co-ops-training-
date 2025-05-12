package exceptionhandlinghandson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StudentGradeProcessor {
    public static void main(String[] args) {
        String filePath = "";

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter the path to the file: ");
        String userInput = inputScanner.nextLine();

        if(!userInput.trim().isEmpty()){
            filePath = userInput.trim();
        }

        List<String> validStudents = new ArrayList<>();
        List<String> failingStudents = new ArrayList<>();
        int countGrades = 0;
        int sumGrades = 0;

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter("results.txt"))){


            String line;

            while((line = reader.readLine()) != null){
                String[] parts = line.trim().split("\\s+");

                if(parts.length != 2){
                    System.out.println("Warning: Invalid format, skipping line: " + line);
                    continue;
                }

                String name = parts[0];
                String gradeStr = parts[1];

                int grade;

                try{
                    grade = Integer.parseInt(gradeStr);
                    if(grade < 0 || grade > 100){
                        throw new InvalidGradeException("Grade out of range: " + name + ": " + gradeStr);
                    }
                    validStudents.add(name + " " + grade);
                    sumGrades += grade;
                    countGrades++;
                    if(grade < 40){
                        failingStudents.add(name);
                    }
                }catch (NumberFormatException e){
                    System.err.println("Warning: Non-numeric grade for: " + name + ", skipping line: " + line);
                }
                catch (InvalidGradeException e){
                    System.err.println("Warning: Invalid grade: " + e.getMessage() + ", skipping line.");
                }
            }

            writer.write("Valid Student Grades:\n");
            System.out.println("\nValid Student Grades:");
            for (String entry : validStudents) {
                writer.write(entry + "\n");
                System.out.println(entry);
            }

            writer.write("\nFailing Students (<40):\n");
            System.out.println("\nFailing Students (<40):");
            if (failingStudents.isEmpty()) {
                writer.write("None\n");
                System.out.println("None");
            } else {
                for (String name : failingStudents) {
                    writer.write(name + "\n");
                    System.out.println(name);
                }
            }

            if (countGrades > 0) {
                double average = (double) sumGrades / countGrades;
                writer.write(String.format("\nAverage Grade: %.2f\n", average));
                System.out.printf("\nAverage Grade: %.2f\n", average);
            } else {
                writer.write("\nNo valid grades to calculate average.\n");
                System.out.println("\nNo valid grades to calculate average.");
            }

            System.out.println("\nResults have also been written to 'results.txt'.");

        }catch (FileNotFoundException e){
            System.err.println("Error: File not found: " + filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}