import java.util.ArrayList;
import java.util.List;

/**
 * Clase GestorDeTareas.
 * Implementa una solución basada en Listas (estructuras lineales) para gestionar 
 * una colección de datos en memoria.
 * * @author Diego Figueroa
 */
public class GestorDeTareas {

    public static void main(String[] args) {
        
        // Inicialización de la estructura de datos
        List<String> listaDeTareas = new ArrayList<>();

        System.out.println("--- Gestor de Tareas ---");

        // Inserción de elementos en la colección
        listaDeTareas.add("Configurar entorno Java");
        listaDeTareas.add("Inicializar repositorio en Git");
        listaDeTareas.add("Realizar commit inicial");

        System.out.println("\nTareas registradas:");
        mostrarTareas(listaDeTareas);

        // Modificación de la colección (eliminación por índice)
        System.out.println("\nCompletando la tarea en el índice 0...");
        listaDeTareas.remove(0); 

        System.out.println("\nTareas actualizadas:");
        mostrarTareas(listaDeTareas);
        
        // Consulta de la longitud de la lista
        System.out.println("\nTotal de tareas pendientes: " + listaDeTareas.size());
    }

    /**
     * Recorre e imprime los elementos de la lista proporcionada.
     * * @param tareas Lista de cadenas de texto a iterar.
     */
    public static void mostrarTareas(List<String> tareas) {
        if (tareas.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }

        int contador = 1;
        for (String tarea : tareas) {
            System.out.println(contador + ". " + tarea);
            contador++;
        }
    }
}