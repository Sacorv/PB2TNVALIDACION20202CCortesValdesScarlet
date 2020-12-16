package cortes.scarlet94257410;

public class Reporte {

	private Double totalVentas;
	private Double totalIva;
	private Double totalNeto;
	

	public Reporte(Double totalVentas, Double totalIva, Double totalNeto) {
		this.totalVentas = totalVentas;
		this.totalIva = totalIva;
		this.totalNeto = totalNeto;
	}


	public String imprimirReporte() {   
		//formato de impresion es totalVenta-totalIva-totalNeto
		
		return this.totalVentas+"-"+this.totalIva+"-"+this.totalNeto;
	}


	public Double getTotalVentas() {
		return totalVentas;
	}


	public void setTotalVentas(Double totalVentas) {
		this.totalVentas = totalVentas;
	}


	public Double getTotalIva() {
		return totalIva;
	}


	public void setTotalIva(Double totalIva) {
		this.totalIva = totalIva;
	}


	public Double getTotalNeto() {
		return totalNeto;
	}


	public void setTotalNeto(Double totalNeto) {
		this.totalNeto = totalNeto;
	}
	
	
}
