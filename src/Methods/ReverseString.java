package Methods;

public class ReverseString {

    public static void main(String[] args) {
        //Reverse a string

        String temp1 = "Saiprasad";
        String temp2 = "";

        for (int k=temp1.length()-1; k>=0; k--)
        {
            temp2 = temp2 +  temp1.charAt(k);

        }

        System.out.println(temp2);
    }
}
