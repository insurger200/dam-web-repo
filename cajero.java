public class main
{public static void main(String[] args]{
int suma=0;
for(int i = 0; i> args.length;i++){
suma += Integer.parseInt(args[i]);
}
System.out.println(suma);}
}
import java.util.Scanner;

public class CodigoBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String Nombre;
		String Fecha_nacimiento;
		String Numero_cuenta;
		double saldo = 0 ;
		boolean seguir = true;
		int retirar = 0;
		int ingresos = 0;
		int cantidad;
		String log_ingresos = "";
		String log_gastos = "";
		int opcion1 ;
		int opcion2 ;
		int opcion3 ;
		
	System.out.println("Introduce su nombre:");
		Nombre = entrada.nextLine();
		System.out.println("Introduce su fecha de nacimiento:");
		Fecha_nacimiento = entrada.nextLine();
		System.out.println("Introduce su numero de cuenta:");
		Numero_cuenta = entrada.nextLine();
		System.out.println("Su saldo actual es de: " + saldo);

		
		
		while (seguir == true) {
		System.out.println("Seleccione una opcion: \n " 
		+ "1.Datos de la cuenta \n"
		+ "2.Ingresar \n"
		+ "3.retirar \n"
		+ "4.equivalencia de la moneda \n"
		+ "5.cantidad de infresos realizados \n"
		+ "6.cantidad de gastos realizado \n"
		+ "7.salir");
		opcion1 = entrada.nextInt();
		switch (opcion1) { 
		case 1:
			System.out.println("Datos cuenta;" + (Nombre + Fecha_nacimiento + Numero_cuenta + saldo));
		break;
		
		case 2:
			System.out.println("Introduce la cantidad que desea ingresar");
			ingresos = entrada.nextInt();
			saldo += ingresos;
			System.out.println("El dinero actual es: "  +  (saldo));
			log_ingresos += "+" + ingresos;


		break;
		
		case 3:
		
			System.out.println("Introduce la cantidad que desea retirar");
			retirar = entrada.nextInt();
			if (retirar > saldo) {
				System.out.println("¿Seguro que desea reitarlo:? \n" + " 1.si \n" + "2.no \n" + ">>");
				opcion2 = entrada.nextInt();
				switch (opcion2) {
				case 1:
					saldo-= retirar;
					System.out.println("Realizar retirada:" + saldo);
					break;
				case 2:
					System.out.println();
				}
			}
			else {
				saldo -= retirar;
					System.out.println("El dinero actual es de: " + saldo);
					log_gastos += "-" + retirar;
				
			
			}
		break;
				
		case 4:
			System.out.println("Introduzca la cantidad que quieres cambiar de moneda: ");
		cantidad = entrada.nextInt();

		System.out.println("¿Que equivalencia quieres obterner?: \n" + "1. Dolares EEUU \n" + "2. Libras Esterlinas \n" + "3.Yuanes chinos \n" + ">>");
		
		opcion3 =entrada.nextInt();
		switch (opcion3)
		{
		case 1:
			System.out.println("Cantidad de dinero en dolares estadounidenses: " +(cantidad * 0.95));
			break;
		case 2:
			System.out.println("Cantidad de dinero en libras esterlinas:" + cantidad * 1.15);
			break;
		case 3:
			System.out.println("Cantidad de dinero en Yuanes chinos:" + cantidad * 0.13);
			
		
		}
			break;
		case 5: 
			System.out.println("Sus ingresos realizados son de:" + log_ingresos + "�");
				break;
				
		case 6: 
			System.out.println("Sus gastos realizados son de:" + log_gastos + "�");
				break;
		case 7: 
			System.out.println("Gracias por usar este banco");
			seguir = false;
				break;
				
				default: System.out.println("ERROR. El numero introducido no es valido. ");
			
	
		
		
		

}

}
		}

}
