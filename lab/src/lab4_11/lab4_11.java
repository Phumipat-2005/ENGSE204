package lab4_11;
import java.util.Scanner;

class Configuration {
	
	private final String theme;
	private final int fontSize;
	private final boolean darkMode;
	
	public Configuration(String theme, int fontSize, boolean darkMode) {
		this.theme = theme;
		this.darkMode = darkMode;
		if (fontSize < 10) {
			this.fontSize = 10;
		} else if (fontSize > 20) {
			this.fontSize = 20;
		} else {
			this.fontSize = fontSize;
		}
	}
	
	public Configuration(Configuration base, Configuration user) {
		this.theme = user.theme;
		this.darkMode = user.darkMode;
		this.fontSize = base.fontSize;
	}
	
	public void displaySettings() {
		System.out.println("Theme: " + this.theme + ", Size: " + this.fontSize + ", Dark: " + this.darkMode);
	}
}

public class lab4_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNext()) {
			String bTheme = scanner.next();
			int bSize = scanner.nextInt();
			boolean bDark = scanner.nextBoolean();
			String uTheme = scanner.next();
			int uSize = scanner.nextInt();
			boolean uDark = scanner.nextBoolean();
			
			Configuration baseConfig = new Configuration(bTheme, bSize, bDark);
			Configuration userConfig = new Configuration(uTheme, uSize, uDark);
			Configuration finalConfig = new Configuration(baseConfig, userConfig);
			System.out.println("--------Output--------");
			finalConfig.displaySettings();
		}
		scanner.close();
	}
}