
package operazioniMatematiche;

import java.util.Scanner;
public class SottrazzioneTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float n1;
        float n2;
        float s;
        
        System.out.print("inserisci il primo numero: ");
        n1 = in.nextFloat();
        
        System.out.printf("inserisci il secondo numero: ");
        n2 = in.nextFloat();
        Sottrazzione sottrazzione = new Sottrazzione (n1,n2);
        
        n1 = sottrazzione.n1;
        n2 = sottrazzione.n2;
        s = sottrazzione.esegui();
        
        System.out.println("numero1 :" + sottrazzione.n1);
        System.out.println("numero2 :" + sottrazzione.n2);
        System.out.println("sottrazzione   :" + s);
    
    }
    
}
