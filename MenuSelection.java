import java.util.Scanner;
public class MenuSelection {
    public static void main(String[]args){
        int age = 22;
        String choice;
        Scanner stdin = new Scanner(System.in);
        choice = stdin.nextLine();

        if (age > 21){
            if (choice.equals("S")){
                System.out.println("cabernet");
            }else if (choice.equals("T")){
                System.out.println("chardonnay");
            }else if (choice.equals("B")){
                System.out.println("IPA");
            }else{
                System.out.println("invalid menu selection");
            }
        }else{
            if (choice.equals("S")){
                System.out.println("vegetable juice");
            }else if (choice.equals("T")){
                System.out.println("cranberry juice");
            }else if (choice.equals("B")){
                System.out.println("soda");
            }else{
                System.out.println("invalid menu selection");
            }
        }


    }
}
