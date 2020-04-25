//Write the definition of a class Counter containing:
//An instance variable named counter of type int.
//An instance variable named limit of type int.
//A static int variable named nCounters which is initialized to 0.
//A constructor taking two int parameters that assigns the first one to counter and the second one to limit. It also adds one to the static variable nCounters.
//A method named increment. It does not take parameters or return a value; if the instance variable counter is less than limit, increment just adds one to the instance variable counter.
//A method named decrement that also doesn't take parameters or return a value; if counter is greater than zero, it just subtracts one from the counter.
//A method named getValue that returns the value of the instance variable counter.
//A static method named getNCounters that returns the value of the static variable nCounters.

public class Counter{
    public static void main(String[] args){
        SplitString splitter = new SplitString();
        String[] main = splitter.splitString("This is a test string");
        for (String item:main){
            System.out.println(item);
        }
    }
}