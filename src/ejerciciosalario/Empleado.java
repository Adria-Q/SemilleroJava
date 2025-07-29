package ejerciciosalario;

public abstract class Empleado {  //super Clase.

    private String nombre;
    private String apellido;
    private int edad;
    public double sueldoBase;

    public Empleado(String nombre, String apellido,int edad, double sueldoBase) {  //Metodo constructor.
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sueldoBase = sueldoBase;
    }
     //Metodos Getter t Setter.
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    // Metodo abstracto para calcular el sueldo total de cada tipo de empleado 

    public abstract double calcularSueldoTotal();

}
