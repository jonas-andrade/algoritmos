import java.util.Scanner;

public class HexToDecimal {
    int count;
    String in;
    char []hex ={'j','j','j','j','j','j','j','j',};
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
         
        for(int i=this.in.length()-1;i>=0;i--){//indice
            hex[i] = this.in.toCharArray()[i];
            int number = (hex[i] == 'A'|| hex[i] == 'a')? 10 :(hex[i] == 'B'||hex[i] == 'b') ? 11: (hex[i] == 'C'||hex[i] == 'c')? 12:(hex[i] == 'D'||hex[i] == 'd')? 13:(hex[i] == 'E'||hex[i] == 'e')? 14 : (hex[i] == 'F'||hex[i] == 'f')? 15: 16;
            count += (number > 9 && number <= 16 )?
            count += number*Math.pow(base, (this.in.length()-i-1)): 
            Character.getNumericValue(hex[i])*Math.pow(base, (this.in.length()-i-1));      
    }
   

    return count;
    }
    public void viewDecimal(){
        System.out.println("Resultado em decimal: "+calcHex());count = 0;
   
    }


    
}
