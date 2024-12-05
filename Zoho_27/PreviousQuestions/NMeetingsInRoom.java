package PreviousQuestions;


import java.util.ArrayList;
import java.util.List;

class Pair {

    int start;
    int end;

    public Pair(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
public class NMeetingsInRoom {

    public static void find(int[] start,int[] end){

        List<Pair> list = new ArrayList<>();


        for (int i = 0; i < start.length; i++) {
            list.add(new Pair(start[i],end[i]));
        }


        list.sort((o1,o2) -> Integer.compare(o1.end,o2.end));


        int endTime = 0;

        List<Integer> ansList = new ArrayList<>();


        for (int i = 0; i < list.size()-1; i++) {

            if(i == 0){
                if(list.get(i).start < list.get(i).end){
                    ansList.add(list.get(i).start);
                    endTime = list.get(i).end;
                }
            }

            if(endTime < list.get(i+1).start){
                ansList.add(list.get(i+1).start);
                endTime = list.get(i+1).end;
            }
        }

        System.out.println(ansList);

    }


    public static void main(String[] args) {

        int[] start = {1,2};
        int[] end =   {100,99};


        find(start,end);




    }
}
