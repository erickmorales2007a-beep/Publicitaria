public class Main {
    public static void main(String[] args) {
        // Creación de una campaña de Instagram
        Campania campania1 = new Campania();
        campania1.nombre = "Moda Verano";
        campania1.plataforma = "Instagram";
        campania1.presupuesto = 1200.50;
        campania1.activa = false;

        // Creación de una campaña de TikTok
        Campania campania2 = new Campania();
        campania2.nombre = "Reto Baile";
        campania2.plataforma = "TikTok";
        campania2.presupuesto = 800.00;
        campania2.activa = false;

        // Creación de una campaña de Facebook
        Campania campania3 = new Campania();
        campania3.nombre = "Lanzamiento App";
        campania3.plataforma = "Facebook";
        campania3.presupuesto = 1500.00;
        campania3.activa = false;

        System.out.println("=== ESTADO INICIAL DE LAS CAMPAÑAS ===");
        campania1.mostrarInformacion();
        System.out.println();
        campania2.mostrarInformacion();
        System.out.println();
        campania3.mostrarInformacion();
        System.out.println("----------------------------------------");

        System.out.println("Modificando únicamente la campaña de Instagram...\n");
        campania1.activar();

        System.out.println("\n=== ESTADO FINAL ===");
        System.out.println("Instagram activa? " + campania1.activa);
        System.out.println("TikTok activa? " + campania2.activa);
        System.out.println("Facebook activa? " + campania3.activa);
    }
}