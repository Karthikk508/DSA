package Arrays;

public class Binary_Search {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr,3,0,arr.length-1));
        //System.out.println(rbs(arr,3,0,arr.length-1));
        //System.out.println(bsearch(arr,0,arr.length,4));

    }
    public static int search(int[] arr , int target, int s , int e)
    {
        int mid =  s+(e-s)/2;

        if(s>e)
        {
            return -1;
        }
        if(arr[mid] == target)
        {
            return mid;
        }

        if(arr[mid] >= target)
        {
            return search(arr,target,s,mid-1);
        }
        return search(arr,target,mid+1,e);
    }

    public static int bsearch(int[] arr,int s,int e,int target)
    {
        int mid = s + (e-s)/2;

        if(s>e)
        {
            return -1;
        }

        if(arr[mid] == target)
        {
            return mid;
        }

        if(arr[mid] >= target)
        {
            return bsearch(arr,s,mid-1,target);
        }
        return bsearch(arr,mid+1,e,target);
    }
    public static int rbs(int[] arr , int target, int s , int e)
    {
        int mid =  s+(e-s)/2;

        if(s>e)
        {
            return -1;
        }
        if(arr[mid] == target)
        {
            return mid;
        }

        if(arr[mid] >= target)
        {
            return rbs(arr,target,s,mid-1);
        }
        return rbs(arr,target,mid+1,e);
    }

}
