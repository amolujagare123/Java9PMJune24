package StaticNFinal.Demo;


import StaticNFinal.StaticMethodDemo;

/*
import static StaticNFinal.StaticMethodDemo.staticMethod1;
import static StaticNFinal.StaticMethodDemo.staticMethod2;
import static StaticNFinal.StaticMethodDemo.college;
*/

import static StaticNFinal.StaticMethodDemo.*;
//import static StaticNFinal.StaticMethodDemo.staticMethod1;

public class DemoClass {

    void demoMethod()
    {

    }

    public static void main(String[] args) {
       /* StaticMethodDemo obj = new StaticMethodDemo();
        obj.nonStaticMethod1();*/

        staticMethod1();


        staticMethod1();
        staticMethod2();

        college = "";
    }
}
