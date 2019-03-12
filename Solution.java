import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s)
    {
        String  p=null;
        if(s.substring(s.length()-2,s.length()).equals("PM")==true)
        {
            String a=s.substring(0,1);
            int result=Integer.valueOf(a)+12;
            System.out.println(result);
            p=String.valueOf(result);
        }
        return(p+s.substring(2,s.length()));    
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
