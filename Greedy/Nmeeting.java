import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Meeting{
    int start;
    int end;
    int pos;

    Meeting(int start,int end,int pos){
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}

class meetingComparator implements Comparator<Meeting>{
    public int compare(Meeting o1 , Meeting o2){
        if(o1.end < o2.end)
            return -1;
        else if(o1.end>o2.end)
                return 1;
        else if(o1.pos < o2.pos)
                return -1;
                
        return 1;        
    }
}


public class Nmeeting {
    public static void main(String[] args) {
        int []start = new int[]{1,3,0,5,8,5};
        int []end = new int[]{2,4,6,7,9,9};
        
        
        findMeetings(start, end);
    }

    static void findMeetings(int []start , int []end){
        ArrayList<Meeting> meet = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int  i =0;i<start.length-1;i++){
            meet.add(new Meeting(start[i],end[i],i+1));
        }
        meetingComparator mc = new meetingComparator();
        Collections.sort(meet,mc);

        result.add(meet.get(0).pos);
        int limit = meet.get(0).end;

        for(int i=1;i<start.length-1;i++){
            if(meet.get(i).start > limit){
                limit = meet.get(i).end;
                result.add(meet.get(i).pos);
            }
        }

        System.out.println(result);

    }
}
