public class Stu{
    private int rollNum;
    private String Name;
    private String Clas;

     public Stu(int rollNum,String Name,String Clas) throws Exception
     {   if (rollNum <=0)
         throw new MyException("Invalid Roll Number");
         this.rollNum = rollNum;
         this.Name= Name;
         this.Clas = Clas;
     }

     int getrollNum()
     {
        return  rollNum;
     }
     String getName(){
        return  Name;
    }
    String getClas(){
        return  Clas;
    }

}
