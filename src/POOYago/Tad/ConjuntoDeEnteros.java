package POOYago.Tad;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ConjuntoDeEnteros {
    
    private Set<Integer> conjunto;
    
    public ConjuntoDeEnteros() {//crea un conjunto vacío.
        conjunto = new HashSet<Integer>();
    }
    
    public void insertar(int elemento) {//agrega el elemento especificado al conjunto.
        conjunto.add(elemento);
    }
    
    public void eliminar(int elemento) {//elimina el elemento especificado del conjunto.
        conjunto.remove(elemento);
    }
    
    public boolean pertenece(int elemento) {//devuelve true si el elemento especificado pertenece al conjunto y false en caso contrario
        return conjunto.contains(elemento);
    }
    
    public int cardinalidad() {// devuelve la cantidad de elementos en el conjunto
        return conjunto.size();
    }
    
    public int aleatorio() {//devuelve un valor aleatorio del conjunto utilizando la clase Random de Java.
        Random random = new Random();
        int index = random.nextInt(conjunto.size());
        int i = 0;
        for (int elemento : conjunto) {
            if (i == index) {
                return elemento;
            }
            i++;
        }
        return 0;
    }
    
    public String toString() {//devuelve una representación textual de los valores del conjunto en formato de conjunto de matemáticas.
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        for (int elemento : conjunto) {
            sb.append(elemento);
            sb.append(" ");
        }
        sb.append("}");
        return sb.toString();
    }
}
