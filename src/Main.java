import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Criar uma lista de números
        List<Double> numeros = new ArrayList<>();

        // Utilizar os métodos da biblioteca para calcular média, mediana e moda
        double media = NumberUtils.calcularMedia(numeros);
        double mediana = NumberUtils.calcularMediana(numeros);
        List<Double> moda = NumberUtils.calcularModa(numeros);

        // Ordenar a lista em ordem crescente e decrescente
        NumberUtils.ordenarLista(numeros, true);
        List<Double> numerosOrdenadosCrescente = new ArrayList<>(numeros);
        NumberUtils.ordenarLista(numeros, false);
        List<Double> numerosOrdenadosDecrescente = new ArrayList<>(numeros);

        // Exibir os resultados
        System.out.println("Lista de números: " + numeros);
        System.out.println("Média: " + media);
        System.out.println("Mediana: " + mediana);
        System.out.println("Moda: " + moda);
        System.out.println("Lista ordenada (crescente): " + numerosOrdenadosCrescente);
        System.out.println("Lista ordenada (decrescente): " + numerosOrdenadosDecrescente);
    }
}

