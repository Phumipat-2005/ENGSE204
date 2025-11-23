package lab1_14;
import java.util.Scanner;
public class lab1_14 {
    public static void main(String[] args) {
    	System.out.print("Enter number : ");
        try (Scanner sc = new Scanner(System.in)) {
        	int rows001;
        	int columns001;
        	rows001 = sc.nextInt();
        	columns001 = sc.nextInt();
            sc.nextLine();
            char[][] map = new char[rows001][columns001];   
            for (int i = 0; i < rows001; i++) {
                String line = sc.nextLine();
                String[] tokens = line.split(" ");
                for (int j = 0; j < columns001; j++) {
                    map[i][j] = tokens[j].charAt(0);
                }
            }
            
            int Minerows001;
            int Minecolumn001;
            Minerows001 = sc.nextInt();
            Minecolumn001 = sc.nextInt();
            if (map[Minerows001][Minecolumn001] == '*') {
                System.out.println("Mine");
            } else {
                int count = 0;
                int[] arrayrows001 = {-1, -1, -1, 0, 0, 1, 1, 1};
                int[] arraycolumns001 = {-1, 0, 1, -1, 1, -1, 0, 1};
                for (int k = 0; k < 8; k++) {
                    int maprows001 = Minerows001 + arrayrows001[k];
                    int mapcolumn001 = Minecolumn001 + arraycolumns001[k];

                    if (maprows001 >= 0 && maprows001 < rows001 && mapcolumn001 >= 0 && mapcolumn001 < columns001) {
                        if (map[maprows001][mapcolumn001] == '*') {
                            count++;
                        }
                    }
                }
                System.out.println("Number of nearby bombs : " + count);
            }
        }
    }
}