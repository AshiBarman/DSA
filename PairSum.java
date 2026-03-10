public class PairSum{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7};
        int tar = 12;

        int l=0;
        int r = arr.length-1;
        boolean pairFound = false;

        while(l<r){
            if(arr[l]+arr[r]==tar){
                System.out.println("pairfound at index "+l+", "+r);
                pairFound = true;
                break;
        }else if(arr[l]+arr[r]>tar){
            r--;
        }else {
            l++;
        }
    }
    if(!pairFound){
        System.out.println("pair not found");
    }
}}