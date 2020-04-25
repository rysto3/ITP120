//Calculates the volume and surface area of a sphere.
import java.util.Scanner;
public class SphereMath {
    public static void main(String[] args){
        //Query the users for the diameter of a sphere
        double diameter;
        double surfaceArea;
        double volume;
        double radius;

        //Initialize Keyboard Input
        Scanner keyboard = new Scanner(System.in);

        //Accept user input of diameter. Expects double.
        System.out.print("Enter the diameter of the sphere: ");
        diameter = Float.parseFloat(keyboard.nextLine());

        //Get the radius by dividing user input (diameter) by two.
        radius = diameter/2;

        //Calculate the Surface Area and Volume using user input, and calculated radius.
        surfaceArea = 4*(Math.PI*(Math.pow(radius,2)));
        volume = 4.0/3.0 * Math.PI * Math.pow(radius,3);

        //Dump text and variables to console.
        System.out.println("Area of a sphere with diameter " + diameter + ": " + surfaceArea);
        System.out.print("Volume of a sphere with diameter " + diameter + ": " + volume);
    }
}
