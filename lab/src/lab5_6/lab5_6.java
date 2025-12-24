package lab5_6;
import java.util.Scanner;

class Media {
	protected String title;
	
	public Media(String title) {
		this.title = title;
	}
	
	public void process() {
		System.out.println("Starting generic media processing.");
	}
}

class Video extends Media {
	protected int duration;
	
	public Video(String title, int duration) {
		super(title);
		this.duration = duration;
	}
	@Override
	public void process() {
		System.out.println("Processing video: " + title + " for " + duration + " minutes.");
	}
}

class Audio extends Media {
	protected String quality;
	
	public Audio(String title, String quality) {
		super(title);
		this.quality = quality;
	}
	@Override
	public void process() {
		System.out.println("Processing audio: " + title + " with " + quality + " quality.");
	}
}

class Processor {
	public static void runProcessor(Media m) {
		m.process();
	}
}

public class lab5_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNextLine()) {
			String vTitle = scanner.nextLine();
			int vDuration = 0;
			if (scanner.hasNextInt()) {
				vDuration = scanner.nextInt();
				scanner.nextLine();
			}
			String aTitle = scanner.nextLine();
			String aQuality = scanner.nextLine();
			Media video = new Video(vTitle, vDuration);
			Media audio = new Audio(aTitle, aQuality);
			System.out.println("--------Output--------");
			Processor.runProcessor(video);
			Processor.runProcessor(audio);
		}
		scanner.close();
	}
}