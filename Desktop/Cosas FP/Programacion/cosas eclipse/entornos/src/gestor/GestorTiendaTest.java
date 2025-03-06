package gestor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

class GestorTiendaTest {

	@Test
	public void testCalcularDescuento() {
		GestorTienda gestor = new GestorTienda();
        assertEquals(10.0, gestor.calcularDescuento(100, 10), 0.01);
        assertEquals(5.0, gestor.calcularDescuento(100, 5), 0.01);
        assertEquals(0.0, gestor.calcularDescuento(100, 4), 0.01);
    }

	@Test
    public void testCategorizarProducto() {
		GestorTienda gestor = new GestorTienda();
        assertEquals("Económico", gestor.categorizarProducto(5));
        assertEquals("Estándar", gestor.categorizarProducto(20));
        assertEquals("Premium", gestor.categorizarProducto(100));
    }
	 @Test
	    public void testBuscarProducto() {
		 GestorTienda gestor = new GestorTienda();
	        String[] inventario = {"Sandia", "Platano", "Kiwi"};
	        assertEquals("Sandia", gestor.buscarProducto(inventario, "Sandia"));
	        assertEquals("Kiwi", gestor.buscarProducto(inventario, "Kiwi"));
	        assertNull(gestor.buscarProducto(inventario, "Pera"));
	    }
	
}

