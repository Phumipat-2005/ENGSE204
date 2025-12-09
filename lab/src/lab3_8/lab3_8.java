package lab3_8;
import java.util.Scanner;

class InventoryItem {
    private String productName;
    private int stock;
    
    public InventoryItem(String productName, int initialStock) {
        this.productName = productName;
        if (initialStock >= 0) {
            this.stock = initialStock;
        } else {
        	this.stock = 0;
        }
    }
    
    public String getProductName() {
        return productName;
    }
    
    public int getStock() {
        return stock;
    }

    public void addStock(int amount) {
        if (amount > 0) {
            this.stock += amount;
            System.out.println("-------Output-------");
            System.out.println("Stock added.");
        } else {
            System.out.println("Invalid amount.");
        }
    }
    
    public void sellStock(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > this.stock) {
            System.out.println("Not enough stock.");
        } else {
            this.stock -= amount;
            System.out.println("Sale successful.");
        }
    }
}

public class lab3_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Product name: ");
        String inputProductname = scanner.nextLine();
        System.out.print("Enter initial stock: ");
        int inputInitialstock = scanner.nextInt();
        
        InventoryItem item = new InventoryItem(inputProductname, inputInitialstock);
        System.out.print("Enter number loop for ADD or SELL: ");
        int N = scanner.nextInt();
        System.out.print("ADD or SELL: ");
        String[] commandList = new String[N];
        int[] amountList = new int[N];
        for (int i = 0; i < N; i++) {
            commandList[i] = scanner.next();
            amountList[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            if (commandList[i].equalsIgnoreCase("ADD")) {
                item.addStock(amountList[i]);
            } else if (commandList[i].equalsIgnoreCase("SELL")) {
                item.sellStock(amountList[i]);
            }
        }
        
        System.out.println("Final Stock: " + item.getStock());
        scanner.close();
    }
}