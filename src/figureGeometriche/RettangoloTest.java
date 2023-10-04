package figureGeometriche;

import java.util.Scanner;

public class RettangoloTest {

  
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
        
        float n1;
        float n2;
        float a;
        float p;
        
        System.out.print("inserisci la base: ");
        n1 = in.nextFloat();
        
        System.out.print("inserisci l'altezza: ");
        n2 = in.nextFloat();
        
        Rettangolo area = new Rettangolo (n1,n2);
        
        Rettangolo perimetro = new Rettangolo (n1,n2);
        
        n1 = area.n1;
        n2 = area.n2;
        a = area.calcolaArea();
        p = perimetro.calcolaPerimetro();
        
        System.out.println("lato1     :" + perimetro.n1);
        System.out.println("lato2     :" + perimetro.n2);
        System.out.println("perimetro   :" + p);
        

        System.out.println("area        :" + a);
    }
    
}
