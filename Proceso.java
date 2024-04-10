/**
 * @author Jose Donado
 * Esta clase implementa a la interfaz Comparable con el fin de comparar la prioridad de procesos. La prioridad (PR) depende del valor nice, que 
 * está en un rango de -20 a 19, en donde un valor menor indica mayor prioridad. El sistema de administración de Linux solo reconoce un rango de 100
 * a 139, por lo que a la prioridad Nice se le suman 20 unidades, que estará dentro del rango de prioridades del sistema y ya puede ser reconocido por Linux.
 */

public class Proceso implements Comparable<Proceso> {
    private String nombreProceso;
    private String nombreUsuario;
    private int valorNice;
    


//Constructor 
public Proceso(String nombreProceso, String nombreUsuario, int valorNice){
    this.nombreProceso = nombreProceso;
    this.nombreUsuario = nombreUsuario;
        this.valorNice = valorNice;

}


@Override

//Uso del método compareTo
    public int compareTo(Proceso otroProceso) {
        // Calcular la prioridad (PR) según el valor nice del proceso

        //El valor Nice afecta la prioridad del proceso. En esta caso, si es menor aumentará la prioridad.
        int prioridad = 120 + this.valorNice;

        // Comparar la prioridad con la del otro proceso
        return Integer.compare(prioridad, 120 + otroProceso.valorNice);
    }

    

    // Getters y setters

/**
 * 
 * @param nombreProceso
 */
    public String getNombreProceso() {
        return nombreProceso;
    }



    public void setNombreProceso(String nombreProceso) {
        this.nombreProceso = nombreProceso;
    }


/**
     * 
     * @param nombreUsuario
     */

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getValorNice() {
        return valorNice;
    }

    public void setValorNice(int valorNice) {
        this.valorNice = valorNice;
    }

    // Sobreescribir el método toString para imprimir los datos del proceso
    @Override
    public String toString() {
        return nombreProceso + "," + nombreUsuario + "," + valorNice + ", PR=" + (120 + valorNice);
    }
}


