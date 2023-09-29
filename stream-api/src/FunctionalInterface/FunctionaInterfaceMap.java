package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionaInterfaceMap {

    public static void main(String[] args) {
        List <Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Function<Integer, Integer> dobro = numero -> numero * 2;

        List <Integer> listaDobro = numeros.stream()
            .map(dobro)
            .collect(Collectors.toList());

        listaDobro.forEach(System.out::println);
    }
}
