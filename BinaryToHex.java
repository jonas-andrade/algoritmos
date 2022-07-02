import java.util.Scanner;

/**
 * BinaryToHex
 */
public class BinaryToHex {
    int decimal;int count = 0;
    String bin;
    int hex[] = {-1,-1,-1,-1,-1,-1,-1,-1};

    public BinaryToHex(){}
    
    public void inputScanner(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite em Binario: ");
            this.bin = sc.next(); 
            sc.close();
        } catch (Exception e) {System.err.println(e);}
    }
    
    public void calcBTD(){
        int soma_bit = 0;
        for(int i=this.bin.length();i>0;i--){
            if(Character.getNumericValue(this.bin.charAt(i-1))==1){
                soma_bit += Math.pow(2, this.bin.length()-i);}}
                this.decimal = soma_bit; 
    }

    public void calcDTH(){
        calcBTD();
        while(decimal != 0){
            this.hex[count] = decimal%16;
            decimal /=16;count++;
        }
    }

    public void viewHex(){
        calcDTH();
        char letra = 'J';
        for(int i=count;i>=0;i--){
            letra = (this.hex[i] == 10)? 'A': (this.hex[i] == 11)? 'B' :  (this.hex[i] == 12)? 'C':
            (this.hex[i] == 13)? 'D':  (this.hex[i] == 14)? 'E':  'F';
            if(this.hex[i]>9){System.out.print(letra);}else{
                if(this.hex[i] != -1) System.out.print(this.hex[i]);}
            
        }
    }



    
}