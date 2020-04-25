public class ChapterFive20718 {
    public static int max(int a, int b, int c){
        int largerFirst = ((a>b) ? a:b);
        return ((largerFirst > c) ? largerFirst:c);
    }
    public static void main(String[] args){
        System.out.println(max(1,2,3));
    }
}
