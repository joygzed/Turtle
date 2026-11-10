import java.util.Scanner;

public class magic
8ball {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Magic 8 Ball!");
        System.out.println("Ask me a yes/no question:");
        String question = input.nextLine();

        int number = (int)(Math.random() * 8);
        String response;

       
        if (number == 0) {
            response = "It is certain.";
        } else if (number == 1) {
            response = "Ask again later.";
        } else if (number == 2) {
            response = "Don't count on it.";
        } else if (number == 3) {
            response = "Yes, definitely.";
        } else if (number == 4) {
            response = "Most likely.";
        } else if (number == 5) {
            response = "I cannot tell right now.";
        } else if (number == 6) {
            response = "My answer is no.";
        } else {
            response = "Very doubtful.";
        }

        System.out.println("You asked: " + question);
        System.out.println("The Magic 8 Ball says: " + response);

        input.close();
    }
}