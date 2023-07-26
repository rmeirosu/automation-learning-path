import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UdemyJavaCrashCourseS6 {
/*
Lists for 'Using break in Loops' section
 */
    private static List<String> matches = List.of(
            "life",
            "i need",
            "why don't",
            "i can",
            "are you",
            "what",
            "because",
            "sorry"
    );

    private static List<String> responses = List.of(
            "Life? Don't talk to me about life.",
            "Why do you need %1?",
            "Do you really think I don't %1?",
            "How do you know you can't %1?",
            "Why does it matter whether I am %1?",
            "Why do you ask?",
            "Is that the real reason?",
            "There are many times when no apology is needed.",
            "Please tell me more."
    );


/*
https://en.wikipedia.org/wiki/Rock_paper_scissors
Rock beats Scissors beats Paper beats Rock
 */

    private static final int ROCK = 0;
    private static final int PAPER = 1;
    private static final int SCISSORS = 2;
    // final declarations are used to define a constant -> the value can't be changed.
    // constant declarations have to be at a class level.
    // if we make them public instead of private they will be available outside the class as well.

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Random randomGenerator = new Random();

        String playerChoice;
        int playerValue = -1;

        do { // put all the code in a do-while loop to ask the player to play again

            int computerValue = randomGenerator.nextInt(3);
            String computerChoice;

        /*
        CHALLENGE:
        Use if and else to give computerChoice the correct string for the number chosen by the computer.
        If the computer chose zero, for example, then computerChoice should have the value "rock".
         */

            // The code for your solution goes below this comment:
            if (computerValue == ROCK) {
                computerChoice = "rock";
            } else if (computerValue == PAPER) {
                computerChoice = "paper";
            } else {
                computerChoice = "scissors";
            }

            System.out.println("Please select rock, paper or scissors ");
            playerChoice = scanner.nextLine().toLowerCase();

            // Code in 'else' is executed when condition in 'if' evaluates to false
            if (playerChoice.equals("rock")) {
                playerValue = ROCK;
            } else if (playerChoice.equals("paper")) {
                playerValue = PAPER;
            } else if (playerChoice.equals("scissors")) {
                playerValue = SCISSORS;
            } else {
                System.out.printf("%s is not a valid choice.%n", playerChoice);
            }

            // See who chose what
            System.out.printf("Computer chose: %s, Player chose: %s%n", computerChoice, playerChoice);

            // 'if' conditions to determine who wins
            if (playerValue == computerValue) {
                System.out.println("It's a draw!");
            } else if ((playerValue - 1 == computerValue)
                    || (playerValue == ROCK && computerValue == SCISSORS)) {
                System.out.println("Player wins!");
            } else {
                System.out.println("The computer wins...");
            }
        } while (getYesOrNo("Do you want to play again?"));

        // Call lesson for Switch statement
        SimpleMenu();

        // Call lesson for 'Using break in loops'
        ListSearch();

        // Call lesson for 'Ternary Conditional Operator'
        Ternary();

        scanner.close();


    }

    /**
     * Returns a boolean response to a yes/no question.
     *
     * @param question The question to be asked.
     * @return True if the answer was yes, False if no.
     */
    public static boolean getYesOrNo(String question) {
        String answer;

        while (true) { // infinite loop. return will exit the method, thus terminating the loop
            System.out.printf("%s%n", question);
            answer = scanner.nextLine();
            answer = answer.toLowerCase();

            if (answer.equals("y")) {
                return true;
            }

            if (answer.equals("n")) {
                return false;
            }
        }
    }

    // Switch Statement
    public static void SimpleMenu() {
        String userChoice;

        System.out.println("Please choose one of the following options");
        System.out.println("1 - Cappucino");
        System.out.println("2 - Latte");
        System.out.println("3 - Americano");
        System.out.println("4 - Mocha");
        System.out.println("5 - Macchiato");
        System.out.println("6 - Espresso");
        System.out.println("Q - Quit the program");

        do {
            userChoice = scanner.nextLine();
            userChoice = userChoice.toLowerCase();
            System.out.println("You chose " + userChoice);

            switch (userChoice) {
                case "1":
                    System.out.println("Making Cappucino...");
                    System.out.println("Steam the milk");
                    System.out.println("Froth the milk");
                    System.out.println("Make espresso");
                    System.out.println("Add the milk to the espresso.");
                    break;
                case "2":
                    System.out.println("Making Latte...");
                    System.out.println("Make espresso");
                    System.out.println("Steam the milk");
                    System.out.println("Add the milk to the espresso.");
                    break;
                case "3":
                    System.out.println("Making the Americano...");
                    break;
                case "4":
                    System.out.println("Making Mocca...");
                    break;
                case "5":
                    System.out.println("Making Macchiato...");
                    break;
                case "6":
                    System.out.println("Making Espresso...");
                    break;
                default:
                    System.out.println("Returning coins");
//                    break; // break statement causes execution to leave the switch -> go to sout "dispensing coffee"
                    continue; // continue causes the enclosing loop to skip any further instructions -> go to while
            }

//            break; // breaks out of the do while loop
            System.out.println("Dispensing coffee");
            System.out.println("Have a nice day!");

        } while (!userChoice.equals("q"));
    }

    public static void ListSearch() {

        //                  0123456789
        String userInput = "I think I need to learn Java";
        String output = "";

        for (int index = 0; index < matches.size(); index++) {

            String match = matches.get(index);
            int position = userInput.toLowerCase().indexOf(match);

            if (position > -1) {
                // found a match
                output = responses.get(index);
                break;
            }
        }

        // If there wasn't a match, use the last item in the responses list.
        if (output.isEmpty()) {
            output = responses.get(responses.size() - 1);
        }

        System.out.println(output);
    }

    //Ternary conditional operator
    public static void Ternary() {

        System.out.println("What day is it?");
        String day = scanner.next();
        String howToSpendTime;

//      Simple if statement:
//        if (day.toLowerCase().equals("saturday")) {
//            howToSpendTime = "Relax";
//        } else {
//            howToSpendTime = "Work";
//        }

//      Ternary conditional operator:
        howToSpendTime = day.toLowerCase().equals("saturday") ? "Relax" : "Work";
        /*
        day.toLowerCase().equals("saturday") is the condition for ternary conditional operator
        condition is followed by a question mark
        and then the value to assign if true and value to assign if false
         */
        System.out.printf("%s on %s %n", howToSpendTime, day);
    }
}

