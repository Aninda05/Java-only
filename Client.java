import java.io.*;
import java.net.Socket;
import javax.swing.*;
import java.util.*;



public class Client 
  {

        public static void main(String[] args) throws IOException
        {
        //Scanner sc=new Scanner(System.in);
        //System.out.print("Enter the name of the server : ");
        //String serverAddress=sc.nextLine();
        String serverAddress=JOptionPane.showInputDialog(null,"Enter the server");

        Socket st = new Socket(serverAddress, 7070);
        BufferedReader input =new BufferedReader(new InputStreamReader(st.getInputStream()));
        
        String answer = input.readLine();
        JOptionPane.showMessageDialog(null,answer);        
        //System.out.println("Welcome to BASU&Co. " + answer);
        System.exit(0);
    }
}