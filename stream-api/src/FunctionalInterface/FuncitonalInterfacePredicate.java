package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FuncitonalInterfacePredicate {
    
    public static void main(String[] args) {
        
        List<String> palavras = Arrays.asList("Java", "C#", "JavaScript", "Python", "PHP", "Ruby", "Go", "Kotlin");

        Predicate<String> maisDeCincoLetras = palavra -> palavra.length() > 5;

        palavras.stream()
            .filter(palavra -> palavra.length() > 5)
            .forEach(System.out::println);
    }
}
