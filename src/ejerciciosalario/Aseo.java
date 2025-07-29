
package ejerciciosalario;

public  class Aseo extends Empleado { // Subclase.
    
   double subsidioTransporte;
   double bono;

    public Aseo(String nombre, String apellido, int edad, double sueldoBase) {
        super(nombre, apellido, edad, sueldoBase);
        this.subsidioTransporte=160000;
        this.bono=5;
    }
   @Override
    public  double calcularSueldoTotal() {
        double total= sueldoBase+sueldoBase*(5/100);
        return total=sueldoBase+subsidioTransporte;
    }
    
    
  
    
}
