public class Ascii{
    public static void imprimeASCII(int code){
        System.out.print("[[  ");
        if(code==0)for(int i=0;i<=255;i++) System.out.print(String.format("%c ", i));// tabela completa
        if(code==1)for(int i=0;i<=255;i++) System.out.print(String.format("%h ", i));// tabela completa em hexadecimal
        if(code==2)for(int i=33;i<=126;i++) System.out.print(String.format("%c ", i));// tabela ASCII normal
        if(code==3)for(int i=128;i<=255;i++) System.out.print(String.format("%c ", i));//tabela extendida  
        if(code==4)for(int i=48;i<=57;i++) System.out.print(String.format("%c ", i));//números
        if(code==5)for(int i=65;i<=90;i++) System.out.print(String.format("%c ", i));//maiúscula
        if(code==6)for(int i=97;i<=122;i++) System.out.print(String.format("%c ", i));//minúscula
        System.out.println("  ]]");

    }

public static void main(String[] args) {
    imprimeASCII(0); imprimeASCII(1); imprimeASCII(2); imprimeASCII(3);
    System.out.println("====================================================================");
    imprimeASCII(4); imprimeASCII(5); imprimeASCII(6);
}





}
  
  