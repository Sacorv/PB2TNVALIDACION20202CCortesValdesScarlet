package cortes.scarlet94257410;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

//import borgeat.andres.ProductoInexistenteException;
//import borgeat.andres.ProductoInexistenteException;
import cortes.scarlet94257410.Camion;
import cortes.scarlet94257410.Producto;
import cortes.scarlet94257410.TiendaCamion;

public class TestCamion {
	

	//opcional
	@Test
	public void queSeAgregueUnProducto() {
		Camion camion = new Camion("555");
		Producto prod = new Producto(2, 20.0, "vaso", 5.0);
		camion.cargarProducto(prod);
		
		Integer valorObt = camion.getListaProductos().size();
		Integer valorEsp = 1;
		
		assertEquals(valorEsp, valorObt);
	}
	
	
	//opcional
	@Test
	public void queSeDescargueUnProducto() throws ProductoInexistenteException {
		Camion camionTienda = new TiendaCamion("555");
		Producto prod = new Producto(2, 20.0, "vaso", 5.0);
		
		
		assertTrue(camionTienda.cargarProducto(prod));
		assertEquals(2, camionTienda.descargarProducto(2).getId(), 0.1);
	}
	

	
	
	//obligatorio
	@Test (expected = ProductoInexistenteException.class)
	public void queDescargueUnProductoInexistenteLanceUnaException() throws ProductoInexistenteException {
		Camion camion = new Camion("555");
		Producto prod = new Producto(2, 20.0, "vaso", 5.0);
		Producto prod2 = new Producto(5, 100.0, "madera", 50.0);
		camion.cargarProducto(prod);
		camion.cargarProducto(prod2);
		
		camion.descargarProducto(8);
	
	}
	
	
	
	
}
