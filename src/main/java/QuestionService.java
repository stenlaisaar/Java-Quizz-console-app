import java.util.ArrayList;
import java.util.Scanner;

public class QuestionService {
    private ArrayList<Question> questions = new ArrayList<>();
    private ArrayList<String> selection = new ArrayList<>();

    public QuestionService() {
        questions.add(new Question(1, "Which of these is a Java data type?", "String", "System", "Scanner", "Main", "String"));
        questions.add(new Question(2, "Which of these is a color on the Estonian flag?", "Red", "Black", "Green", "Yellow", "Black"));
        questions.add(new Question(3, "Which of these is a German car brand?", "Nissan", "Range Rover", "Ford", "BMW", "BMW"));
        questions.add(new Question(4, "Which of these is a clothing item that you put on your feet?", "Socks", "Hat", "Shirt", "Scarf", "Socks"));
        questions.add(new Question(5, "Which of these is a is not an item in minecraft?", "Diamond", "Coal", "Ruby", "Emerald", "Ruby"));
    }

    public void playQuiz() {
        Scanner sc = new Scanner(System.in);

        for (Question q : questions) {
            System.out.println("Question " + q.getId() + ": " + q.getQuestion());
            System.out.println("1. " + q.getOpt1());
            System.out.println("2. " + q.getOpt2());
            System.out.println("3. " + q.getOpt3());
            System.out.println("4. " + q.getOpt4());
            System.out.print("Your answer: ");

            String input = sc.nextLine();
            selection.add(input);
            System.out.println();
        }
    }

    public void printScore() {
        int score = 0;

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            String userAnswer = selection.get(i);

            if (q.getAnswer().equalsIgnoreCase(userAnswer.trim())) {
                score++;
            }
        }

        System.out.println("Game finished, your score: " + score + "/" + questions.size());
    }
}

