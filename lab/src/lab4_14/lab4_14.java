package lab4_14;
import java.util.Scanner;

class ScoreBoard {
	
	private final String gameName;
	private final int[] scores;

	public ScoreBoard(String gameName, int[] scores) {
		this.gameName = gameName;
		this.scores = scores; 
	}
	
	public ScoreBoard(ScoreBoard other) {
		this.gameName = other.gameName;
		this.scores = new int[other.scores.length];
		for (int i = 0; i < other.scores.length; i++) {
			this.scores[i] = other.scores[i];
		}
	}
	
	public void displayScores() {
		System.out.println(this.gameName + ": " + this.scores[0] + ", " + this.scores[1] + ", " + this.scores[2]);
	}
}

public class lab4_14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextLine()) {
			String name = scanner.nextLine();
			int s1 = scanner.nextInt();
			int s2 = scanner.nextInt();
			int s3 = scanner.nextInt();
			int modValue = scanner.nextInt();
			int[] originalScores = {s1, s2, s3};
			ScoreBoard sb1 = new ScoreBoard(name, originalScores);
			ScoreBoard sb2 = new ScoreBoard(sb1);
			originalScores[0] = modValue;
			System.out.println("--------Output--------");
			sb1.displayScores();
			sb2.displayScores();
		}
		scanner.close();
	}
}