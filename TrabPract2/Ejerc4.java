import java.util.ArrayList;
import java.util.List;

public class Ejerc4 {
    

    public static void main(String[] args) {
        List<String> alumnos = new ArrayList<>();

        cargarLista(alumnos);

        List<String> curso1 = alumnos.subList(0, 4);
        List<String> curso2 = alumnos.subList(4, 8);
        List<String> curso3 = alumnos.subList(8, 12);

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
    }

    public static void cargarLista(List<String> alumnos) {
        alumnos.add("Jimena");
        alumnos.add("Luis");
        alumnos.add("Robert");
        alumnos.add("Mariela");
        alumnos.add("Raúl");
        alumnos.add("Jazmin");
        alumnos.add("Oscar");
        alumnos.add("Fabiana");
        alumnos.add("Jose");
        alumnos.add("Paola");
        alumnos.add("Marcelo");
        alumnos.add("Selena");
    }
}