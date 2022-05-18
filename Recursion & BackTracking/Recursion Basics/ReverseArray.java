public class ReverseArray {
    public static void main(String[] args) {
        int nums[] = new int[]{1,2,3,4,5,6,7};
        Reverse(nums, 0, nums.length-1);
        for(int n : nums){
            System.out.print(n+" ");
        }
    }

    static void Reverse(int arr[],int i,int n){
        if(i>=n/2){
           return;
        }
        swap(arr,i,n);
        i++;
        n--;
    }

    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
