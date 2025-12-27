package lab5_10;
import java.util.Scanner;

class ProjectTask {
	protected String description;
	protected int baseHours;
	
	public ProjectTask(String description, int baseHours) {
		this.description = description;
		this.baseHours = baseHours;
	}
	
	public double calculateCost() {
		return baseHours * 50.0;
	}
}

class ComplexTask extends ProjectTask {
	protected double setupFee;
	
	public ComplexTask(String description, int baseHours, double setupFee) {
		super(description, baseHours);
		this.setupFee = setupFee;
	}
	@Override
	public double calculateCost() {
		return (super.calculateCost() * 1.10) + setupFee;
	}
}

class SimpleTask extends ProjectTask {
	public SimpleTask(String description, int baseHours) {
		super(description, baseHours);
	}
	@Override
	public double calculateCost() {
		return super.calculateCost();
	}
}

public class lab5_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextLine()) {
			String cDesc = scanner.nextLine();
			int cHours = scanner.nextInt();
			double cFee = scanner.nextDouble();
			scanner.nextLine();
			String sDesc = scanner.nextLine();
			int sHours = scanner.nextInt();
			ComplexTask complex = new ComplexTask(cDesc, cHours, cFee);
			SimpleTask simple = new SimpleTask(sDesc, sHours);
			ProjectTask[] tasks = {complex, simple};
			for (ProjectTask task : tasks) {
				System.out.println(task.calculateCost());
			}
		}
		scanner.close();
	}
}