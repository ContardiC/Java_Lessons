package spacecoding.data.linkedlist;

public class TestLista {
    public static void main(String[] args) {
        Note nota1=new Note("Ricerca sulle lontre","Kotaro e Hana",1);
        Note nota2=new Note("Appunti di PuffoGino","dormire oggi",1);
        Note nota3=new Note("Appunti di Nino","cercare più crocchini",1);
        Lista lista=new Lista();
        lista.inserisciInTesta(nota1);
        lista.inserisciInCoda(nota2);
        lista.inserisciInTesta(nota3);
        System.out.println("Ci sono : "+lista.getElementi()+" elementi memorizzati");
        System.out.println(lista.elenco());
        try {
            lista.inserisciInPosizione(nota1,4);
        } catch (ListaException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Ci sono : "+lista.getElementi()+" elementi memorizzati");
        System.out.println(lista.elenco());
        try {
            lista.eliminaIntesta();
        } catch (ListaException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Ci sono : "+lista.getElementi()+" elementi memorizzati");
        System.out.println(lista.elenco());

    }
}
