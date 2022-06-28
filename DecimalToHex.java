import java.util.Scanner;

/**
 * DecimalToHex
 */
public class DecimalToHex {
   
    int valor;
    int count = 0;
    int result[] = {-1,-1,-1,-1,-1,-1,-1,-1};

    public DecimalToHex(){}
    public void inputScanner(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("digite o valor decimal: ");
            this.valor = sc.nextInt();
            sc.close();
           } catch (Exception e) {
            System.err.println(e);       
           }     
    }
    public void calcHex(){
        while(valor != 0){
            // :debug
            // System.out.print("( "+valor+" ) R>"+valor%16+" ");
            // System.out.print(valor%16+" ");
            this.result[count] = valor%16;
            valor /=16;count++;
        }     
}
    public void viewHex(){
    char letra = 'J';
    for(int i=count;i>=0;i--){
        letra = (this.result[i] == 10)? 'A': (this.result[i] == 11)? 'B' :  (this.result[i] == 12)? 'C':
        (this.result[i] == 13)? 'D':  (this.result[i] == 14)? 'E':  'F';
        if(this.result[i]>9){System.out.print(letra+" ");}else{
            if(this.result[i] != -1)
            System.out.print(this.result[i]+" ");
        }
        
    }
}
}