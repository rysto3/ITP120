import javax.swing.*;

public class HalsCommission {
    public static void  main(String[] args){
        /* This program calculates the sales commission for sales people. */
        String input; // User input
        double sales; // Monthly sales
        double rate; // Commission Rate
        double commission; // Amount of Commission
        double advance; // Advanced Pay
        double pay; // Sales Person's Pay
        // Variables initialized. Being program.
        input = JOptionPane.showInputDialog("Enter the amount " + "of monthly sales.");
        sales = Double.parseDouble(input);

        //Get the advanced pay.
        input = JOptionPane.showInputDialog("Enter the amount " + "of advance pay.");

        advance = Double.parseDouble(input);

        //Calculate rate.
        if (sales < 10000)
            rate = 0.05;
        else if (sales < 15000)
            rate = 0.1;
        else if (sales < 18000)
            rate = 0.12;
        else if (sales < 22000)
            rate = 0.15;
        else
            rate = 0.16;

        //Calculate the amount of commission.
        commission = rate * sales;

        //Calculate sales person's advance pay.
        pay = commission - advance;

        //Display the sales person's commission rate and pay
        JOptionPane.showMessageDialog(null,String.format("Commission rate is %,.2f. The amount of pay is $%,.2f",rate,pay));

    }
}
