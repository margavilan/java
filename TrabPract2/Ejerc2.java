import java.util.Scanner;
import java.util.ArrayList;

public class Ejerc2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> listaNum = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresar número: ");
            int num = sc.nextInt();
            agregarNumero(-1,listaNum, num);
        }

        System.out.println("Tamaño  inicial: " + listaNum.size());

        System.out.println("Ingresar un número para agregar al principio: ");
        int numAgregar = sc.nextInt();

        agregarNumero(0, listaNum, numAgregar);



        System.out.println("Tamaño  modificado por primera vez: " + listaNum.size());

        System.out.println("Tamaño antes de agregar al final : " + listaNum.size());


        System.out.println("Ingresar un número para agregar al final : ");
         numAgregar = sc.nextInt();
        agregarNumero(-1,listaNum, numAgregar);


        System.out.println("Tamaño  después de agregar al final : " + listaNum.size());


        imprimirLista(listaNum);
        sc.close();


    }


    public static ArrayList<Integer> agregarNumero(int index ,ArrayList<Integer> listaNum, int num ) {
        
        if (index!= -1) {
            listaNum.add(index,num);
        }else{
            listaNum.add(num);
        }
        return listaNum;
    }



    public static void imprimirLista(ArrayList<Integer>listaNum) {

        for (Integer i : listaNum) {
            
            System.out.print(i+ " - ");
        }  
    }
}