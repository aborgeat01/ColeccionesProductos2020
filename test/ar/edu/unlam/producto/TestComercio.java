package ar.edu.unlam.producto;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class TestComercio {

	
	@Test
	public void QueSeAgregueUnProductoAlListaDelComercio() {
	
		Producto p1= new Producto("1", "Termo", 4000.0);
		Comercio c= new Comercio ("La tienda Del Matero");
		Boolean agrego=c.agregarAlistaDeProducto(p1);
		
		assertTrue(agrego);
		
		Integer ve=1;
		Integer vo=c.obternerCantidadDeProductos();
		assertEquals(ve,vo);
		}
	
	@Test
	public void QueObtengaUnProductoDeLaListaDelComercio() {
	
		
		Comercio c= new Comercio ("La tienda Del Matero");
		Producto p1= new Producto("1", "Termo", 4000.0);
		Producto p2= new Producto("2", "Bombilla", 100.0);
		Producto p3= new Producto("3", "Los Auriculares DeJuanma", 1500.0);
		
		c.agregarAlistaDeProducto(p2);
		c.agregarAlistaDeProducto(p1);
		c.agregarAlistaDeProducto(p3);
		String codigo="2";
		Producto productoEncontrado=c.buscarProductoPorCodigo(codigo);
		
		assertEquals(codigo, productoEncontrado.getCodigo());
		
	}
	

}
