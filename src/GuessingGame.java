import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

            int random_number = random.nextInt(10);
            boolean stat=true;
        while (stat) {
            System.out.println("Enter any number between 1-10 or 'exit' to exit the game:");
            String choice = input.nextLine();
            if (choice.equals("exit")){
                stat=false;
                System.out.println("Exiting the game");
            }
            else {
                int user_number = Integer.parseInt(choice);
                if(user_number<1|user_number>10){
                    System.out.println("Enter between 1 and 10");
                }
                else{
                    if (user_number==random_number){
                        System.out.println("Correct Guess! Congrats!");
                        break;
                    }
                    else {
                        stat=true;
                       System.out.println("Wrong guess, try again!");
                    }
                }
            }
        }
    }
}