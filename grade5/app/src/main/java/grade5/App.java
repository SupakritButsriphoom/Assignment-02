/*
 * This source file was generated by the Gradle 'init' task
 */
package grade5;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        int[] scores = new int[10];
        Random r = new Random();
        int low = 40;
        int high = 99;
        @SuppressWarnings("unused")
        int result = r.nextInt(high - low) + low;

        for (int i = 0; i < scores.length; i++) {
            scores[i] = r.nextInt(60) + 40;
            System.out.println("Score of student " + (i + 1) + " is " + scores[i]);
        }

        System.out.println("\nCalculation Grade...");
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            String grade = calculateGrade(score);
            System.out.println("Grade of student " + (i + 1) + " is " + grade);
        }
    }

    public static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B+";
        } else if (score >= 70) {
            return "C+";
        } else if (score >= 60) {
            return "C";
        } else if (score >= 50) {
            return "D+";
        } else if (score >= 40) {
            return "D";
        } else {
            return "F";
        }
    }
}
