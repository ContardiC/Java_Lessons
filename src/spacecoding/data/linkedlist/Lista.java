package spacecoding.data.linkedlist;

public class Lista {
    private Nodo head;
    private int elementi;
    public Lista(){
        head=null;
        elementi=0;
    }
    /* TODO: implementare esamina
    public void visitaLista(){
        Nodo p = head;
        while(p!=null){

        }
    }
    */
    public Nodo getLinkPosizione(int posizione) throws ListaException {
        int n=1;
        Nodo p=head;
        if(head==null){
            throw new ListaException("Lista vuota");
        }
        if((posizione>elementi)||(posizione<1)){
            throw new ListaException("Posizione non valida");
        }
        while((p.getLink()!=null)&&(n<posizione)){
            p=p.getLink();
            n++;
        }
        return p;
    }
    public Nodo creaNodo(Note nota, Nodo link){
        Nodo nuovoNodo=new Nodo(nota);
        nuovoNodo.setLink(link);
        return nuovoNodo;
    }
    public void inserisciInTesta(Note nota){
        head= creaNodo(nota,head);
        elementi++;
    }
    public void inserisciInCoda(Note nota){
        if(head==null){
            inserisciInTesta(nota);
        }else{
            try{
                Nodo p=getLinkPosizione(elementi);
                p.setLink(creaNodo(nota,null));
                elementi++;
            }catch(ListaException e){

            }
        }
    }
    public void inserisciInPosizione(Note nota,int posizione) throws ListaException{
        if(posizione<=1){
            inserisciInTesta(nota);
        }else{
            if(elementi<posizione){
                inserisciInCoda(nota);
            }else{
                Nodo p=getLinkPosizione(posizione-1);
                p.setLink(creaNodo(nota,p.getLink()));
            }
        }
    }
    public void eliminaIntesta() throws ListaException{
        if(head==null)
            throw new ListaException("Lista vuota");
        head=head.getLink();
        elementi--;
    }
    public void  eliminaInCoda() throws ListaException{
        if(head==null)
            throw new ListaException("Lista vuota");
        Nodo p=getLinkPosizione(elementi-1);
        p.setLink(null);
        elementi--;
    }
    public void eliminaInPosizione(int posizione) throws ListaException{
        if(posizione==1){
            eliminaIntesta();
        }else{
            if(posizione==elementi){
                eliminaInCoda();
            }else{
                Nodo ps=getLinkPosizione(posizione);
                Nodo pp=getLinkPosizione(posizione-1);
                pp.setLink(ps.getLink());
                elementi--;
            }
        }
    }
    public String visualizza(Nodo p){
        if(p==null){
            return "";
        }
        return p.getInfo().toString()+"\n"+visualizza(p.getLink());
    }
    public String elenco(){
        return visualizza(head);
    }

    public int getElementi() {
        return elementi;
    }
}
