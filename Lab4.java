public class Lab4 {
    private String name;
    private int idNumber;
    private double rate;
    private int hours;
    public void newEmployee(String assignedName,int assignedID){
        name = assignedName;
        idNumber = assignedID;
    }
    public void setRate(int inputRate){
        rate = inputRate;
    }
    public void setHours(int inputHours){
        hours = inputHours;
    }
    public double getRate(){
        return rate;
    }
    public String getName(){
        return name;
    }
    public int getID(){
        return idNumber;
    }
    public int getHours(){
        return hours;
    }
    public double grossPlay(){
        return hours*rate;
    }
}
