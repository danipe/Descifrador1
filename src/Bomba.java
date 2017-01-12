import java.util.Scanner;

public class Bomba {
	//creo un mensaje que dependera de lo que introduzca el usuario
	private String mensaje="";
	//creo un string que contendrá el mensaje cifrado EJ: 111.104.104.97..97.
	private String mensajeCifrado="";
	
	public void DesBomb(){	
		
	}
	
	public void pideFase(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce la frase");
		mensaje=sc.nextLine();
		
		
	}
	public void codificaFrase(){
		//recorro todo el mensaje caracter por caracter
		for(int i = mensaje.length()-1;i>=0;i--){
			//si el caracter es un espacio no hace falta cambiar nada
			if(mensaje.charAt(i)!=' '){
			//si el caracter no es un espacio lo cambio por el equivalente en ASCII de ese caracter
			mensajeCifrado+=(int)mensaje.charAt(i);			
			}
			//Pongo un punto para diferenciar cada letra, si no es imposible descifrarlo
			mensajeCifrado+=".";			
		}		
	}
	public void sacaFrase(){
		System.out.println(mensajeCifrado);
	}
}
