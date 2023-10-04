package figureGeometriche;

import java.util.Scanner;

public class TriangoloTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float n1;
        float n2;
        float n3;
        float h;
        float a;
        float p;
        
        System.out.print("inserisci la base        : ");
        n1 = in.nextFloat();
        
        System.out.print("inserisci il primo lato  : ");
        n2 = in.nextFloat();

        System.out.print("inserisci il secondo lato: ");
        n3 = in.nextFloat();

        System.out.print("inserisci l'altezza      : ");
        h = in.nextFloat();

        TriangoloScaleno ts = new TriangoloScaleno (n1,n2,n3,h);
        
        n1 = ts.n1;
        n2 = ts.n2;
        n3 = ts.n2;
        a  = ts.calcolaArea();
        p  = ts.calcolaPerimetro();
        
        System.out.println("l'altezza     :" + ts.n1);
        System.out.println("lato1         :" + ts.n2);
        System.out.println("lato2         :" + ts.n3);
        System.out.println("perimetro     :" + p);
        System.out.println("area          :" + a);
    }
    
}
