import java.io.Serializable;

public class SerializeStu implements Serializable {
    static int counter = 0;
    String name;
    int rollNo;
    String Std;
    SerializeStu(){};
    SerializeStu(String Name,String std){
        counter++;
        this.name   = Name;
        this.Std    = std;
        this.rollNo = counter;
    }

    public String toString(){
        return this.rollNo+"_"+this.name+ "_"+ this.Std;
    }

}
