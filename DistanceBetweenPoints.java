import java.util.Locale;

// calculo da distancia entre dois pontos:  dAB² = (xB – xA)² + (yB – yA)².

  class Ponto{
    int x;int y;
    
    public Ponto(int x,int y){this.x = x;this.y = y;} 

}

public class DistanceBetweenPoints {
    public static double calcEuclides(Ponto p1, Ponto p2){
        return Math.sqrt((Math.pow((p2.x-p1.x), 2) + Math.pow((p2.y-p1.y), 2)));
    }

    public static void main(String[] args) {
        Ponto p1 = new Ponto(-3, -11);
        Ponto p2 = new Ponto(2,1);
        
        System.out.printf(Locale.US,"%.2f",calcEuclides(p1,p2));

        
    }


}

