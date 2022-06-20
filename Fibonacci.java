
public class Fibonacci{
    // formula da sequencia de fibonacci Fn = Fn-1 + Fn-2

     static int sequencia(int n){
        if (n <= 1){ return 1;} return sequencia(n-1) + sequencia(n-2);  
     }
     static void imprimeSequencia(int limite){
        System.out.print(0+" ");
        for (int i=0;i<limite;i++) System.out.print(sequencia(i)+" ");  
     }

     public static void main(String[] args) { 
      imprimeSequencia(25);
     
    }
    
    
}
