
package figureGeometriche;


public class Rettangolo {
    public float n1;
    public float n2;
    
    public Rettangolo (float lato1, float lato2) {
        n1 = lato1;
        n2 = lato2;           
    }
    
    public float calcolaArea () {
        float area;
        area = n1 * n2;
        return area; 
    } 
    
    public float calcolaPerimetro () {
        float perimeto;
        perimeto = n1 + n1 + n2 + n2;
        return perimeto;
    }
}
