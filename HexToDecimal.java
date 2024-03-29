import java.util.Scanner;

public class HexToDecimal {
    int count;
    String in;
    char []hex = {'j','j','j','j','j','j','j','j'};
    int base = 16;
    int decimal = 0;


    public HexToDecimal(){}
    public void inputScanner(){
        
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite em hexadecimal: ");
            this.in = sc.next();
            sc.close();
        } catch (Exception e) {System.err.print(e);}
    }
    public int calcHex(){
        for(int i=this.in.length()-1;i>=0;i--){
            hex[i] = this.in.toCharArray()[i];
            int number = (hex[i] == 'A'|| hex[i] == 'a')? 10 : (hex[i] == 'B'||hex[i] == 'b') ? 11:
            (hex[i] == 'C'||hex[i] == 'c')? 12: (hex[i] == 'D'||hex[i] == 'd')? 13:
            (hex[i] == 'E'||hex[i] == 'e')? 14: (hex[i] == 'F'||hex[i] == 'f')? 15: Character.getNumericValue(hex[i]);
            count += (number > 9 && number <= 16 )?
             number*Math.pow(base, (this.in.length()-i-1)): 
            Character.getNumericValue(hex[i])*Math.pow(base, (this.in.length()-i-1));  
            if(!Character.isDigit(hex[i]) && (number > 15)){count = -1;break;}
       }
    return count;
    }
    public void viewDecimal(){
        int res = calcHex();

        if(res!=-1){System.out.println("Resultado em decimal: "+res);
        }else{System.out.println("\nValor invalido!");}
        count = 0; 
    }


    
}
