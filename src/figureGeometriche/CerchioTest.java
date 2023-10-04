package figureGeometriche;

import java.util.Scanner;
public class CerchioTest {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
      
        float raggio;
        float area;
        float perimetro;
        
        System.out.print("inserire il valore del raggio: ");
        raggio = in.nextFloat();
        
        Cerchio c = new Cerchio (raggio);
        
        area = c.area();
        perimetro = c.perimetro();
        
        System.out.println("area     : " +area);
        System.out.println("perimetro: " +perimetro);

        
        
        
        
    }
    
}
