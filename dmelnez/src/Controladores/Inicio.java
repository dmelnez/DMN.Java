package Controladores;

import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;
import Servicios.OperativaImplementacion;
import Servicios.OperativaInterfaz;

/**
 * Clase principal por el cual se lanza la aplicacion
 * DMN - 05/12/2023
 * */


public class Inicio {
	
	/***
	 * Metodo por el cual, la aplicacion se inicializa
	 * 
	 * DMN - 05/12/2023
	 * @param args
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuInterfaz menu = new MenuImplementacion();
		
		OperativaInterfaz operativa = new OperativaImplementacion();
		
		
		
	
		 long dineroTotal = 0;
		
		
		boolean cerrarMenu = false;
		
		while(!cerrarMenu) {
			
			int valorMenu = menu.menuPrincipal();
			switch(valorMenu) {
			
			case 0:
				System.out.println("#####################################");
				System.out.println("# [INFO] - Se cerrara la Aplicacion #");
				System.out.println("#####################################");
				cerrarMenu = true;
			break;
			
			case 1:
				System.out.println("#######################################");
				System.out.println("# [INFO] - Se añadira una nueva Venta #");
				System.out.println("#######################################");
				dineroTotal = operativa.añadirVenta(dineroTotal);
				
				
				
			break;
			
			case 2:
				System.out.println("######################################");
				System.out.println("# [INFO] - Se añadira un nuevo gasto #");
				System.out.println("######################################");
				
				dineroTotal = operativa.añadirGasto(dineroTotal);
				
			break;
			
			case 3:
				System.out.println("#################################");
				System.out.println("# [INFO] - Se mostrara el total #");
				System.out.println("#################################");
				operativa.totalDinero(dineroTotal);
			break;
			
			default:
				System.out.println("########################################");
				System.out.println("# [INFO] - Valor introducido no valido #");
				System.out.println("########################################");
			break;
			
			
			}
			
			
			
			
		}
		
		
	}

}
