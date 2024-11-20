import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class QuestionPull {
    public List<Question> getQuestions() {
        List<Question> questions = new ArrayList<>();
        String query = "SELECT * FROM questions";

        try (Connection conn = Database.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                String question = rs.getString("question_text");

                List<String> options = List.of(
                        rs.getString("option1"),
                        rs.getString("option2"),
                        rs.getString("option3"),
                        rs.getString("option4")
                );

                int correctOption = rs.getInt("correct_option");

                questions.add(new Question(question, options, correctOption));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return questions;
    }
}
