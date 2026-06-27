import java.util.Scanner;

public class q104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
                "1. What is the capital of India?",
                "2. Which language is used for Android development?",
                "3. What is 10 + 20?"
        };

        String[][] options = {
                {"A. Delhi", "B. Mumbai", "C. Kolkata", "D. Chennai"},
                {"A. Python", "B. Java", "C. C", "D. HTML"},
                {"A. 20", "B. 25", "C. 30", "D. 40"}
        };

        char[] answers = {'A', 'B', 'C'};

        int score = 0;

        System.out.println("===== QUIZ APPLICATION =====");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = Character.toUpperCase(sc.next().charAt(0));

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer is " + answers[i]);
            }
        }

        System.out.println("\n===== RESULT =====");
        System.out.println("Your Score: " + score + "/" + questions.length);

        sc.close();
    }
}