import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        String archivo = "procesos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            PriorityQueue<Proceso> colaPrioridad = new PriorityQueue<>();

            System.out.println("Prioridad de Atención por el CPU con ChichicasteLinux: ");

            // Leer el archivo línea por línea
            while ((linea = br.readLine()) != null) {

                //Recordar que de primero va el nombre del proceso, luego usuario y finalmente el Nice.
                String[] partes = linea.split(",");
                String nombreProceso = partes[0];
                String nombreUsuario = partes[1];
                int valorNice = Integer.parseInt(partes[2]);

                // Crear un objeto Proceso y agregarlo a la cola de prioridad
                Proceso proceso = new Proceso(nombreProceso, nombreUsuario, valorNice);
                colaPrioridad.offer(proceso);
            }

            // Retirar los procesos de la cola de prioridad y mostrarlos en orden de prioridad
            while (!colaPrioridad.isEmpty()) {
                Proceso proceso = colaPrioridad.poll();
                System.out.println(proceso);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
