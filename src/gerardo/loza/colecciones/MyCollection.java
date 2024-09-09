package gerardo.loza.colecciones;
import java.util.ArrayList;

public class MyCollection {
	private ArrayList<Integer> elementos;
	private int longitud = 0;
	
	public void agregar(int elemento) {
		elementos.add(elemento);
	}
	
	public void agregar(int elemento, int posicion){
		elementos[posicion] = elemento;
		longitud ++;
	}
	
	public int tamanio(){
		return longitud;
	}
		 
	public boolean estaVacia(){
		boolean resultado;
		if (longitud == 0){
			resultado = true;
		}
		else {
			resultado = false;
		}
		return resultado;
	}

}
