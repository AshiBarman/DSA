public class CountPairSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7,8,9};
        int tar = 12;

        int l=0;
        int r = arr.length-1;
        int count =0;

        while(l<r){
            if(arr[l]+arr[r]==tar){
                System.out.println("pairfound at index "+l+", "+r);
                count++;
                l++;
                r--;
        }else if(arr[l]+arr[r]>tar){
            r--;
        }else {
            l++;
        }
    }
    if (count == 0) {
            System.out.println("Pair not found");
        }

        System.out.println("Total pairs found: " + count);
}}
