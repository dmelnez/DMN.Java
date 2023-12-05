package Servicios;

public interface OperativaInterfaz {

	
	/**
	 * Metodo encargado de añadir una nueva venta. El cual el se le pedira al usuario el valor de la vente.
	 * Y se sumara al total de dinero
	 * DMN - 07/12/2023
	 * @return long * cantidadTotal
	 * */
	
	public long añadirVenta(long cantidadDinero);
	
	/***
	 * 
	 * Metodo encargado de añadir un gasto. Se le pedira al usuario la cantidad de gasto, y se restara a dinero total.
	 * Mostrara al usuario la cantidad total de dinero. Y le alertara si el valor del mismo en menor o igual a 0
	 * DMN - 07/12/2023
	 * @param cantidadDinero
	 * @return long dineroTotal
	 */
	
	public long añadirGasto(long cantidadDinero);
	
	
	/**
	 * Metodo encargado de mostrar por pantalla al usuario, la cantidad de dinero total. Este valor se compone de 
	 * la suma de las cantidades de dinero de las ventas, y la resta de las cantidades de dinero de los gastos
	 * 
	 * Se avisara al usuario con el mensaje "Vamos mal", si la cantidad de dinero es igual a 0. 
	 * Y si este valor, es menor a 0, se le mostrara el mensaje de "Vamos muy mal"
	 * @param dineroTotal
	 * */
	
	public void totalDinero(long dineroTotal);
	
}
