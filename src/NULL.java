/**
 * Created by: Administrator 2018-09-06 16:03
 * 功能：
 */
public class NULL {

    public static void print(){
        System.out.println("MTDP");
    }
    public static void main(String[] args) {
        try{
            ((NULL)null).print();
        }catch(NullPointerException e){
            System.out.println("NullPointerException");
        }
    }
}
