import java.util.ArrayList;

public class Ejerc5 {
    

    public static void main(String[] args) {
        ArrayList<Integer> horasTrabajadas = new ArrayList<>();
        ArrayList<Integer> valorPorHora = new ArrayList<>();
        ArrayList<Integer> valorTotal = new ArrayList<>();

        cargarHorasTrabajadas(horasTrabajadas);
        cargarValorPorHora(valorPorHora);

        Integer sueldo = 0;

        for (Integer i=0; i<=4; i++) {
            valorTotal.add(horasTrabajadas.get(i) * valorPorHora.get(i));
        }

        for (Integer i=0; i<=4; i++) {
            sueldo = sueldo + valorTotal.get(i);
        }

        System.out.println(horasTrabajadas);
        System.out.println(valorPorHora);
        System.out.println(valorTotal);
        System.out.print("Total Final: $" + sueldo);

        
    }
    public static void cargarHorasTrabajadas(ArrayList<Integer> horasTrabajadas){
        horasTrabajadas.add(8);
        horasTrabajadas.add(5);
        horasTrabajadas.add(3);
        horasTrabajadas.add(6);
        horasTrabajadas.add(7);
    }
    public static void cargarValorPorHora(ArrayList<Integer> valorPorHora){
        valorPorHora.add(425);
        valorPorHora.add(570);
        valorPorHora.add(350);
        valorPorHora.add(290);
        valorPorHora.add(300);
    }
}
