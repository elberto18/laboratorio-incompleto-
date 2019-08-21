package materia;
import java.util.Scanner;

public class Materia {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        Estudiante alumno = new Estudiante();
        System.out.print("Ingrese el Nombre del Estudiante: ");
        alumno.setnombre(Teclado.nextLine());
        System.out.print("Ingrese el Nombre de la Asignatura: ");
        alumno.setasignatura(Teclado.nextLine());
        System.out.print("Ingrese el Codigo del Estudiante: ");
        alumno.setcodigo(Teclado.nextInt());
        System.out.print("Ingrese el Número de Notas: ");
        alumno.setcanNotas(Teclado.nextInt());
        double [] nota = new double [alumno.getcanNotas()];
        int [] porcentaje = new int [alumno.getcanNotas()];
        alumno.filNotas(Teclado.nextLine());
        for (int i = 0; i < alumno.getcanNotas(); i++){
            System.out.print("Ingrese la Nota " + (i+1) + ": ");
            /*nota[i]= Teclado.nextDouble();
            alumno.setnotas(nota);*/
            System.out.print("Ingrese el porcentaje de la Nota " + (i+1) + ": ");
            porcentaje[i]=Teclado.nextInt();
            alumno.setporNotas(porcentaje);
        }
        alumno.ImprimirDaots();
        alumno.resultadoMateria();
    }
}