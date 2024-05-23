import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una lista para almacenar objetos EstudianteIngenieria
        List<EstudianteIngenieria> listaEstudiantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los datos de los estudiantes
        for (int i = 0; i < 2; i++) { // Iteramos dos veces para ingresar datos de dos estudiantes
            System.out.println("Ingrese los datos del estudiante " + (i + 1) + ":");

            // Pedir cada dato por separado
            System.out.print("Cédula: ");
            String cedula = scanner.nextLine();

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Teléfono: ");
            String telefono = scanner.nextLine();

            System.out.print("Número de Semestre: ");
            int numeroSemestre = Integer.parseInt(scanner.nextLine());

            System.out.print("Promedio Acumulado: ");
            float promedioAcumulado = Float.parseFloat(scanner.nextLine());

            System.out.print("Serial: ");
            String serial = scanner.nextLine();

            // Crear un objeto EstudianteIngenieria con los datos ingresados
            try {
                EstudianteIngenieria estudiante = new EstudianteIngenieria(cedula, nombre, apellido, telefono, numeroSemestre, promedioAcumulado, serial);
                listaEstudiantes.add(estudiante);
            } catch (IllegalArgumentException e) {
                System.out.println("Error al crear el estudiante: " + e.getMessage());
                // Si se produce un error, no se agregará el estudiante a la lista
            }

            System.out.println(); // Agregar una línea en blanco entre cada estudiante ingresado
        }

        // Iterar sobre la lista y mostrar los detalles de los estudiantes
        System.out.println("Detalles de los estudiantes:");
        for (EstudianteIngenieria estudiante : listaEstudiantes) {
            System.out.println(estudiante);
        }
    }
}
