
import java.util.Arrays;

public class Main {
    public static void afis(int []v){
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int []a = {5, 2, 1, 7, 9, 3, 0};
        afis(a);
        Arrays.sort(a);
        afis(a);

        int poz = Arrays.binarySearch(a, 5);
        System.out.println(poz >0 ? "Gasit pe pozitia " + poz : "Nu se gaseste !");
        int []b = Arrays.copyOf(a, a.length);
        afis(b);

        String[][] persoane = { {"Dl. ", "Dna. ", "Drsa. "}, {"Popescu", "Georgescu"}};

        for(int i = 0; i < persoane.length; i++){
            for(int j = 0; j < persoane[i].length; j++){
                System.out.println(persoane[i][j]);
            }
            System.out.println();
        }
    }
}