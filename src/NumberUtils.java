import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberUtils {

    public static double calcularMedia(List<Double> numeros) {
        if (numeros.isEmpty()) {
            System.out.println("Não existem números na lista");
        }

        double soma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i);
        }
        return soma / numeros.size();
    }

    public static double calcularMediana(List<Double> numeros) {
        if (numeros.isEmpty()) {
            System.out.println("Não existem números na lista");
        }
        Collections.sort(numeros);

        int meio = numeros.size() / 2;
        if (numeros.size() % 2 == 0) {
            return (numeros.get(meio - 1) + numeros.get(meio)) / 2;
        } else {
            return numeros.get(meio);
        }
    }

    public static List<Double> calcularModa(List<Double> numeros) {
        if (numeros.isEmpty()) {
            System.out.println("Não existem números na lista");
        }

        List<Double> moda = new ArrayList<>();
        int maxCount = 0;

        for (double numero : numeros) {
            int count = Collections.frequency(numeros, numero);
            if (count > maxCount) {
                moda.clear();
                moda.add(numero);
                maxCount = count;
            } else if (count == maxCount && !moda.contains(numero)) {
                moda.add(numero);
            }
        }
        return moda;
    }

    public static void ordenarLista(List<Double> numeros, boolean crescente) {
        if (crescente) {
            Collections.sort(numeros);
        } else {
            Collections.sort(numeros, Collections.reverseOrder());
        }
    }
}
