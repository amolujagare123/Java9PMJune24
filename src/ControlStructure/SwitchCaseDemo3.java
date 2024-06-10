package ControlStructure;

public class SwitchCaseDemo3 {

    public static void main(String[] args) {

        // 1,2,3,4,5,6,7,8,9,10 - each number represent one color
        // print that color


       // double color = 5.5;
         char color ='a';

        switch (color)
        {
            case 1 :
                System.out.println("Black");
                break;
            case 2 :
                System.out.println("Red");
                break;
            case 3 :
                System.out.println("Blue");
                break;
            case 4 :
                System.out.println("Green");
                break;
            case 5 :
                System.out.println("Violet");
                break;
            case 6 :
                System.out.println("Purple");
                break;
            case 7 :
                System.out.println("White");
                break;
            case 8 :
                System.out.println("Magenta");
                break;
            case 9 :
                System.out.println("Pink");
                break;
            case 10 :
                System.out.println("Gray");
                break;
            default:
                System.out.println("wrong");
                break;


        }

    }
}
