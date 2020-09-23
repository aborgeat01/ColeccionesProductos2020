package ar.edu.unlam.producto;

import java.util.ArrayList;

public class Comercio {
	
	private String nombre;
	
    private ArrayList <Producto> lista= new ArrayList <Producto> ();
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private Producto [] listaProducto = new Producto [100];
    
    public Comercio(String nombre) {
		this.nombre=nombre;
    	
	}
    
    
    
    
    
    
	public void redimencionar() {
		Producto []listaProducto2= new Producto [this.listaProducto.length*2]; 
		for (int i = 0; i < listaProducto.length; i++) {
			listaProducto2[i]=listaProducto[i];
			
		}
		this.listaProducto=listaProducto2;
	}






	public Boolean agregarAlistaDeProducto(Producto producto) {
		
		return  this.lista.add(producto);
	}






	public Integer obternerCantidadDeProductos() {
		
		return this.lista.size();
	}






	public Producto buscarProductoPorCodigo(String codigo) {
                     
		
		for (Producto producto : lista) {
			if (producto.getCodigo().equals(codigo))
				return producto;
			
		}
		
		
		
		return null;
		//Otra forma
		//for (int i = 0; i < this.lista.size(); i++) {
//			if (lista.get(i).getCodigo().equals(codigo))
//				return lista.get(i);
//		}
	}

}
