import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {

    private List<Question> questions;

    public Quiz() {
        this.questions = new QuestionPull().getQuestions();
    }

    public void start() {

        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            List<String> options = question.getOptions();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) +  ". " + options.get(i));
            }
            System.out.print("Choose your answer from 1-4: ");
            int userAnswer = scanner.nextInt();

            if (question.isCorrectAnswer(userAnswer)) {
                System.out.println("Correct!");
            }
            System.out.println();
        }
        System.out.println("Quiz finished!");
        scanner.close();
    }
}
