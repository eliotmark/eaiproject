import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Board board = new Board();
        System.out.println("What is your name?");
        Human user = new Human(sc.next());
        board.displayBoard();
        System.out.println("Hello " + user.name + ". Welcome to Connect 4! A - represents an empty spot. " +
                "x's are your tokens, and o's are the computer's tokens. Please indicate a column to place your token in.");
        int column = sc.nextInt();
    }

//    if(sc.hasNextInt()) {
//        int age = sc.nextInt();
//    } else {
//        System.out.print("That is not a number! Please enter an integer.");
//    }
}
