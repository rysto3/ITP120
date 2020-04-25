

public class CircleDemo {
    public static void main(String[] args){
        Circle test = new Circle(5);
        Circle checkCopy = new Circle(test);
        Circle third = new Circle(50);
        System.out.println("Original Circle: "+checkCopy);
        System.out.println("Copied Circle: "+test);
    }
}
