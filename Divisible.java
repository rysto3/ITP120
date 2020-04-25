//ITP - 120 - Lab 3
//Checks the numbers 1 to 100 to see if they're divisible by 3, and then prints it out into a file named "Values.txt"

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Divisible {

    //Creates a method that accepts an integer, and then checks to see if the value is divisible by 3
    public static boolean isDivisibleByThree(int num) {
        //Sets a boolean, defaults to false, that is later returned as to whether or not the inputted number is divisible by 3.
        boolean isDivisible = false;
        if ((num % 3) == 0) {
            //This number is divisible by 3.
            isDivisible = true;
        }
        //Return isDivisible to the caller.
        return isDivisible;
    }

    public static void main(String[] args) throws IOException {
        //Sets up FileWriter and PrintWriter to handle file writing.
        FileWriter writer = new FileWriter("Values.txt", true);
        PrintWriter outputFile = new PrintWriter(writer);
        //Tests values 1 - 100 and writes them to a file named "Values.txt"
        for (int i = 1; i <= 100; i++) {
            outputFile.println(isDivisibleByThree(i));
        }
        //Ensures that Java wrote the file to the disk and not just to memory.
        outputFile.close();
    }
}
