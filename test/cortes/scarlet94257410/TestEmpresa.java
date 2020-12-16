package cortes.scarlet94257410;

import static org.junit.Assert.assertEquals;

import java.util.TreeSet;

import org.junit.Test;

import cortes.scarlet94257410.Camion;
import cortes.scarlet94257410.Empresa;
import cortes.scarlet94257410.TiendaCamion;

public class TestEmpresa {
	
	
	//Opcional
	@Test
	public void queSeAgregueUnCamion() {
		Empresa empresa = new Empresa();
		Camion camion = new Camion("555");
		empresa.agregarCamion(camion);
		
		Integer valorObt = empresa.getFlota().size();
		Integer valorEsp = 1;
		
		assertEquals(valorEsp, valorObt);
	}
	
	
//Obligatorio
	@Test
	public void QueSeObtengaUnaListaDeCaionesTiendaOrdenadosPorPatentes() {
		Empresa empresa = new Empresa();
		Camion camion = new Camion("33");
		Camion tienda1 = new TiendaCamion("12");
		Camion tienda2 = new TiendaCamion("88");
		Camion tienda3 = new TiendaCamion("11");
		Camion tienda4 = new TiendaCamion("22");
		Camion tienda5 = new TiendaCamion("77");
		empresa.agregarCamion(camion);
		empresa.agregarCamion(tienda1);
		empresa.agregarCamion(tienda2);
		empresa.agregarCamion(tienda3);
		empresa.agregarCamion(tienda4);
		empresa.agregarCamion(tienda5);
		
		assertEquals("11", empresa.obtenerTiendascamionOrdenadoPorPatente().first().getPatente());
		assertEquals("88", empresa.obtenerTiendascamionOrdenadoPorPatente().last().getPatente());
		
	}


}
