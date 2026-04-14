public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Zeus", 5, "Labrador");
        Gato gato = new Gato("Coquito", 3, true);

        System.out.println("Datos del perro");
        perro.mostrarInfo();
        perro.hacerSonido();

        System.out.println("\nDatos del gato");
        gato.mostrarInfo();
        gato.hacerSonido();
    }
}
