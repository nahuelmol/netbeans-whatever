package javaapplication1;

import com.sun.nio.zipfs.ZipInfo;
import saludador.Main;
import Monitor.Monitorize;
import java.util.Scanner;

public class JavaApplication1 {
    
    int x = 0;
    String name; 
    String last_name;
    
    static String name_saissez;
    static String typo;
    
    public static void main(String[] args) {
        int first = 14, second = 6;
        
        JavaApplication1 myObj = new JavaApplication1();
        JavaApplication1 mySecondObj = new JavaApplication1();
        
        myObj.name = "Silvio";
        myObj.last_name = "Molina";
        
        mySecondObj.name = "Piji";
        mySecondObj.last_name = "Comehuevos";
        
        System.out.println("What type of information you wanna request us");
        Scanner info_type = new Scanner(System.in);
        typo = info_type.nextLine();
        
        name_saissez = Monitorize.named(typo);
        System.out.println("Tu "+typo+" est "+name_saissez);
        
    }
}
