package WrapperClass;

public class WrapperClassDemo {

    public static void main(String[] args) {

        int i = 5;
        System.out.println("i="+i);

        Integer ii = new Integer(5); // boxing or wrapping
        System.out.println("ii="+ii);

        Integer ii2 = new Integer(i);
        System.out.println("ii="+ii2);

        Integer ii3 = 15; // auto boxing or auto wrapping
        Integer ii4 = i;

        int j1 = ii3.intValue();
        System.out.println("j1="+j1);// unboxing or unwrapping

        int j2 = ii3;
        System.out.println("j2="+j2); // auto unboxing or auto unwrapping

        Character cc = new Character('y');

        char ch1 = cc.charValue();
        char ch2 = cc;

       // double d  = (double) 88;
       // JavaScriptExecutor js = (JavaScriptExecutor) driver;


    }
}
