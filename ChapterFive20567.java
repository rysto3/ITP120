public class ChapterFive20567 {
    public static void dashedLine(int len){
        if (len <= 0){
            //do nothing
        }else {
            for (int i = 0; i <= len - 1; i++) {
                System.out.print("-");
            }
        }

    }
    public static void main(String[] args){
        dashedLine(-50);
    }

}
