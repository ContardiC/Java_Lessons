package spacecoding.datastructures.linkedlist;

public class Nodo {
    private Note info;
    private Nodo link;

    public Nodo(Note info){
        this.info=info;
        link=null;
    }
    public void setInfo(Note info){
        this.info=info;
    }
    public Note getInfo(){
        return info;
    }
    public void setLink(Nodo link){
        this.link=link;
    }
    public Nodo getLink(){
        return link;
    }

}
