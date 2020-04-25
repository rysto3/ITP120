// A guessing game where the computer selects a random word, and then has the player guess letter by letter each round. Max 10 rounds.
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main (String[] args){
        Random ran = new Random();
        String[] words = {"green","snake","truck","cloud","penny"};
        String selection = words[ran.nextInt(words.length)]; // Selects a word from the Array.
        System.out.println(selection);
        char[] currentArray; // Created based on user entries
        char[] wordArray; // Created from the selected word.
        wordArray = selection.toCharArray(); // Takes the string 'selection' and turns it into an array.
        boolean victory = false; // Sets victory to its default state, because you haven't won yet.
        int attempts = 0;
        String current = "";
        for (int i=1;i<=selection.length();i++){ //Sets up the initial *'s for the display.
            current = current + "*";
        }
        currentArray = current.toCharArray(); // Converts the initially hidden string to an array of characters for manipulation.
        Scanner keyboard = new Scanner(System.in);
        while (!victory && attempts < 10){
            attempts ++;
            System.out.println("Round "+attempts+": "+new String(currentArray));
            System.out.print("Guess a letter that you think is in the word: ");
            String entry = keyboard.nextLine(); // Accepts player input to the program so that they can guess a letter.
            int check = selection.indexOf(entry); // Since we will need to more than once. It's more efficient to set it as a variable... I think. At least, it's cleaner.
            if (check != -1){
                int end = selection.lastIndexOf(entry); //Finds the last instance of that character.
                if (check == end) { // If there's only one match, then change the current array of letters to represent the revealed letter from the selected word.
                    currentArray[check] = wordArray[check];
                }else{ // If there's more than one match, which there is in the word green, then we need to find the other instances of it.
                    for (int i=check;i<=end;i++){//For each matching character we need to reveal the letters from the corresponding word.
                        currentArray[i] = wordArray[i];
                    }
                }
            }
            //PLAYER INPUT COMPLETE FOR THIS ROUND.
            if (!new String(currentArray).contains("*")){ // Check to see if we still have any asterisks in the currentArray. If we don't, the player won.
                victory = true;
            }
        }
        //NO MORE ROUNDS, OR PLAYER WON.
        if (victory) {
            System.out.println("Congratulations, you won! You guessed the word: " + selection + ".");
        }else {
            System.out.println("Sorry. You lost. The word was " + selection + ".");
        }
    }
}
