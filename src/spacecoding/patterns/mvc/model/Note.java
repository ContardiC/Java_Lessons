package spacecoding.patterns.mvc.model;

import java.io.Serializable;

public class Note implements Serializable {
    private String title;
    private String body;
    private int priority;
    public Note(String title,String body,int priority){
        this.title=title;
        this.body=body;
        this.priority=priority;
    }
    public Note(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Note{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
