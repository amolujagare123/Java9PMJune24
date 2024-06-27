package Methods;

import java.util.Date;

public class MethodsReturningValues {
    int a,b;

    int myMethod()
    {
        int c = a + b;
        int x = 25;
        return x ;
    }

    public static void main(String[] args) {

         int y ;
         y = 30 ;

         int x = y ;
         System.out.println(y);

        MethodsReturningValues ob  = new MethodsReturningValues();


        int value = ob.myMethod();

        System.out.println("value="+value);

        System.out.println(ob.myMethod());
    }

}
