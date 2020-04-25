//Mortgage Calculator. Takes the principal, interest rate, and the length, and converts it into monthly payments.


import javax.swing.*;

public class MortgageCalculator {
    public static void main(String[] args) {

        int principal = 0;
        double rate = 0;
        int numPayments = 0;
        double monthlyPayments = 0; // Calculated monthly payments variable
        double totalCost = 0; // Total cost of the loan including interest.
        double interestPaid = 0;
        //Variables initialized.

        //Collect data from user
        principal = Integer.parseInt(JOptionPane.showInputDialog("Enter the total amount you're borrowing. (Principal)"));
        rate = (Double.parseDouble(JOptionPane.showInputDialog("Enter your annual interest rate."))/100)/12; // Divided by 12 to get the monthly interest rate
        numPayments = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of years you're borrowing for."))*12;//Multiplied times 12 to get the number of months.

        //Begin math formula

        monthlyPayments = (principal*((rate*Math.pow(1+rate,numPayments))/((Math.pow(1+rate,numPayments))-1)));
        //monthlyPayments = principal * (((rate*(1+rate))^Payments)/((1+rate)^Payments - 1))

        totalCost = monthlyPayments * numPayments;
        interestPaid = totalCost - principal;
        monthlyPayments = Math.round(monthlyPayments);//Java liked to throw an error if I tried to do this in String.format, so I decided to just do it before.

        JOptionPane.showMessageDialog(null,String.format("Your monthly payments would be %.2f.\nYour total cost, including interest is %.2f.\nYour total interest paid is %.2f.",monthlyPayments,totalCost,interestPaid));
    }
}
