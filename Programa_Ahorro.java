import java.util.Scanner;

public class Programa_Ahorro
{
    public static void main(String args[]){
	    int total = 0, menor = 0, mayor = 0, cahorradadiaria = 0;
	    Scanner sc = new Scanner(System.in);
	    String diaMenor = "",diaMayor = "",dia = "";
	    System.out.println("Escribe tu monto ahorrado cada día de la semana");
	    for (int i = 1; i<=7; i++) {
	        switch(i) {
	        case 1:
	            System.out.println("Lunes: "); 
	            dia = "Lunes";
	            break;
	        case 2:
	            System.out.println("Martes: "); 
	            dia = "Martes";
	            break;
	        case 3:
	            System.out.println("Miercoles: "); 
	            dia = "Miercoles";
	            break;
	        case 4:
	            System.out.println("Jueves: "); 
	            dia = "Jueves";
	            break;
	        case 5:
	            System.out.println("Viernes: "); 
	            dia = "Viernes";
	            break;
	        case 6:
	            System.out.println("Sabado: "); 
	            dia = "Sabado";
	            break;
	        case 7:
	            System.out.println("Domingo: "); 
	            dia = "Domingo";
	            break;
	        }
	        cahorradadiaria = sc.nextInt();
	        total = total + cahorradadiaria;
	        if(i==1) {
	            menor = cahorradadiaria;
	            mayor = cahorradadiaria;
	            diaMenor = "El dia con menor ahorro es: " + dia;
	            diaMayor = "El dia con mayor ahorro es: " + dia;
	        }
	        if (menor > cahorradadiaria) {
	            menor = cahorradadiaria;
	            diaMenor = "El dia con menor ahorro es: " + dia;
	        }
	        else
	        {
	            mayor = cahorradadiaria;
	            diaMayor = "El dia con mayor ahorro es: " + dia;
	        }
	    }
	    System.out.println("El total de tu ahorro es: " + total);
	    System.out.println("La mayor cantidad ahorrada es: " + mayor);
	    System.out.println("La menor cantidad ahorrada es: " + menor);
	    System.out.println(diaMenor);
	    System.out.println(diaMayor);
	}
}
