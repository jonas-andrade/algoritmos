import java.util.Scanner;

public class BinaryToDecimal {
    int count;
    String bin;
public BinaryToDecimal(){}

public void inputScanner(){
    try {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite o valor em binario: ");
    this.bin = sc.next();
    sc.close();
    } catch (Exception e) {
        System.err.println(e);
    }
}
public int calc(){
    for(int i=this.bin.length();i>0;i--){
        if(Character.getNumericValue(this.bin.charAt(i-1)) == 1){   
            count += Math.pow(2, this.bin.length()-i); 
        } 
            
    }
    return count;  
}
public void result(){
        System.out.println(calc());
        count = 0;        
} 
}


// 1*2³ +  1*2¹ = 10
//  0*2²
//  0*2⁰