package administradores;

import java.util.ArrayList;
import java.util.List;

import vo.Arca;

public class AdministradorDeArcas {
	private List<Arca> arcas;

	public AdministradorDeArcas() {
		this.arcas = new ArrayList<Arca>();
	}
	
	public List<Arca> listarTodasLasArcas(){
		return this.arcas;
	}

	public boolean agregarArca(String nombre, int valor, int cantidad) {
		if(valor<0)
			return false;
		if(valor%50!=0)
			return false;
		if (cantidad<0) 
			return false;
		this.arcas.add(new Arca(nombre, valor, cantidad));
		return true;
	}

	public Arca obtenerArcaPorIndiceDeIdentificador(int arcaIdentificador) {
		if(arcaIdentificador<0)
			return null;
		if(arcaIdentificador>=this.arcas.size())
			return null;
		return this.arcas.get(arcaIdentificador);
	}

	public boolean editarArca(int arcaIdentificador, String nombre, int valorDenominacion, int cantidad) {
		if (valorDenominacion<0 || valorDenominacion%50!=0)
			return false;
		if(cantidad<0)
			return false;
		this.arcas.remove(arcaIdentificador);
		this.arcas.add(new Arca(nombre, valorDenominacion, cantidad));
		return true;
	}
	
}
