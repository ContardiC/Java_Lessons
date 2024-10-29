package spacecoding.enumtype;

public enum TrafficLight {

    RED ("Stop"),
    YELLOW ("Wait"),
    GREEN ("Go");
    
    private String action;

    // constructor
    private TrafficLight(String action){
        this.action = action;
    }
    // getter
    public String getAction(){
        return action;
    }
}
