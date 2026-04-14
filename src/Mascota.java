public class Mascota {

    protected String nombre;
    protected int edad;


    public   Mascota (String nombre, int edad){

        this.nombre = nombre;
        this.edad = edad;


    }
    public void hacerSonido(){

        System.out.println("Sonido caracteristico del animal");


    }
    public void mostrarInfo(){
        System.out.println("Nombre de la mascota es : "+ nombre );
        System.out.println("La eda de la criaturita es: " + edad + " años");


    }


}
