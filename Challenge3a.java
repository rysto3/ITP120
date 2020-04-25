import java.util.Scanner;
public class Challenge3a {
    public static void main (String[]args){
        //Set the variables for air and water
        int air = 1100;
        int water = 4900;

        //Initialize the keyboard scanner
        Scanner keyboard = new Scanner(System.in);

        //Collect the choice of air or water from the user, and then the distance that the sound wave will travel
        String choice = keyboard.nextLine();
        double distance = keyboard.nextDouble();

        //Determine if the user entered air or water
        if (choice.equals("air")) {
            //If air, then print out the distance traveled by the medium
            System.out.println(distance / air);
        }else if (choice.equals("water")){
            //If water, then print out the distance traveled by the medium
            System.out.println(distance / water);
        }
    }
}

