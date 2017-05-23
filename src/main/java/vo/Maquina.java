package vo;

import administradores.AdministradorDeArcas;
import administradores.AdministradorDeEspirales;
import administradores.AdministradorDeProducto;

public class Maquina {
	
	private boolean fueraDeServicio;
	private AdministradorDeProducto administradorDeProducto;
	private AdministradorDeEspirales administradorDeEspirales;
	private AdministradorDeArcas administradorDeArcas;
	
	public Maquina(){
		this.fueraDeServicio=true;
		administradorDeArcas = new AdministradorDeArcas();
		administradorDeProducto = new AdministradorDeProducto();
		administradorDeEspirales = new AdministradorDeEspirales();
	}
	
	public AdministradorDeArcas getAdministradorDeArcas() {
		return administradorDeArcas;
	}

	public void setAdministradorDeArcas(AdministradorDeArcas administradorDeArcas) {
		this.administradorDeArcas = administradorDeArcas;
	}

	public AdministradorDeEspirales getAdministradorDeEspirales() {
		return administradorDeEspirales;
	}

	public void setAdministradorDeEspirales(AdministradorDeEspirales administradorDeEspirales) {
		this.administradorDeEspirales = administradorDeEspirales;
	}

	public AdministradorDeProducto getAdministradorDeProducto() {
		return administradorDeProducto;
	}

	public void setAdministradorDeProducto(AdministradorDeProducto administradorDeProducto) {
		this.administradorDeProducto = administradorDeProducto;
	}

	public boolean isFueraDeServicio() {
		return fueraDeServicio;
	}

	public void setFueraDeServicio(boolean fueraDeServicio) {
		this.fueraDeServicio = fueraDeServicio;
	}
	
	public void cambiarEstado(){
		if(this.fueraDeServicio){
			this.fueraDeServicio=false;
		}else{
			this.fueraDeServicio=true;
		}
			
	}
	
}