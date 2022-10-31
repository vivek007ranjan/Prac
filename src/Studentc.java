public class Studentc implements Comparable {
    private int rollnum;
    private String Name;
    private int Marks;

    Studentc(int rollnum,String Name, int Marks){
        this.rollnum = rollnum;
        this.Name = Name;
        this.Marks = Marks;
    }
     public int getMarks(){
        return this.Marks;
     }

    @Override
    public int compareTo(Object o) {
         Studentc S = (Studentc) o;
         if(this.Marks>S.Marks) { return -1;}
         else if (this.Marks<S.Marks) {return 1;}
          else {
            if (this.rollnum > S.rollnum) {return -1;}
            else if (this.rollnum < S.rollnum) { return 1;}
            else { return 0;}
           }
    }

    public String toString(){
        return this.rollnum + " " + this.Name+ " "+ this.Marks;
    }
}
