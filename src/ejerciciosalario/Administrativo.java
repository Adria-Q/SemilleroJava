
package ejerciciosalario;



public  class Administrativo extends Empleado{ // Subclase
    
     double bono; 

    public Administrativo(String nombre, String apellido, int edad, double sueldoBase) {
        super(nombre, apellido, edad, sueldoBase);
        this.bono = 35;
    }
     @Override
    public double calcularSueldoTotal() {
         double total = this.sueldoBase + this.sueldoBase * (bono / 100);
        total = total + this.bono;
        return total;
    }
    
    
    
    
    
    

}
