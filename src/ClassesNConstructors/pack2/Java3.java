package ClassesNConstructors.pack2;

import ClassesNConstructors.pack1.Java1;

public class Java3 extends Java1{

    public static void main(String[] args) {

        Java1 ob  = new Java1();
        ob.a = 89 ;
       /* ob.d = 34.67;
        ob.c = 'h';
        ob.str = "text";
        ob.display();*/

        Java3 j3 = new Java3();
      //  j3.d = 90; // private
        j3.a = 89; // public
     //   j3.str = "";  // default
        j3.c = 'g'; // protected

    }
}
