public class Gato  extends Mascota  {

private boolean esDeInterior;
public Gato (String nombre, int edad, boolean interior){
    super(nombre, edad);
    this.esDeInterior = interior;
}
@Override
public void hacerSonido(){
    super.hacerSonido();
    System.out.println("Miau");
}
@Override
public void mostrarInfo(){
    super.mostrarInfo();
    System.out.println("Es mascota de interior: " + (esDeInterior ? "Sí" : "No"));
}
}
