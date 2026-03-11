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
        System.out.println(list.contains(30));
        int s = list.get(0); 
        for(int i : list){
            if(i > s){
                s = i;
            }
            }
        System.out.println(s);

        int sum =0;
        for(int i : list){
            sum += i;
        }
        System.out.println(sum);

        int avg = sum / list.size();
        System.out.println(avg);

        for (int i= list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }
        int count = 0;
        for (int i :list){
            if(i % 2 == 0){
            count++;
        }
    }
        System.out.println(count);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}