import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {

       try{
         FileWriter writer = new FileWriter("tasks.txt");
        
         writer.write("Hello");

         writer.close();

         System.out.println("Written Successfully");
       }
       catch(Exception e){

       }


    }


}
