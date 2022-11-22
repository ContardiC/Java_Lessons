package spacecoding.data.array;

import java.util.Vector;

public class BankAccountsManager {
    public static void main(String[] args) {
        //Vector bankAccounts = new Vector(1,0);
        Vector<BankAccount> bankAccounts = new Vector<BankAccount>(1,0);
        BankAccount bankAccount1 = new BankAccount("123456789","Mario","Rossi",50000);

        // aggiungo gli elementi all'array
        bankAccounts.add(bankAccount1);
        bankAccounts.add(new BankAccount("987654321","Giovanni","Mela",50000));

        // visualizzo il numero di elementi dell'array
        System.out.println("Ci sono memorizzati: "+bankAccounts.size()+ " conti correnti");
        // visualizzo il primo elemento
        System.out.println(bankAccounts.firstElement().toString());
        // visualizzo l'ultimo elemento
        System.out.println(bankAccounts.lastElement().toString());
        // visualizzo un elemento specificandone la posizione
        System.out.println(bankAccounts.get(0).toString());
        // sostituisco un elemento specificando la posizione
        BankAccount bankAccount3=new BankAccount("132413321","William","Cancelli",100000);
        bankAccounts.set(1,bankAccount3);
        // rimuovo un elemendo specificando la posizione
        bankAccounts.remove(0);
        // rimuovo tutti gli elementi del vettore
        bankAccounts.clear();
        // controllo se è vuoto
        if(bankAccounts.isEmpty()){
            System.out.println("L'array è vuoto");
        }else{
            System.out.println("L'array non è vuoto");
        }



    }
}
