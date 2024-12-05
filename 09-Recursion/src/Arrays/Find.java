package Arrays;

import java.util.ArrayList;

public class Find {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,5,6,7,8,9};

//        System.out.println(find(arr, 0, 0));
//        System.out.println(findIndex(arr,8,0));
//        findAllIndex1(arr,5,0);
//        System.out.println(list);
//
//        ArrayList<Integer> ans ;
//        ans = find_All_Index2(arr,5,0,new ArrayList<>());
//        System.out.println(ans);

          System.out.println(findAllIndex3(arr,5,0));

    }
    static boolean find (int[] arr , int target, int index)
    {
        if(index == arr.length)
        {
            return false;
        }
        return arr[index] == target || find(arr,target,index+1);
    }
    static int findIndex (int[] arr , int target, int index)
    {
        if(index == arr.length)
        {
            return -1;
        }
        if(arr[index] == target)
        {
            return index;
        }
        else {
            return findIndex(arr ,target,index+1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex1(int[] arr , int target , int index)
    {
        if(index == arr.length)
        {
            return ;
        }
        if(arr[index] == target)
        {
            list.add(index);
        }
        findAllIndex1(arr ,target,index+1);
    }
    // List as argument

    static ArrayList<Integer> find_All_Index2(int[] arr , int target, int index,ArrayList<Integer> list)
    {
        if(index == arr.length)
        {
            return list;
        }
        if(arr[index] == target)
        {
            list.add(index);
        }
        return find_All_Index2(arr,target,index+1,list);
        ///System.out.println("ji");
    }
    static ArrayList<Integer> findAllIndex3(int[] arr , int target, int index)
    {
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length)
        {
            return list;
        }
        if(arr[index] == target)
        {
            list.add(index);
        }
        list.addAll(findAllIndex3(arr,target,index+1));

        return list;
        //return findAllIndex3(arr,target,index+1);
    }
}
