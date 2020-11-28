import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private int numberOfRounds;
    ArrayList<String> categories;
    ArrayList<String> kinds;
    ArrayList<String> questions;
    ArrayList<String> answers;
    ArrayList<String> correctAnswers;

    public Game () {
        this.numberOfRounds = 1;
    }

    public Game (int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }

    public Game (String categories, String kinds, String questions, String answers, String correctAnswers) {
        this.categories = new ArrayList<>();
        this.categories.add("Music");
        this.categories.add("Books");
        this.categories.add("TV Series/ Movies");
        this.categories.add("Travelling");

        this.kinds = new ArrayList<>();
        this.kinds.add("Correct Answer");
        this.kinds.add("Bet");

        this.questions = new ArrayList<>();
        this.answers = new ArrayList<>();
        this.correctAnswers = new ArrayList<>();
    }

    public int setRounds (int numberOfRounds) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("From 1 to 10.");
        System.out.println("How many rounds do you want to play?");
        this.numberOfRounds = scanner.nextInt();
        scanner.nextLine();

        return this.numberOfRounds;
    }

    public int setRandomRounds () {
        Random rand = new Random();
        do {
            this.numberOfRounds = rand.nextInt(11);
        } while (this.numberOfRounds != 0);

        return this.numberOfRounds;
    }
}