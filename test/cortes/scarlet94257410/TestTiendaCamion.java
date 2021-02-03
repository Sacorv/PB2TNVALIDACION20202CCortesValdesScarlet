package cortes.scarlet94257410;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import cortes.scarlet94257410.Producto;
import cortes.scarlet94257410.Reporte;
import cortes.scarlet94257410.TiendaCamion;

public class TestTiendaCamion {
	
	
	
	//Obligatorio
	
	@Test
	public void queSeObtengaUnreporteAlHAcerUnCierreZ() throws CajaCerradaException, ProductoInexistenteException {
		TiendaCamion tienda = new TiendaCamion("33");
		tienda.abrirCaja();
		Producto prod1 = new Producto(2, 100.0, "mesa", 20.0);
		Producto prod2 = new Producto(3, 100.0, "mesa", 20.0);
		Producto prod3 = new Producto(5, 100.0, "mesa", 20.0);
		tienda.cargarProducto(prod1);
		tienda.cargarProducto(prod2);
		tienda.cargarProducto(prod3);
		tienda.vender(2);
		tienda.vender(3);
		tienda.vender(5);
		
		Double valorEsp = 300.0;
		Double valorObt = tienda.cierreZ().getTotalNeto();
		
		assertEquals(valorEsp, valorObt);
	}
	

	//opcional
	@Test
	public void queAlArirUnaCajaLaListaDeVentaEsteVacia() {
		TiendaCamion tienda = new TiendaCamion("33");
		tienda.abrirCaja();
		
		Integer valorObt = tienda.getListaProductos().size();
		Integer valorEsp = 0;
		
		assertEquals(valorEsp, valorObt);
		
	}

}
