
public class AmazonStore {
    int RegNum;
    Customer mem[];

    public void Register(Customer c) {
        c.setRegnum(RegNum);
        RegNum++;
    }

    public void addCustomer(Customer[] c){
        mem = c;
    }
    public void ShowCustomers(){
        for (Customer x : mem) {
                System.out.println("Welcome " + x );
    }}
    public void informall() {

        for (Customer x : mem) {
            if(x!=null)
            if (x.IsMember() ) {
                System.out.println("Welcome " + x + "\n - Hurry up \n Bumper -50% Sale is Live");
            }
        }
    }
    public void inform(Customer c) {

            if (c.IsMember()){
                System.out.println("Welcome " + c + "\n - Hurry up \n Bumper -50% Sale is Live");
            }
    }

}
