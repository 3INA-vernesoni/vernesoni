package figureGeometriche;


public class TriangoloScaleno {
    
    public float h;
    public float n1;
    public float n2;
    public float n3;
    
    public TriangoloScaleno (float base, float lato1, float lato2, float altezza) {
        
        n1 = base;
        n2 = lato1;
        n3 = lato2;
        h = altezza;
    }
    
    public float calcolaArea () {
        float area;
        area = (n1 * h)/2;
        return area; 
    } 
    public float calcolaPerimetro () {
        float perimeto;
        perimeto = n1 + n3 + n2;
        return perimeto;
    }
 

    
}
