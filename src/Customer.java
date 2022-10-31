public class Customer implements Member {
    private int Regnum;
    private String Name;
    private int Contact;

    public Customer(String name) {
        Name = name;

    }

    public void setRegnum(int regnum) {
         this. Regnum = regnum;
    }
    public int getRegnum() {
        return Regnum;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getContact() {
        return Contact;
    }

    public void setContact(int contact) {
        Contact = contact;
    }


    @Override
    public Boolean IsMember() {
        if (getRegnum()!=0)
        return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Regnum= " + Regnum +
                ", Name= " + Name + '\'' +
                ", Contact= " + Contact +
                '}';
    }

    @Override
    public void CallBack() {
        System.out.println(toString()+" - Good to hear");
    }
}
