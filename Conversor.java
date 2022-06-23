import java.util.Scanner;
public class Conversor{
    public static void main(String []args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("digite o valor decimal: ");
        int decimal = Integer.parseInt(entrada.nextLine());
         
         int aux = decimal;
         int resto = aux;
      

         while (decimal > 2){
            
            resto = decimal % 2;
            System.out.print(" "+resto);
            decimal /= 2;

            
       
           

            
        //    System.out.println("resultado: "+aux);
            
            

            
         }
         
        

        // 100(dec) = 0110 0100(bin)



    
    }
}