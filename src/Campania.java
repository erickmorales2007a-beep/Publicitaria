public class Campania {
    public String nombre;
    public double presupuesto;

    String plataforma;
    boolean activa;

    public void mostrarInformacion() {
        System.out.println("Campaña: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Presupuesto: $" + presupuesto);
        System.out.println("Activa: " + activa);
    }

    public void activar() {
        activa = true;
        System.out.println("La campaña en " + plataforma + " ha sido activada.");
    }

    void desactivar() {
        activa = false;
        System.out.println("La campaña en " + plataforma + " ha sido desactivada.");
    }

    void mostrarPresupuesto() {
        System.out.println("Presupuesto de la campaña " + nombre + ": $" + presupuesto);
    }
}