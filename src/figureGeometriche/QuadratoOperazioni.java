package figureGeometriche;

import java.util.Scanner;

public class QuadratoOperazioni {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        float n1;
        float n2;
        float a;
        float p;
        
        System.out.print("inserisci il lato: ");
        n1 = n2 = in.nextFloat();
        
        Quadrato area = new Quadrato (n1,n2);
        
        Quadrato perimetro = new Quadrato (n1,n2);
        
        n1 = area.n1;
        n2 = area.n2;
        a = area.calcolaArea();
        p = perimetro.calcolaPerimetro();
        
        System.out.println("numero1     :" + perimetro.n1);
        System.out.println("numero2     :" + perimetro.n2);
        System.out.println("perimetro   :" + p);
        

        System.out.println("area        :" + a);
    }
}

