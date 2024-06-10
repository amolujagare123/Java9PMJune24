package loops;

public class incDec1 {

    public static void main(String[] args) {
/*a++ / a- - : first the statement will execute
then the increment or decrement will happen

++a / - - a: first the increment or decrement will
happen then the statement will execute
*/
        int i = 10;
        System.out.println(i); // 10
        System.out.println(i++); // 10
        System.out.println(i);// 11
        System.out.println(++i); // 12
        System.out.println(i); // 12

        // 10 10 11 12 12
    }
}
