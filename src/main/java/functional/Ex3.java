package functional;

import java.util.function.Supplier;

public class Ex3 {

//    3. Scrie o functie lambda care sa returneze string-ul "Imi place Java".
//    Functia lambda va implementa interfata functionala Supplier si va fi asignata unei variabile.
//
//    Executa apoi functia lambda scrisa.

    public static void main(String[] args) {
        Supplier<String> textSupplier = () -> "imi place java";
        System.out.println(textSupplier.get());
    }
}
