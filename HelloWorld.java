
public class HelloWorld{
    public static void main(String []arguments) {
        System.out.println("Hello World");
         char caracteres[] =  {'L','4','r','4','n','J','4'};
        var str_laranja =  new String(caracteres);

        System.out.print("=============================\nOriginal: ");
        // imprimindo de trás para frente
        for(int i=0;i<=caracteres.length-1;i++)System.out.printf("%c ",caracteres[i]);
        System.out.print("\nInvertido: ");
        for(int y=caracteres.length-1;y>=0;y--)System.out.printf("%c ",caracteres[y]);
       
        System.out.println("\n=============================");

        var str_amarelo =  "4m4r3l0";
        
        // concatenando strings...
        System.out.println("Array de caracteres: "+str_laranja+"\nTipo primitivo (class) String: "+str_amarelo);

        // concatenando numeros
        System.out.println("\nConcatenando Números");
           byte bt_positivo = 127; 
           byte bt_negativo = -128;
                short curto = -32768;
                     int um = 2147483647;
            float um_e_meio = 1.5f;
         double dois_e_meio = 2.5;
              long num_long = 9223372036854775807L;

       System.out.printf("%d %d %d %d %f %f %d\n",bt_positivo,bt_negativo,curto,um,um_e_meio,dois_e_meio,num_long);
      
       // somando valores
       var soma = (bt_positivo+bt_negativo+curto+um+um_e_meio+dois_e_meio+num_long);
       System.out.println("Soma de todos os valores: "+soma);
        
       //convertendo valores para String
       System.out.println("\nconvertendo valores para String");
       System.out.println("Byte: "+
       Byte.toString(bt_negativo)+"\nshort: "+
       Short.toString(curto)+"\nfloat: "+
       Float.toString(um_e_meio)+"\nDouble: "+
       Double.toString(dois_e_meio)+"\nLong: "+
       Long.toString(num_long));
       
       
    }
}