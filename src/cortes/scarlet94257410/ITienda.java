package cortes.scarlet94257410;




//completar la interface tienda segun corresponda para que cumpla las funcionalidades pedidas


public interface ITienda {

	
	
	// No permite vender si la caja esta Cerrada y lanza CajaCerradaException
	// Si el producto no existe Lanza Una Excepcion ProductoInexistenteException
	public void vender(Integer idProducto) throws CajaCerradaException, ProductoInexistenteException  ;
	
	//cierra la caja arma y retorna el reporte Diario
	public Reporte cierreZ();
	
}
