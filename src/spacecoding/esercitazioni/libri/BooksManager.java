package spacecoding.esercitazioni.libri;

public class BooksManager {
    public static Book[] arrayByAuthor(Book[] books, String authorFn, String authorLn){
        int booksByAuthor=0;
        int i=0;
        while(books[i]!=null&&i<100){
            if(books[i].getAuthorFirstName().equals(authorFn)&&books[i].getAuthorLastName().equals(authorLn)){
                booksByAuthor++;
            }
            i++;
        }
        Book[] selection=new Book[booksByAuthor+1];
        int j=0;
        i=0;
        while(books[i]!=null){
            if(books[i].getAuthorFirstName().equals(authorFn)&&books[i].getAuthorLastName().equals(authorLn)){
                selection[j]=books[i];
                j++;
            }
            i++;
        }
        return selection;
    }
    public static Book maxPages(Book[] book){
        int max;
        max=book[0].getPagesNumber();
        int i=1, index=0;
        while(book[i]!=null){
            if(book[i].getPagesNumber()>max){
                max=book[i].getPagesNumber();
                index=i;
            }
            i++;
        }
        return book[index];
    }
    public static boolean isExist(Book[] book,String title){
        int i=0;
        while(book[i]!=null){
            if(book[i].getTitle().equals(title)){
                return true;
            }
            i++;
        }
        return false;
    }
    public static int indexByTitle(Book[] book,String title){
        int i=0;
        while(book[i]!=null){
            if(book[i].getTitle().equals(title)){
                return i;
            }
            i++;
        }
        return -1;
    }
    public static Book bookByTitle(Book[] book,String title){
        int i=0;
        while(book[i]!=null){
            if(book[i].getTitle().equals(title)){
                return book[i];
            }
            i++;
        }
        return null;
    }
}