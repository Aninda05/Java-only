import java.io.*;
import java.net.*;
import java.util.*;


public class Server {

    public static void main(String[] args) throws Exception 
    { 
        ServerSocket ss = new ServerSocket(7070);  
        try {
            
            System.out.println("Server Started and waiting for client");
            while(true) 
                {
                Socket sc = ss.accept();
                try {
                    PrintWriter out =new PrintWriter(sc.getOutputStream(), true);
                    out.println(new Date().toString());
                    System.out.println(sc);
                    } 
                finally 
                   {
                    sc.close();
                    
                   }
                }
            }
         finally{ss.close();}
        
    }
}