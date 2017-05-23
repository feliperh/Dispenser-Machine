package vistas;

import controladores.ControladorCliente;
import herramientas.IOUsuario;

public class VistaCliente {
	
	private ControladorCliente controladorCliente;
	private boolean controlMenu;
	
	public VistaCliente(ControladorCliente controladorCliente) {
		this.controladorCliente = controladorCliente;
	}

	public void ingresarVistaCliente(){
		controlMenu = true;
		while(controlMenu){
            System.out.println( "\nMenu cliente:" );
            System.out.println( "1. Cambiar Servicio." );
            System.out.println( "2. Agregar Producto" );
            System.out.println( "3. Agregar Espiral." );
            System.out.println( "10. Salir." );
            try {
            	int opcion = Integer.parseInt(IOUsuario.lecturaTeclado.readLine());
            	if(controladorCliente.getMaquina().isFueraDeServicio()){
    				System.out.println("La maquina esta fuera de servicio.");
    				System.out.println("Contacte el administrador.");
    				controlMenu=false;
    			}else{
    				 switch (opcion) {
    	        		case 1:
    	        			
    	        			break;
    	        		case 2:
    	        			
    	        			break;
    	        		case 3:
    	        			
    	        			break;
    	        		case 10:
    	        			controlMenu = false;
    	        			break;
    	        		default:
    	        			System.out.println( "\nIntenta nuevamente." );
    	        			break;
    				 	}
    				}
    			} catch (Exception e) {
    			System.out.println( "\n¡Digita un entero por favor!" );
    		}
      	} 
	}

}
