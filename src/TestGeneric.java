public class TestGeneric {
    public static void main(String[] args) {
        GenericDemo var = new GenericDemo();
        var.SetData(10);
        GenericDemo var1 = new GenericDemo();
        var1.SetData(15);
        System.out.println(var.GetData());
        GenericDemo var2 = new GenericDemo();
        var2.SetData("this is string");

        GenericArr<Character,Integer> c = new GenericArr<>(10);
        GenericArr s = new GenericArr<>(5);
        GenericArr<GenericDemo,Integer> E = new GenericArr<>(12);
        GenericArr<String,Integer> F = new GenericArr<>(10);

        System.out.println(c.getLength());

        c.append('a');
        c.append('b');
        c.append('c');
        c.append('d');

        s.append("Hello");
        s.append(4);
        s.append(2.3f);
        s.append("world");
        s.append("Vivek");

        E.append(var);
        E.append(var1);
        E.append(var2);


        c.getArr();
        s.getArr();
        E.getArr();


    }
}

