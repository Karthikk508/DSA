import java.util.ArrayList;
public class Union_of_arrays {


       public static void main(String[] args)
       {
           int[] a = {1,2,3,4,5,6};
           int[] b = {1,2,3,4,5,6,789};
           System.out.println(sortedArray(a,b));
       }

        public static ArrayList<Integer> sortedArray(int []a, int []b) {
            // Write your code here
            int i = 0;
            int j = 0;
            ArrayList<Integer> list = new ArrayList<Integer>();
            while(i<a.length && j<b.length)
            {
                if(a[i]<=b[j])
                {
                    if(list.size() == 0 || list.get(list.size()-1) != a[i]){
                        list.add(a[i]);
                    }
                    i++;
                }
                else{
                    if(list.size() == 0 || list.get(list.size()-1) != b[j]){
                        list.add(b[j]);
                    }
                    j++;
                }
            }
            while(j<b.length)
            {
                if(list.size() == 0 || list.get(list.size()-1) != b[j])
                {
                    list.add(b[j]);
                }
                j++;
            }
            while(i<a.length)
            {
                if(list.size() == 0 || list.get(list.size()-1) != a[i]){
                    list.add(a[i]);
                }
                i++;
            }

            return list;
        }
}
