import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.set(2, 25);
        System.out.println(list.get(3));
        list.remove(1);
        System.out.println(list);
        System.out.println(list.size());
        for(int i = 0;i< list.size(); i++){
            System.out.println(list.get(i));
        }
        for(int num : list){
            System.out.println(num);
        }
    }
}
