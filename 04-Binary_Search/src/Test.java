public class Test {


    public static void main(String[] args){
        int[] arr = {1,4,8,12,20,32};


        System.out.println();
        //this will generate infinately sorted array
        int ans = searchInInfiniteArray(arr,32);
        System.out.println(ans);
    }
    static int searchInInfiniteArray(int[]arr,int t){
        //take initial range as 0-1, and then find the range by comparing end value with target
        int start = 0;
        int end = 1;
        while(true){
            if(t>arr[end]){
                start=end;
                end=end*2;
            }
            else{
                //apply bs on that range
                return binarySearch(arr,t,start,end);
            }
        }

    }
    static int binarySearch(int[] arr,int t,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==t){
                return mid;
            }
            else if(arr[mid]<t){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}


