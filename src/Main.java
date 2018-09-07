
import java.util.*;

public class Main {

    public ArrayList<Integer> list = new ArrayList<Integer>();

    public int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for(int i = 0;i < list.size();i++)
            sum += list.get(i);
        return sum;
    }
    public static int num = 0;
    public void getSubSet(int[] A, int m, int step) {
        while(step < A.length) {
            list.add(A[step]);
            if(getSum(list) == m)
            {
                System.out.println(list);
                num++;
            }

            step++;
            getSubSet(A, m, step);
            list.remove(list.size() - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        String music = sc.nextLine();
        String[] musicArray = music.split(" ");
        int [] musicArrayInt = new int[musicArray.length];
        for (int i = 0; i <musicArray.length ; i++) {
            musicArrayInt[i] = Integer.valueOf(musicArray[i]);
        }

        Main test = new Main();
        int[] A = new int[musicArrayInt[1] + musicArrayInt[3]];
        for(int i = 0;i < A.length;i++) {
            if(i<musicArrayInt[1]){
                A[i] = musicArrayInt[0];
            }
            else{
                A[i] = musicArrayInt[2];
            }
        }
        test.getSubSet(A, n, 0);
        System.out.println(test.num);
    }

}
