/**
 * DecimalToBinary
 */
import java.util.*;
public class DecimalToBinary {
    int decimal;
    int []bin = {0,0,0,0,0,0,0,0,0}; 
    
    public DecimalToBinary(){}
    public void Leitor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("digite o valor decimal: ");
        this.decimal = Integer.parseInt(sc.nextLine());
    }
    public int div(int x) {
        return x/2;
    }
    public void calc(){
        for(int i=8;i>0;i--){
           this.bin[i] = (div(decimal) == decimal/2)? decimal%2 : div(decimal)%2;
             decimal/=2; 
          }
    }
    public void result(){
        for(int x=1;x<9;x++){System.out.print(bin[x]+" ");}
    }

    
}