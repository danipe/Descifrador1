import java.util.Scanner;

public class Decodificador {
	//Este es el mensaje cifrado: hola mundo
	private String mensaje="111.100.110.117.109..97.108.111.104.";
	//creo un array de strings para separar los caracteres
	private String[] chars;
	private String mensajeDescifrado="";
	
	
	
	
	public void Bomb(){	
		
	}
	
	public void rellenaArray(){
		//Cambio los puntos por espacios porque no tengo ni idea del problema que da el string.split y no me apetece buscarlo
		mensaje=mensaje.replace(".", " ");
		chars=mensaje.split(" ");
		
		
		
		
	}
	public void decodificaFrase(){
		//recorro todos los strings del array
		for(int i=0;i<chars.length;i++){
			//si el tamaño de ese string es mayor que 0 significa que no es un espacio, por lo que hay que convertir ese String a un caracter
			if(chars[i].length()>0){
			//Hago un parse int al numero dentro del string y lo transformo a caracter, y ya de paso lo meto en el mensaje descifrado
			mensajeDescifrado=(char)Integer.parseInt(chars[i])+mensajeDescifrado;
			}else{
				//si hay un espacio le añadimos un... espacio...
				mensajeDescifrado=" "+mensajeDescifrado;
			}
		}
	}
	public void sacaFrase(){
		System.out.println(mensajeDescifrado);
	}
	
	
}
