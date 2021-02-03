package cortes.scarlet94257410;

import java.util.ArrayList;
import java.util.List;


/*
 * La clase tiendaCamion pertenece a la familia de los camiones y tambien se comporta como una tienda
 * 
 * Desarrolle  e implemente los metodos pedido para que la clase cumpla con sus funcionalidades
 */
public class TiendaCamion  extends Camion implements ITienda{
	
	private Double iva = 0.21;
	private List<Producto> ventas;
	private Boolean estadoDeCaja; // True Abierta - False Cerrada
	
	
	public TiendaCamion(String patente) {
		super(patente);
		this.ventas = new ArrayList<>(); 
		this.estadoDeCaja = false;
	}


	public void abrirCaja() {
		// Al Inicicio del dia limpia todas las ventas
		// y abre la caja diaria

		this.ventas.clear();
		this.estadoDeCaja = true;
	}

	public Producto buscarProducto(Integer idProducto) {
		Producto prodBuscado = null;
		for(Producto prod : this.getListaProductos()) {
			if(prod.getId().equals(idProducto)) {
				prodBuscado = prod;
			}
		}
		return prodBuscado;
	}

//	@Override
//	public Boolean cargarProducto(Producto producto) {
//		
//		//return this.ventas.add(producto);
//		return this.getListaProductos().add(producto);
//	}
	
	@Override
	public void vender(Integer idProducto) throws CajaCerradaException, ProductoInexistenteException {
		Producto prodBuscado = buscarProducto(idProducto);
		
		if(this.estadoDeCaja == false) {
			throw new CajaCerradaException("La caja esta cerrada, no se puede vender antes debe abrir la caja");
		}
		if(prodBuscado==null) {
			throw new ProductoInexistenteException("El producto no existe");
		}
		this.ventas.add(prodBuscado);
	}


	@Override
	public Reporte cierreZ() {
		this.estadoDeCaja = false;
		Double totalVentas = (double) this.ventas.size();
		
		Double totalNeto = 0.0; 
		
		for(Producto prod : this.ventas) {			
			totalNeto+= prod.getPrecio(); 
			}
		
		Double totalIva = totalNeto*iva;
		
		Reporte reporteDelDia = new Reporte(totalVentas, totalIva, totalNeto);
		
		return reporteDelDia;
	}



	
	

}
