//package functional;
//
//import java.util.function.Function;
//
//public class Ex1 {
//
////    1. Rescrie urmatoarea metoda ca o expresie lambda:
////    public static String everySecondChar(String source) {
////        StringBuilder returnVal = new StringBuilder();
////        for (int i = 0; i < source.length(); i++) {
////            if (i % 2 == 1) {
////                returnVal.append(source.charAt(i));
////            }
////        }
////        return returnVal.toString();
////    }
////    In primul rand, cauta pe Google si/sau ChatGPT si/sau in documentatia din IntelliJ ce face StringBuilder si metoda append.
////
////    Apoi rescrie functia clasica ca o functie lambda.
////
////    Apoi executa acea functie lambda si paseaza-i ca parametru: "1234567890".
////
////    Apoi creeaza o noua functie clasica numita everySecondCharacter() care accepta ca si parametru o functie lambda si un alt String.
////    Executa functia lamba in cadrul metodei everySecondCharacter(), si apeleaza everySecondCharacter() pasandu-i functia lambda creata
////    ca prim parametru si string-ul "1234567890" ca al doilea parametru.
//
//
//    public static void main(String[] args) {
//        //wrfd -> "ewASFDG"
//        Function<String, String> everySecondChar = source ->{
//            StringBuilder returnVal = new StringBuilder();
//            for (int i = 0; i < source.length(); i++) {
//                if (i % 2 == 1) {
//                    returnVal.append(source.charAt(i));
//                }
//            }
//            return returnVal.toString();
//        };
//
//        System.out.println(everySecondChar.apply("efdsawefsd"));
//
//        }
//    }
//
//    public static String everySecondChar(String source) {
//        Function<String, String> expression = source -> {
//            StringBuilder returnVal = new StringBuilder();
//            for (int i = 0; i < source.length(); i++) {
//                if (i % 2 == 1) {
//                    returnVal.append(source.charAt(i));
//                }
//            }
//            return returnVal.toString();
//        };
//        System.out.println(expression.apply("abcdefgh"));
//        everySecondChar(expression, "abcdefgh")
//    }
//
//    public static String everySecondChar(Function<String, String> function, String source) {
//        return function.apply(source);
//    }
//}
