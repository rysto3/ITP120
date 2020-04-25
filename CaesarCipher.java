import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CaesarCipher {
    //ASCII Capitals are 65 to 90. 32 is Whitespace.
    private static char shiftCharacter(char c,int shiftBy) {
        int finalASCII = 32; //Default the returned character to whitespace.
        if (!Character.isWhitespace(c)) {
            int startingASCII = (int) c; //Cast the c variable to an int to get it's ASCII character value
            finalASCII = startingASCII + shiftBy;
            if (finalASCII > 90) {//It's gonna go past the end of the capital letters.
                finalASCII = 64 + (finalASCII - 90); //Wrap it back around to A.
            }
            if (finalASCII < 65) { //It's going to be before the beginning of the capital letters
                finalASCII = 90 - (64 - finalASCII);
            }
        }
        return (char) finalASCII;
    }
    private static String concatenation(char[] array){ //This creates a string from an array.
        String toReturn = ""; // Default is an empty string.
        for (char current:array){
            toReturn = toReturn+current; //Appends the current char in the array to the String.
        }
        return toReturn; //Returns the string to the caller.
    }
    private static String encryptText(String plaintext){ //Encryption class. Accepts plaintext string from the scanner.
        char[] textArray = plaintext.toCharArray(); //Converts the plaintext string into an array of characters
        char[] shiftedArray = new char[textArray.length]; //Stores the encrypted characters.
        for (int i = 0;i<=textArray.length-1;i++){
            shiftedArray[i] = shiftCharacter(textArray[i],8);
        }
        return concatenation(shiftedArray); //Sends the character array to the concatenation class, and then returns it to the caller.
    }
    private static String decryptText(String ciphertext){
        char[] textArray = ciphertext.toCharArray(); // Converts the plaintext string into an array of characters
        char[] shiftedArray = new char[textArray.length];
        for (int i = 0;i<=textArray.length-1;i++){
            shiftedArray[i] = shiftCharacter(textArray[i],-8);
        }
        return concatenation(shiftedArray); //Sends the character array to the concatenation class, and then returns it to the caller.
    }
    public static void main (String[] args) throws IOException{
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Would you like to encrypt or decrypt?");
        String action = keyboard.next(); //Accepts Encrypt or Decrypt command.
        action.toLowerCase(); // Make it lowercase for easier matching.
        if (action.matches("encrypt")|| action.matches("decrypt")){//Ensures proper input from user, or there's no need to do anything else.
            System.out.print("Okay we will "+action+" the file. \n Enter the name of the file to "+action+": ");
            String fileName = keyboard.next();
            File file = new File(fileName);
            Scanner inputFile = new Scanner(file);
            System.out.print("What would you like the output file name to be: ");
            String outputFileName = keyboard.next();
            FileWriter outputFile = new FileWriter(outputFileName);
            if (action.matches("encrypt")) {
                while (inputFile.hasNext()) {//Continues to read the file until there's none left.
                    outputFile.append(encryptText(inputFile.nextLine()));
                    outputFile.append("\n");
                }
            }
            if (action.matches("decrypt")) {
                while (inputFile.hasNext()) {//Continues to read the file until there's none left.
                    outputFile.append(decryptText(inputFile.nextLine()));
                    outputFile.append("\n");
                }
            }
            outputFile.close();//Finalizes the file export to the disk.
            System.out.println(fileName+" has been "+action+"ed to "+outputFileName);//Confirms to the user that the action has been complete.
        }
    }
}
