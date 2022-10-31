public class GenericDemo<G> {
    G obj;
    public void SetData(G obj){
        this.obj = obj;
    }
    public G GetData(){
     return this.obj;
    }
}

