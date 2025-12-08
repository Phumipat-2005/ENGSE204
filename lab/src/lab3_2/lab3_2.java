package lab3_2;
import java.util.Scanner;

class Player {
	private int score;
	
	public Player(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public void setScore(int newScore) {
		this.score = newScore;
	}
}

public class lab3_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Score: ");
		int scoreinput = scanner.nextInt();
		System.out.print("Enter New Score: ");
		int newscoreinput = scanner.nextInt();
		Player player001 = new Player(scoreinput);
		player001.setScore(newscoreinput);
		
		System.out.println("-------Output-------");
		System.out.println("Score: " + player001.getScore());
		scanner.close();
	}
}