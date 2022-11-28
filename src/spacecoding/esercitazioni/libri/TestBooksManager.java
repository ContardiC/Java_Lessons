package spacecoding.esercitazioni.libri;

public class TestBooksManager {

    public static void main(String[] args) {
        Book[] books=new Book[100];

        books[0]=new Book("Carlos","Castaneda","Viaggio ad Ixtlan",200);
        books[1]=new Book("Carlos","Castaneda","L'isola del Tonal",300);
        books[2]=new Book("Georges Ivanovič","Gurdjieff","La vita è reale solo quando io sono",400);
        int i=0;
        System.out.println("---> ELENCO LIBRI");
        while(books[i]!=null){
            System.out.println(books[i].toString());
            i++;
        }
        Book[] selection=new Book[100];
        selection=BooksManager.arrayByAuthor(books,"Carlos","Castaneda");
        i=0;
        System.out.println("---> ELENCO LIBRI DI CARLOS CASTANEDA");
        while(selection[i]!=null){
            System.out.println(selection[i].toString());
            i++;
        }
        System.out.println("---> LIBRO CON IL MAGGIOR NUMERO DI PAGINE");
        Book maxPages;
        maxPages=BooksManager.maxPages(books);
        System.out.println(maxPages.toString());


        System.out.println("---> ESISTE IL LIBRO: VIAGGIO AD IXTLAN?");
        System.out.println("Risposta: "+ BooksManager.isExist(books,"Viaggio ad Ixtlan"));
        System.out.println("---> ESISTE IL LIBRO: I QUATTRO ACCORDI?");
        System.out.println("Risposta: "+ BooksManager.isExist(books,"I Quattro Accordi"));

        System.out.println("---> INDICE E VISUALIZZAZIONE PER TITOLO");
        int index;
        index=BooksManager.indexByTitle(books,"Viaggio ad Ixtlan");
        if(index>=0){
            System.out.println("Risposta: indice = "+index);
            System.out.println(books[index].toString());
        }else{
            System.out.println("Risposta: Il libro cercato non è presente");
        }
        System.out.println("---> OGGETTO CLASSE LIBRO PER TITOLO");
        Book sel;
        sel=BooksManager.bookByTitle(books,"L'isola del Tonal");
        if(sel!=null){
            System.out.println(sel.toString());
        }else{
            System.out.println("Risposta: Il libro cercato non è presente");
        }
    }
}
