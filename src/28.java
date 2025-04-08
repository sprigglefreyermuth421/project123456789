import java.util.Random;

public class MyProjectExample {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(100);
        System.out.println("Random number generated: " + randomInt);
    }
}
