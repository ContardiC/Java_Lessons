package spacecoding.collections.linkedlist;

public class ListaException extends Exception{
    private String error="";
    ListaException(String error){
        this.error=error;
    }
    public String getError(){
        return error;
    }
}
