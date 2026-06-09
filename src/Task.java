public class Task {
    int id;
    String description;
    
    Task(int id, String description){
        this.id=id;
        this.description=description;
    }

    public String toString(){

        return "ID: "+id+"\nDescription: "+description;

    }
}
 