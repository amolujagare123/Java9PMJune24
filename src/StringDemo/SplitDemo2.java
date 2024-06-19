package StringDemo;

public class SplitDemo2 {

    public static void main(String[] args) {

        String str = "Hey baby you are so lovely";
        String[] stArr = str.split(" ");

        // words that ends with 'y' .

        /*for(int i=0; i<stArr.length ;i++) {

           String temp = stArr[i];

           if(temp.charAt(temp.length() - 1) == 'y')
               System.out.println(stArr[i]);
        }*/

        for(int i=0; i<stArr.length ;i++) {


            if(stArr[i].endsWith("y"))
                System.out.println(stArr[i]);
        }

    }
}
