import java.util.Random;

public class duplicateArray {
    public static String[] duplicate(String[] array){
        String[] secondArray = new String[array.length];
        for (int i=0;i <=array.length-1;i++){
            secondArray[i] = array[i];
        }
        return secondArray;
    }
    public static void main(String[] args){
        String[] mainArray = new String[50];
        Random generator = new Random();
        for(int i=0;i <= mainArray.length-1;i++){
            mainArray[i] = String.valueOf(generator.nextInt(500));
        }
        String[] secondArray = duplicate(mainArray);
        System.out.println(mainArray[5]+" "+secondArray[5]);
    }
}
