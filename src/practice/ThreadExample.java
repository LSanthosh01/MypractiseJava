package practice;
import java.util.Scanner;

class TableThread extends Thread {
    private final int number;

    public TableThread(int number) {
        this.number = number;
        setName("Table-Thread-" + number);
    }

    @Override
    public void run() {
        System.out.println("\n--- Multiplication Table for " + number + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
            try {
                // Keep a tiny sleep just to show the thread processing delay
                Thread.sleep(50); 
            } catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted.");
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int limit = scanner.nextInt();

        System.out.println("\nPrinting tables sequentially using threads...");

        for (int i = 1; i <= limit; i++) {
            TableThread thread = new TableThread(i);
            
            // 1. Start the thread
            thread.start();
            
            try {
                // 2. FORCE the main program to wait until this thread completely finishes
                thread.join(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        scanner.close();
        System.out.println("\nAll tables printed successfully!");
    }
}