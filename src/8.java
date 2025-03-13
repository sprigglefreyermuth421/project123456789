import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Enter the date");
        Scanner input = new Scanner(System.in);
        String dateString = input.next();
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        Date date = format.parse(dateString);
        System.out.println("Hello, World!" + date);
    }
} 
