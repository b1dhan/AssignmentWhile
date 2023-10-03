import java.util.Scanner;
public class CarGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;
        boolean started = false;

        System.out.println("Welcome to the Car Game");

        while (true) {
            System.out.print("Enter a command (Start/Stop/Quit/Hint): ");
            choice = input.nextLine();

            if (choice.equals("Start")) {
                if (started) {
                    System.out.println("The car is already started.");
                } else {
                    System.out.println("Car has started running.");
                    started = true;
                }
            } else if (choice.equals("Stop")) {
                if (!started) {
                    System.out.println("The car is already stopped.");
                } else {
                    System.out.println("Car stopped.");
                    started = false;
                }
            } else if (choice.equals("Quit")) {
                System.out.println("Thanks for playing.");
                break;
            } else if (choice.equals("Hint")) {
                System.out.println("Type 'Start' to start the car.");
                System.out.println("Type 'Stop' to stop the car.");
                System.out.println("Type 'Quit' to quit the game.");
            } else {
                System.out.println("Invalid command. Type 'Hint' for instructions.");
            }
        }
    }
}

