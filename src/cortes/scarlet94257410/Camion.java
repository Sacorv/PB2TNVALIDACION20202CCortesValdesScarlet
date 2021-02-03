package cortes.scarlet94257410;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion  {
	
	// completar la clase Empresa

	// si es necesraio agregue los metodos atributos y clases que crea que sea
	// conveniente
	
	
	private String patente;
	private List <Producto> listaProductos;
	
	
	public Camion (String patente) {
		this.patente = patente;
		this.listaProductos = new ArrayList<>();
	}
	
	
	public Boolean cargarProducto(Producto producto) {
		/*
		 * carga el producto en la lista de producto 
		 *   
		 * 
		 */
		return this.listaProductos.add(producto);
	}
	
	
	public Producto descargarProducto(Integer idProducto) throws ProductoInexistenteException {
	
		/*
		 * buesca y un producto por su id y devuelve el producto encontrado
		 * por otro lado elimina dicho producto de la coleccion
		 * encaso que el idProducto no se encuentre retorna una exception ProductoInexistenteException
		 */
		Producto productoBuscado = null;
		
		for(Producto producto : this.listaProductos) {
			if(!(producto.getId().equals(idProducto))) {
				throw new ProductoInexistenteException("El producto no se encuentra");
			}
			else {
				productoBuscado = producto;
			}
		}
		this.listaProductos.remove(productoBuscado);
		
		return productoBuscado; 
	}
	

	public String getPatente() {
		return patente;
	}


	public void setPatente(String patente) {
		this.patente = patente;
	}


	public List<Producto> getListaProductos() {
		return listaProductos;
	}


	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}


	
}
