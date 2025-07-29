package ejerciciosalario;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioSalario {

    static ArrayList<Empleado> empleados = new ArrayList<>(); 

    static Scanner sc = new Scanner(System.in);                

    public static void main(String[] args) {

        int opcion;                 
            // bucle do While  
        do {
            System.out.print("\n Menu---");
            System.out.print("\n Opcion 1: Agregar empleado");
            System.out.print("\n Opcion 2: Consultar empleados");  // opciones que se van a mostrar al usuario.
            System.out.print("\n Opcion 3: Aumentar sueldo");
            System.out.print("\n Opcion 0: Salir");
            System.out.print("\n Elige una opcion: ");

            opcion = sc.nextInt();  // guardamos en scanner.
            sc.nextLine();

            switch (opcion) {
                case 1:
                    agregarEmpleado();

                    break;
                case 2:
                    consultarEmpleado();
                    break;
                case 3:
                    aumentarSueldo();
                    break;
                case 0:
                    System.out.println(" Hasta luego");
                    break;
               
            }
        } // si la opcion es diferente a 0.
        while (opcion != 0);

    }  // entonces... creamos un metodo para agregar a los empleados.
    
         // primer punto de la guia.

    static void agregarEmpleado() {
        System.out.println(" Tipo de empleado: 1. Desarrollador, 2.Administrativo, 3.Aseo");  // las opciones que mostramos al usuario para agregar un empleado.
        int tipoEmpleado = sc.nextInt();        //guardamos 
        sc.nextLine();
        
       //Pedimos los datos del empleado  que se desea ingresar 
        System.out.println(" nombre:"); 
        String nombre = sc.nextLine();
        System.out.println("Apellido:");
        String apellido = sc.nextLine();
        System.out.println(" Edad:");
        int edad = sc.nextInt(); 
        System.out.println(" Sueldo Total");
        double sueldoBase = sc.nextDouble();
           // creamos un switch para  mostrar  los datos del empleado que ha ingresado.
        switch(tipoEmpleado) {
            case 1:
                empleados.add(new Desarrollador(nombre, apellido, edad, sueldoBase));
                break;
            case 2:
                empleados.add(new Administrativo(nombre, apellido, edad, sueldoBase));
                break;
            case 3:
                empleados.add(new Aseo(nombre, apellido, edad, sueldoBase));
                break;
            default:
                break;
        }

    }
       // segundo punto de la guia.
    static void consultarEmpleado() { // para este punto debemos mostrar los empleados ingresados y deberan agruparse por sus categorías 
        ArrayList<Empleado> desarrolladores = new ArrayList<>();
        ArrayList<Empleado> administrativos = new ArrayList<>();
        ArrayList<Empleado> aseo = new ArrayList<>();

        // Agrupamos con un solo for each
        for (Empleado e : empleados) {
            if (e instanceof Desarrollador) desarrolladores.add(e);
            else if (e instanceof Administrativo) administrativos.add(e); 
            else if (e instanceof Aseo) aseo.add(e);
             // otra manera.
            /*switch (e){
                case Desarrollador d -> desarrolladores.add(d);
                case Administrativo a -> administrativos.add(a);
                case Aseo a -> aseo.add(a);
                
                default -> {}
            }*/
            
        }

        // Mostramos por grupo (ya están separados)
        if (!desarrolladores.isEmpty()) {
            System.out.println("\nDesarrolladores:");
            int i = 1;
            for (Empleado e : desarrolladores) {
                System.out.println(i++ + " - " + e.getNombre() + " " 
                        + e.getApellido() +", " + "edad"+ e.getEdad() + " , sueldo: $" + e.calcularSueldoTotal());
            }
        }

        if (!administrativos.isEmpty()) {
            System.out.println("\nAdministrativos:");
            int i = 1;
            for (Empleado e : administrativos) {
                System.out.println(i++ + " - " + e.getNombre() + " " 
                        + e.getApellido() +", " + "edad" + e.getEdad() + ", sueldo: $" + e.calcularSueldoTotal());
            }
        }
        if (aseo.isEmpty()) {
            System.out.println("No hay empleado de tipo aseo");
        } else {
            System.out.println("\nAseo:");
            int i = 0;
            for (Empleado e : aseo) {
                System.out.println(i++ + " - " + e.getNombre() + " " 
                        + e.getApellido() + " " + "edad" + e.getEdad() + " , sueldo: $" + e.calcularSueldoTotal());
                
            }

        }

    }

    static void aumentarSueldo() {
        double aumentoEmpleado;
        String buscarEmpleado;
        double total = 0;

        System.out.println("\n Aumentar sueldo---");
        System.out.println("\n dijite el nombre del empleado");
        buscarEmpleado = sc.nextLine();

        System.out.println("\n dijite la cantidad que desa aumentar");
        aumentoEmpleado = sc.nextDouble();

        for (Empleado empleado : empleados) {

            if (empleado.getNombre().equalsIgnoreCase(buscarEmpleado)) {
                total = aumentoEmpleado + empleado.calcularSueldoTotal();
                empleado.calcularSueldoTotal();
                 System.out.println("\n Aumento exitoso: " + total);
                 
                 

                break;

            }

        }

    }

}
