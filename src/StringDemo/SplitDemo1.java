package StringDemo;

public class SplitDemo1 {

    public static void main(String[] args) {

        String str = "All downloads are provided";
        String[] stArr = str.split(" ");
        //String[] stArr = str.split("o");
       // String[] stArr = str.split("loa");

        for(int i=0; i<stArr.length ;i++)
            System.out.println(stArr[i]);

    }
}
