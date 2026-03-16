public class SumofN{
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        int sum = 0;
        for(int i = 1;i <= n;i++){
            if(count <= n){
                sum = sum + count;
                count = count + 1;
            }else{
                System.out.println(sum);
            }
        }
        System.out.println(sum);
        // if(count <= 5 ){
        //     for(int i = 1;i<=n;i++){
        //         sum = sum + i;
        //     }
        //     System.out.println(sum);
        // }else{
        //     System.out.println(sum);
        // }
    }
}