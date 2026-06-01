import java.util.Scanner;
import java.util.Random;
public class finalProject {
    public static String getWinner(String c, String u){
        if(c.equals("rock")){
            if (u.equals("rock")){
                return "It was a Tie! Both you and the Computer choose rock.";
            }else if (u.equals("paper")){
                return "You Win! The Computer choose rock!";
            }else {
                return "You lost. The Computer choose rock!";
            }
        } else if(c.equals("paper")){
            if (u.equals("rock")){
                return "You lost. The Computer choose paper!";
            }else if (u.equals("paper")){
                return "It was a Tie! Both you and the Computer choose paper.";
            }else {
                return "You Win! The Computer choose paper!";
            }
        } else {
            if (u.equals("rock")) {
                return "You win! The Computer choose scissors!";
            } else if (u.equals("paper")) {
                return "You lost. The Computer choose scissors!";
            } else {
                return "It was a Tie! Both you and the Computer choose scissors.";
            }
        }
    }
    public static void getUser(){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("=================================================================");
        System.out.print("Choose rock, paper or scissors(all lowercase): ");
        String user = scan.nextLine();
        int comp = rand.nextInt(3);
        String computer;
        if (comp == 0){
            computer = "rock";
        }else if (comp == 1) {
            computer = "paper";
        }else {
            computer = "scissors";
        }
        String w = getWinner(computer, user);
        System.out.println(w);
        System.out.print("Would you like to play again? (yes/no): ");
        String playAgain = scan.nextLine();
        if(playAgain.equals("yes")){
            getUser();
        }else{
            System.out.println("Ok, see you later!");
        }
    }
    public static void main(String[] args){
        System.out.println("=================================================================");
        System.out.println("Welcome to Rock, Paper, Scissors!");
        getUser();
    }
}