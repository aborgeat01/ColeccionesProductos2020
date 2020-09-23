package ar.edu.unlam.producto;

public class Producto {

	private String codigo;
	private String descripcion;
	private Double precio;
	public Producto(String codigo, String descripcion, Double precio) {
		
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
}
