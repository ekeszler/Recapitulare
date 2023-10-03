package functional.Ex11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex11 {
    //        11. Gestiunea tranzactiilor
//        O tranzactie este caracterizata de id, amount si de contul din care s-a facut tranzactia
//        (HINT: atribute: id, sum, account - care este de tip Account)
//        Un cont este caracterizat de balance (sold) si un account number (numar de cont) (HINT - aceasta va fi clasa Account).
//        Avand o lista de tranzactii intr-un main, scrie o metoda care primeste aceasta lista de tranzactii si genereaza o mapa in care cheia sa fie numarul de            cont, iar valoarea sa fie suma amount-urilor tututor tranzactiilor care au avut loc din acel cont.
//        (HINT) - Collectors.summingLong.
//                Rezolva apoi problema si fara expresii lambda.
    public static void main(String[] args) {
        Account account1 = new Account("1", 40);
        Account account2 = new Account("2", 1000);
        Account account3 = new Account("3", 9000);
        List<Transaction> transactions = Arrays.asList(new Transaction(1,20,account1), new Transaction(2,5,account2), new Transaction(3,700,account2), new Transaction(4,9000,account3));

        System.out.println(getSumOfTransactionByAccountNumber(transactions));


        Map<String, Integer> sumOfTransactionsByAccountNumber =  transactions.stream()
                .collect(Collectors.groupingBy(transaction -> transaction.getAccount().getAccountNumber(), Collectors.summingInt(transaction -> transaction.getAmount())));
        System.out.println(sumOfTransactionsByAccountNumber);
    }

    public static Map<String, Integer> getSumOfTransactionByAccountNumber (List<Transaction> transactions){
        Map<String, Integer> sumOfTransactionsByAccountNumber = new HashMap<>();
        for(Transaction transaction : transactions){
            String transactionAccountNumber = transaction.getAccount().getAccountNumber();
            if (sumOfTransactionsByAccountNumber.containsKey(transactionAccountNumber)){
                sumOfTransactionsByAccountNumber.put(transactionAccountNumber, transaction.getAmount() + sumOfTransactionsByAccountNumber.get(transactionAccountNumber));
            }
            else{
                sumOfTransactionsByAccountNumber.put(transactionAccountNumber, transaction.getAmount());
            }
        }
        return sumOfTransactionsByAccountNumber;
    }
}
