package Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{

	
	public int menuPrincipal() {
		
		
		Scanner valorRecogido = new Scanner(System.in);
		System.out.println("##############################");
		System.out.println("### SELECCIONE UNA OPCION ####");
		System.out.println("##############################");
		System.out.println("# 0 -> Cerrar Aplicacion     #");
		System.out.println("# 1 -> Añadir Venta          #");
		System.out.println("# 2 -> Añadir Gasto          #");
		System.out.println("# 3 -> Mostrar Total         #");
		System.out.println("##############################");
		
		int valorMenu = valorRecogido.nextInt();
		return valorMenu;
		
		
		
		
	}
	
	
}
