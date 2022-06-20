
public class HelloWorld{
    private static final String CONTANTES_STRING = "Byte valor Máximo: "+Byte.MAX_VALUE+
                          "\nByte valor Mínimo: "+Byte.MIN_VALUE+
                          "\nShort valor Máximo: "+Short.MAX_VALUE+
                          "\nShort valor Mínimo: "+Short.MIN_VALUE+
                          "\nInteger valor Máximo: "+Integer.MAX_VALUE+
                          "\nIngeter valor Mínimo: "+Integer.MIN_VALUE+
                          "\nFLoat valor Máximo: "+Float.MAX_VALUE+
                          "\nFloat valor Mínimo: "+Float.MIN_VALUE+
                          "\nDouble valor Máximo: "+Double.MAX_VALUE+
                          "\nDouble valor Mínimo: "+Double.MIN_VALUE+
                          "\nLong valor Máximo: "+Long.MAX_VALUE+
                          "\nLong valor Mínimo: "+Long.MIN_VALUE;

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
       String msg = String.format("%d %d %d %d %f %f %d\n",bt_positivo,bt_negativo,curto,um,um_e_meio,dois_e_meio,num_long);
       System.out.printf(msg);
      
       // somando valores
       var soma = (bt_positivo+bt_negativo+curto+um+um_e_meio+dois_e_meio+num_long);
       System.out.println("Soma de todos os valores: "+soma);
        
       //convertendo valores para String
       System.out.println("\nconvertendo valores para String");
       System.out.println("Byte: "+
       Byte.toString(bt_negativo)+"\nshort: "+
       Short.toString(curto)+"\nint: "+
       Integer.toString(um)+"\nfloat: "+
       Float.toString(um_e_meio)+"\nDouble: "+
       Double.toString(dois_e_meio)+"\nLong: "+
       Long.toString(num_long));

       // imprimindo Constantes 

       System.out.println("\nImprimindo valores máximo e mínimo: \n"+CONTANTES_STRING);
       
       // comparando valores entre menor e maior
       System.out.println("\nComparando valores entre menor e maior\n== Byte e short não se aplica!==\n");
       System.out.println("maior inteiro entre 5 e 15 => "+Integer.max(5, 15));
       System.out.println("menor inteiro entre 20 e 50 => "+Integer.min(20, 50));
       System.out.println("maior Flloat entre 7.5 e 2.5 => "+Float.max(7.5f, 2.5f));
       System.out.println("menor Flloat entre 0.5 e 8.0 => "+Float.min(.5f, 8.0f));
       System.out.println("maior Double entre 0.5 e 1.5 => "+Double.max(.5, 1.5));
       System.out.println("menor Double entre 26 e 5.0 => "+Double.min(26, 5.0));
       System.out.println("Maior Long entre 9223372036854775807 e 10000000  => "+Long.max(num_long,10000000L));
       System.out.println("menor Long entre 9223372036854775807 e 10000000  => "+Long.min(num_long,10000000L));

       // tipode de string format
    

System.out.println("--=========================================================\ntipos::");
    System.out.println("A-> HEXADECIMAL COM PONTO FLUTUANTE %a: " + String.format("%a", 1.5));
    System.out.println("B-> BOOLEANO DIMINUTIVO %b: " + String.format("%b", false));
    System.out.println("B-> BOOLEANO MAIUSCULA %B: " + String.format("%B", true));
    System.out.println("C-> CARACTERE %c: " + String.format("%c", 'd'));
    System.out.println("D-> DECIMAL %d: " + String.format("%d", 101));
    System.out.println("E-> NOTAÇÃO CIÊNTIFICA %e: " + String.format("%e", 5.6));
    System.out.println("F-> FRACIONARIO %f: " + String.format("%f", 5.6));
    System.out.println("G-> %g: " + String.format("%g", 5.6));
    System.out.println("H-> HASHCODE %h: " + String.format("%h", 10));
    System.out.print("N>  %n: " + String.format("%n"));
    System.out.println("O-> OCTAL %o: " + String.format("%o", 8));
    System.out.println("S-> STRING %s: " + String.format("%s", "Java"));
    System.out.println("X-> HEXADECIMAL %x: " + String.format("%x", 10));
    


       
    }
}