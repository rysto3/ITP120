public class Amortization {
    private double loanAmount; // Initialize loanAmount
    private double interestRate; // Initialize interestRate
    private double loanBalance; // Initialize loanBalance
    private double term; // Initialize term
    private double payment; // Initialize payment
    private int loanYears; // Years of Loan

    public Amortization(double loan, double rate, int years){
        loanAmount = loan; // loanAmount = loan argument
        loanBalance = loan; // loanBalance = loan argument
        interestRate = years; // interestRate = years argument
        calcPayment(); // Run calcPayment class
    }

    private void calcPayment(){
        //Calculate the value of the Term.
        term = Math.pow((1+interestRate/12.0),12.0 * loanYears);

        //Calculate monthly payment
        payment = (loanAmount * interestRate/12 * term) / (term - 1);
    }
}
