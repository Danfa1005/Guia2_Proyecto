import java.util.Scanner; //para teclado
import java.lang.Math; //para calculo de valor futuro y redondeo

public class Programa_Ahorro
{
    public static void main(String args[]){
        //Declaracion de variables
        double total_Semana = 0, menor = 0, mayor = 0, cahorradadiaria = 0;
        double tea, tem, meta, tiempo, total_mes, valor_Futuro, logroMeta, mesesRequeridos;
        String moneda;
        String diaMenor = "",diaMayor = "",dia = "";
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe en que moneda deseas ahorrar (USD, EUR, COP):");
        moneda = sc.nextLine();
        
        //Ingreso del usuario para proyeccion semanal  
        System.out.println("Escribe tu monto ahorrado cada día de la semana para la moneda seleccionada");
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
            } //Fin de switch         
            cahorradadiaria = sc.nextDouble();
            total_Semana = total_Semana + cahorradadiaria;
            if(i==1) {
               menor = cahorradadiaria;
               mayor = cahorradadiaria;
               diaMenor = "El dia con menor ahorro es: " + dia;
               diaMayor = "El dia con mayor ahorro es: " + dia;
            } //Fin de if si los ahorros son iguales
            else if (menor > cahorradadiaria) {
               menor = cahorradadiaria;
               diaMenor = "El dia con menor ahorro es: " + dia;
            } //Fin de if menor ahorro
            else if (mayor < cahorradadiaria) {            
               mayor = cahorradadiaria;
               diaMayor = "El dia con mayor ahorro es: " + dia;
            } //Fin de if mayor ahorro                                    
        } //Fin de for
        
        //Ingreso del usuario para proyeccion mensual
        System.out.println("");
        System.out.println("A partir de la información anterior, se hace una estimación de tus ahorros mensuales.");
        System.out.println("");
        System.out.println("Si piensas ingresar estos ahorros en una cuenta, por favor ingresa la tasa efectiva anual (TEA) aplicable");        
        System.out.println("para la moneda seleccionada (como porcentaje), de lo contrario ingresa un 0:");
        tea= sc.nextDouble();
        System.out.println("Ingresa el tiempo de ahorro en meses:");
        tiempo= sc.nextInt();
        System.out.println("Por ultimo, ingresa tu meta de ahorro como un valor para la moneda seleccionada:");
        meta= sc.nextDouble();
        tem= tea/12; //para conversion de TEA a TEM
        total_mes = total_Semana * 4.34524;        
                
        //Instrucciones condicionales para calculo e impresion de resultados
        if (moneda.equalsIgnoreCase("USD")) {
            System.out.println(""); 
            System.out.println("El total de tu ahorro semanal en dolares es: " + total_Semana);
            System.out.println("La mayor cantidad ahorrada en la semana es: " + mayor);
            System.out.println("La menor cantidad ahorrada en la semana es: " + menor);
            System.out.println(diaMenor);
            System.out.println(diaMayor);
            System.out.println("");            
            System.out.println("Tu proyeccion de ahorro mensual en dolares es...");
            valor_Futuro = Math.round((total_mes*(Math.pow((1+tem),tiempo)))*100)/100.0;
            logroMeta = Math.round(((valor_Futuro/meta) * 100)*10)/10.0;
            mesesRequeridos = Math.round(((meta-valor_Futuro) / (valor_Futuro/tiempo))*10)/10.0;
            System.out.println("Estimado de valor futuro para " +tiempo+ " meses: " +valor_Futuro);
            if (logroMeta >= 100) {
                System.out.println("Es probable que cumplas tu meta de ahorro con toda la informacion que has puesto ¡Bien hecho!");
            } //Fin de if para logrometa
            else {
                System.out.println("Con esta informacion tienes un " +logroMeta+ "% cumplida tu meta de ahorro");
                System.out.println("Adicionalmente, necesitas " +mesesRequeridos+ " meses para cumplir tu meta de ahorro.");
            } //Fin de else para logrometa
        } //Fin de if para imprimir USD
        else if (moneda.equalsIgnoreCase("EUR")) {
            System.out.println("");
            System.out.println("El total de tu ahorro semanal en euros es: " + total_Semana);
            System.out.println("La mayor cantidad ahorrada en la semana es: " + mayor);
            System.out.println("La menor cantidad ahorrada en la semana es: " + menor);
            System.out.println(diaMenor);
            System.out.println(diaMayor);
            System.out.println("");            
            System.out.println("Tu proyeccion de ahorro mensual en euros es...");
            valor_Futuro = Math.round((total_mes*(Math.pow((1+tem),tiempo)))*100)/100.0;
            logroMeta = Math.round(((valor_Futuro/meta) * 100)*10)/10.0;
            mesesRequeridos = Math.round(((meta-valor_Futuro) / (valor_Futuro/tiempo))*10)/10.0;
            System.out.println("Estimado de valor futuro para " +tiempo+ " meses: " +valor_Futuro);
            if (logroMeta >= 100) {
                System.out.println("Es probable que cumplas tu meta de ahorro con toda la informacion que has puesto ¡Bien hecho!");
            } //Fin de if para logrometa
            else {
                System.out.println("Con esta informacion tienes un " +logroMeta+ "% cumplida tu meta de ahorro");
                System.out.println("Adicionalmente, necesitas " +mesesRequeridos+ " meses para cumplir tu meta de ahorro.");
            } //Fin de else para logrometa
        } //Fin de if para imprimir EUR
        else if (moneda.equalsIgnoreCase("COP")) {
            System.out.println("");
            System.out.println("El total de tu ahorro semanal en pesos colombianos es: " + total_Semana);
            System.out.println("La mayor cantidad ahorrada en la semana es: " + mayor);
            System.out.println("La menor cantidad ahorrada en la semana es: " + menor);
            System.out.println(diaMenor);
            System.out.println(diaMayor);
            System.out.println("");            
            System.out.println("Tu proyeccion de ahorro mensual en pesos colombianos es...");
            valor_Futuro = Math.round((total_mes*(Math.pow((1+tem),tiempo))));
            logroMeta = Math.round(((valor_Futuro/meta) * 100)*10)/10.0;
            mesesRequeridos = Math.round(((meta-valor_Futuro) / (valor_Futuro/tiempo))*10)/10.0;
            System.out.println("Estimado de valor futuro para " +tiempo+ " meses: " +valor_Futuro);
            if (logroMeta >= 100) {
                System.out.println("Es probable que cumplas tu meta de ahorro con toda la informacion que has puesto ¡Bien hecho!");
            } //Fin de if para logrometa
            else {
                System.out.println("Con esta informacion tienes un " +logroMeta+ "% cumplida tu meta de ahorro");
                System.out.println("Adicionalmente, necesitas " +mesesRequeridos+ " meses para cumplir tu meta de ahorro.");
            } //Fin de else para logrometa
        } //Fin de if para imprimir COP
    } //Fin de main
} //Fin de clase programa_ahorro
