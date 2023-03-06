package POOYago.Tad;

public class ConjuntoDeEnterosArray {
	
	private int[] elementos;
    private int tam;

    public ConjuntoDeEnterosArray() {// Constructor que inicializa un conjunto vacío
        elementos = new int[100]; // tamaño máximo del conjunto
        tam = 0; // conjunto vacío
    }
    
    public void insertar(int elem) {// Inserta un entero en el conjunto si no está ya presente
        if (!pertenece(elem)) { // si el elemento no está presente
            elementos[tam] = elem;
            tam++;
        }
    }
    
    public void eliminar(int elem) {// Elimina un entero del conjunto si está presente
        int i = 0;
        while (i < tam && elementos[i] != elem) {
            i++;
        }
        if (i < tam) { // si se encontró el elemento
            elementos[i] = elementos[tam-1];//o reemplaza por el último elemento del conjunto
            tam--;
        }
    }

    public boolean pertenece(int elem) {//Comprueba si un entero pertenece al conjunto
        int i = 0;
        while (i < tam && elementos[i] != elem) {
            i++;
        }
        if (i < tam) {
        	return true; // devuelve true si se encontró el elemento
        }else {
        	return false;
        }
    }
    
    public int cardinalidad() {// Devuelve la cardinalidad del conjunto
        return tam;
    }
   
    public int aleatorio() {// Devuelve un valor aleatorio del conjunto
        if (tam == 0) {
            return 0; // no hay elementos, se devuelve cero
        } else {
            int i = (int)(Math.random() * tam);
            return elementos[i];
        }
    }

   
    public String toString() {// Representación textual de los valores del conjunto
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < tam; i++) {
            sb.append(elementos[i]);
            if (i < tam-1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
