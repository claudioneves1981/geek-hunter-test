import java.util.*;

public class MyClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        String[] comanda = new String[n];
        TreeMap<String, Integer> mapacomanda = new TreeMap<>();
        String[] dividepalavra;

        for (int i = 0; i < n; i++) {
            if(i == 0){
                comanda[i] = scanner.nextLine();
            }
            comanda[i] = scanner.nextLine();
        }

        for(int i = 0 ; i < n ; i++) {
            dividepalavra = comanda[i].split(" ");
            mapacomanda.put(dividepalavra[0],Integer.parseInt(dividepalavra[1]));
        }


        List<Integer> valorestotal = new ArrayList<>(mapacomanda.values());
        int somatotal = 0;
        for (Integer integer : valorestotal) {
            somatotal = integer + somatotal;
        }

        String[] divideremover;
        String remover = scanner.nextLine();
        divideremover = remover.split(" ");
        for (String s : divideremover) {
            mapacomanda.remove(s);
        }


        List<Integer> valores = new ArrayList<>(mapacomanda.values());
        int soma = 0;
        for (Integer valor : valores) {
            soma = valor + soma;
        }

        int result = soma/c;
        System.out.println(somatotal);
        System.out.println(result);
        System.out.println(somatotal-soma);

    }
}