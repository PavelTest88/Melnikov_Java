import java.util.Scanner;

public class Test_2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("Vyacheslav")) 
            {System.out.println("Hello, Vyacheslav");} 
            else { System.out.println("Name not found");}}}}