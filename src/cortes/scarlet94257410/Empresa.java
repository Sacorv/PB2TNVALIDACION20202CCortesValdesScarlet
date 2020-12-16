package cortes.scarlet94257410;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

//import ar.edu.unlam.pb2.eda3.grupo01.Cliente;

public class Empresa {

	// completar la clase Empresa

	// si es necesraio agregue los metodos atributos y clases que crea que sea
	// conveniente
	private String nombre;
	private HashMap<Integer, Camion> flota;

	public Empresa() {
		this.flota = new HashMap<Integer, Camion>();
		this.nombre = "";
	}

	public void agregarCamion(Camion camion) {

		// se agrega uncamion el primer camion tiene como identificador 0 el el segundo
		// 1 2 3.4
		Integer identificador = this.flota.size()+1;
		
		this.flota.put(identificador, camion);
	}

	public Integer cantidadDeCamiones() {
		
		return this.flota.size();
	}

	public TreeSet<Camion> obtenerTiendascamionOrdenadoPorPatente() {
		TreeSet<Camion> tiendasOrdenadas = new TreeSet<Camion>(new PorPatenteComparador());
		
		Collection<Camion> camiones = this.flota.values();
		for(Iterator<Camion> it = camiones.iterator(); it.hasNext();) {
			Camion elCamion = it.next();
			if(elCamion instanceof TiendaCamion) {
				tiendasOrdenadas.add((TiendaCamion)elCamion);
			}
		}
		return tiendasOrdenadas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashMap<Integer, Camion> getFlota() {
		return flota;
	}

	public void setFlota(HashMap<Integer, Camion> flota) {
		this.flota = flota;
	}
	
	

}
