
package modemtester;

import java.util.Scanner;

public class ModemTester {
   
    public static void main(String[] args) {    
        CableModem cable1 = new CableModem ();
        DslModem dsl1 = new DslModem();
        
        Scanner mycable1 = new Scanner(System.in);
        cable1.speed = mycable1.nextInt();
        
        dsl1.speed = 2000;
        
        System.out.println ("Datos del Cable");
        cable1.displaySpeed ();
        cable1.connect ();
        
        System.out.println ("Datos del DSL");
        dsl1.displaySpeed ();
        dsl1.connect ();
        
        
    }
}
