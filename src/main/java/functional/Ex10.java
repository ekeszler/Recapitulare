package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex10 {

//    10. Spell checker 2
//    Avand intr-un main un String, in care se stocheaza un text si o lista de cuvinte gresite, scrie o functie care accepta acesti 2 parametrii si returneaza lista cu cuvintele gresite care se regasesc in text Exemplu:
//
//    Input: String text = “acesta etse nu text”
//    List<String> badWords = [“etse”, “nu”, “acetsa”, “extt”]
//    Output: [“etse”, “nu”], pentru ca acestea sunt cuvintele din badWords care se regasesc in text
//            (HINT: stream pe lista badWords, apoi filtram doar cuvintele care sunt continute in text (folosind metoda contains()) )
//
//    Rezolva problema si fara expresii lambda

    public static void main(String[] args) {

        String text = "acesta etse nu text";
        List<String> badWords = List.of("etse", "nu", "acetsa", "extt");
        System.out.println(findBadWords(text,badWords));

        String[] textWords = text.split(" ");
        List<String> foundBadWords = Arrays.stream(textWords)
                .filter(word -> badWords.contains(word))
                .collect(Collectors.toList());

        System.out.println(foundBadWords);
    }

    public static List<String> findBadWords(String text, List<String> badWords){
        List<String> foundBadWords = new ArrayList<>();
        String[] textWords = text.split(" ");
        for(String word : textWords){
            if(badWords.contains(word)){
                foundBadWords.add(word);
            }
        }
        return foundBadWords;
    }
}
