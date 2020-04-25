import java.util.Random;

public class Arrays {
    public static void main (String[] args){
        final int ARRAY_SIZE = 50;
        int [] numbers  = new int[ARRAY_SIZE];
        Random generate = new Random();
        for (int i=0;i<=49;i++) {
            numbers[i] = generate.nextInt(999);
        }
        for (int current : numbers){
            System.out.println(current);
        }
    }
}
