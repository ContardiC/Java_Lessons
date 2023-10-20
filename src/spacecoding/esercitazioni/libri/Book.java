package spacecoding.esercitazioni.libri;

public class Book {
    private String authorFirstName;
    private String authorLastName;
    private String title;
    private int pagesNumber;

    public Book(String authorFirstName, String authorLastName, String title, int pagesNumber) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.title = title;
        this.pagesNumber = pagesNumber;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorFirstName='" + authorFirstName + '\'' +
                ", authorLastName='" + authorLastName + '\'' +
                ", title='" + title + '\'' +
                ", pagesNumber=" + pagesNumber +
                '}';
    }
}
