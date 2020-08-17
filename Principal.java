

import java.io.*;

public class Principal {

   public static InputStreamReader Leer = new InputStreamReader(System.in);
   public static BufferedReader Teclado = new BufferedReader(Leer);

    public static void main(String[] args)throws IOException {

    System.out.println("ingrese un saldo para la cuenta");


     int saldoc = Integer.parseInt(Teclado.readLine());
     Cuenta ahor = new Cuenta(saldoc);
     int as=ahor.sal(saldoc);
     System.out.println("su saldo es:"+as);


     System.out.println("----QUE TRANSFERENCIA DESEA HACER---");

     System.out.println("1:RETIRO");
     System.out.println("2:DEPOSITO");

     int op=Integer.parseInt(Teclado.readLine());


     switch(op){
         case 1:

    System.out.println("ingrese el retiro");
     int ret=Integer.parseInt(Teclado.readLine());
     if(ret<=saldoc){

       int retiro=ahor.reti(ret);
    saldoc=retiro;
       System.out.println("Su retiro fue realizado.");
       System.out.println("su saldo actual es: ");

         System.out.println(saldoc);
     }

    break;
         case 2:

    System.out.println("ingrese la cantidad de deposito");
     int d=Integer.parseInt(Teclado.readLine());

       int r=ahor.depos(d);
       saldoc=r;
       System.out.println("su deposito a sido realizado");
       System.out.println("su saldo actual es:");


         System.out.println(saldoc);

   break;
    }
    }
}