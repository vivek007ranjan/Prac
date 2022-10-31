public class GenericArr<T,K> {
    private int index=0;
    private T[] arrobj;
    GenericArr(int length){
        arrobj = (T[]) new Object[length];
    }
    public int getLength(){
       return arrobj.length;
    }
    public void append(T a){
        arrobj[index++] = a;
    }
    public void getArr() {
        for (int x=0 ; x<index;x++) {
            System.out.println(arrobj[x]);
        }
    }

}
