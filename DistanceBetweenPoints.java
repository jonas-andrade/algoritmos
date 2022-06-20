import java.util.Locale;

// calculo da distancia entre dois pontos:  dAB² = (xB – xA)² + (yB – yA)².

  class Ponto{
    int x1;int x2;
    int y1;int y2;
    public Ponto(int x1,int x2,int y1,int y2){
    this.x1 = x1;this.x2 = x2;this.y1 = y1;this.y2 = y2;} 

}

public class DistanceBetweenPoints {
    public static double calcEuclides(Ponto p){
        return Math.sqrt((Math.pow((p.x2 -p.x1), 2) + Math.pow((p.y2-p.y1), 2)));
    }

    public static void main(String[] args) {
        Ponto p = new Ponto(1,3,4,6);
        
        System.out.printf(Locale.US,"%.2f",calcEuclides(p));

        
    }


}

