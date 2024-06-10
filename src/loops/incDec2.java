package loops;

public class incDec2 {

    public static void main(String[] args) {
/*a++ / a- - : first the statement will execute
then the increment or decrement will happen

++a / - - a: first the increment or decrement will
happen then the statement will execute
*/
        int i = 10;
        System.out.println(i); // 10
        System.out.println(i--); // 10
        System.out.println(i);// 9
        System.out.println(--i); // 8
        System.out.println(i); // 8

        // 10 10 9 8 8
    }
}
