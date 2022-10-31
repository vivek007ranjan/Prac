public class UI {
    public static void main(String[] args) {

    AmazonStore AmazonSarjapur = new AmazonStore();
    Customer CArr[] = new Customer[10];

        for(int i=0 ; i<9; i++) {
            CArr[i] = new Customer("C-" + i);
        }

        AmazonSarjapur.addCustomer(CArr);
        AmazonSarjapur.ShowCustomers();
        AmazonSarjapur.Register(CArr[0]);
        AmazonSarjapur.Register(CArr[1]);
        AmazonSarjapur.Register(CArr[2]);

        AmazonSarjapur.informall();

        for(int i=0 ; i< CArr.length; i++) {
            if(CArr[i]!=null)
            CArr[i].CallBack();
        }

    }
}
