package MachineDispenser.MachineDispenser;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import administradores.AdministradorDeProducto;
import vo.Espiral;
import vo.Maquina;
import vo.Producto;

public class PruebasUnitarias {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void insertarProductoPaqueteDePapasYObtenerNombre() {
		AdministradorDeProducto administradorDeProducto = new AdministradorDeProducto();
		administradorDeProducto.agregarProductoALaMaquina(new Producto("Paquete de Papas", 750));
		assertEquals("Paquete de Papas", administradorDeProducto.listarTodosLosProductos().get(0).getNombreProducto());
		
	}
	
	@Test
	public void insertar2ProductoPaqueteDePapasYObtenerNombre() {
		AdministradorDeProducto administradorDeProducto = new AdministradorDeProducto();
		administradorDeProducto.agregarProductoALaMaquina(new Producto("Paquete de Papas", 750));
		administradorDeProducto.agregarProductoALaMaquina(new Producto("Paquete de tajadas naturales", 1550));
		assertEquals("Paquete de tajadas naturales", administradorDeProducto.listarTodosLosProductos().get(1).getNombreProducto());
		
	}
	
	@Test
	public void encontrarProductoEnAdministradorDeProductosPorNombre() {
		AdministradorDeProducto administradorDeProducto = new AdministradorDeProducto();
		administradorDeProducto.agregarProductoALaMaquina(new Producto("Paquete de Papas".toLowerCase(), 750));
		assertEquals("paquete de papas", administradorDeProducto.obtenerProducto("paquete de papas").getNombreProducto());
	}
	
	@Test
	public void encontrarProductoEnAdministradorDeProductosPorObjeto() {
		AdministradorDeProducto administradorDeProducto = new AdministradorDeProducto();
		Producto p = new Producto("paquete de papas", 750);
		administradorDeProducto.agregarProductoALaMaquina(p);
		assertEquals(p, administradorDeProducto.obtenerProducto("paquete de papas"));
	}
	
	@Test
	public void noEncontrarProductoEnAdministradorDeProductos() {
		AdministradorDeProducto administradorDeProducto = new AdministradorDeProducto();
		administradorDeProducto.agregarProductoALaMaquina(new Producto("Paquete de Papas", 750));
		assertNull(administradorDeProducto.obtenerProducto("paquete"));
	}
	
	@Test
	public void errorAlAgregarEspiralFueraDeRangoColumna100() {
		Maquina maquina = new Maquina();
		boolean agregado = maquina.getAdministradorDeEspirales().agregarEspiralALaMaquina(new Espiral(new Producto("Galletas", 1000), 1000, 'a', 100));
		assertFalse(agregado);
	}
	
	@Test
	public void errorAlAgregarEspiralEnFilaFueraDeRangoEnFilaArroba() {
		Maquina maquina = new Maquina();
		boolean agregado = maquina.getAdministradorDeEspirales().agregarEspiralALaMaquina(new Espiral(new Producto("Galletas", 1000), 1000, '@', 10));
		assertFalse(agregado);
	}
	
	@Test
	public void agregarEspiralDentroDeRango() {
		Maquina maquina = new Maquina();
		boolean agregado = maquina.getAdministradorDeEspirales().agregarEspiralALaMaquina(new Espiral(new Producto("Galletas", 1000), 1000, 'z', 10));
		assertTrue(agregado);
	}
}
