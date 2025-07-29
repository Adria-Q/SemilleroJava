
package ejerciciosalario;


public  class Desarrollador extends Empleado {  // subclase.
    double bono;
    double subsidio;

    public Desarrollador(String nombre, String apellido, int edad, double sueldoBase) {
        super(nombre, apellido, edad, sueldoBase);
        
        this.bono=10;
        this.subsidio=160000;
    }

    @Override
    public double calcularSueldoTotal() {
        double total = this.sueldoBase + this.sueldoBase * (bono / 100);
        total = total + this.subsidio;
        return total;
    }
        
}
