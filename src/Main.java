import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    int age;
    String firstName;
    String favoriteFood;
    System.out.println ("enter your age:");
    age = scanner.nextInt();
    System.out.println ("enter your first name:");
    firstName = scanner.next();
    System.out.println ("what's your favorite food?");
    favoriteFood = scanner.next();
    System.out.println ("First name: " + firstName + " Age: " + age + " Favorite food: " + favoriteFood);

    }

}