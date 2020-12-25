package Monitor;

import java.util.Scanner;
        
public class Monitorize {
    public static String named(String typo){
        String name;
        String nombre = "nombre";
        
        System.out.println("le nom est"+nombre);
        System.out.println("the typo est"+typo);
        
        if(typo.equals(nombre)){
            System.out.println("saissez le name: ");
            Scanner myName = new Scanner(System.in);
            name = myName.nextLine();
            return name; 
        }else{
            System.out.println("saissez autrement chose: ");
            Scanner myName = new Scanner(System.in);
            name = myName.nextLine();
            return name;
        }
    }
    
}
