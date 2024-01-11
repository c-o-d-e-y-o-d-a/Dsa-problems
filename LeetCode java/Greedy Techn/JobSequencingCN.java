//this solution works for not for the given problem , i understood the problem a bit wrong

import java.util.*;

class Pair {
    int startTime = 0;
    int money = 0;

    Pair(int startTime, int money) {
        this.startTime = startTime;
        this.money = money;
    }
}

class MoneyCompare implements Comparator<Pair> { // Specify the type parameter in Comparator
    @Override
    public int compare(Pair o1, Pair o2) {
        if (o1.money < o2.money)
            return 1;
        else if (o1.money > o2.money)
            return -1;
        return 0;
    }
}

public class Solution {
    public static int[] jobScheduling(int[][] jobs) {
        ArrayList<Pair> list1 = new ArrayList<>(); // Use diamond operator for type inference
        HashMap<Integer, Pair> set = new HashMap<>();

        for (int i = 0; i < jobs.length; i++) {
            Pair temp = new Pair(jobs[i][1], jobs[i][2]);
            list1.add(temp); // 
        }

        MoneyCompare c = new MoneyCompare();
        Collections.sort(list1, c);

        int finalAns = 0;
        int finalSum = 0;

        for (int i = 0; i < list1.size(); i++) {
            Pair a = list1.get(i); 
            if (set.containsKey(a.startTime)) {
                continue;
            }
            set.put(a.startTime, a); 
        }

        for (int key : set.keySet()) {
            Pair a = set.get(key);
            finalAns++;
            finalSum += a.money;
        }

        int[] result = new int[2]; // Use result instead of finalAns
        result[0] = finalAns;
        result[1] = finalSum;
        return result; // Return result instead of finalAns
    }
}

//actual problem's actual solution

import java.util.*;

class Job{
    int id;
    int dedline;
    int money;
    Job(int id,int dedline,int money){
        this.id = id;
        this.dedline = dedline;
        this.money = money;

    }
}
class jobComp implements Comparator<Job>{
    @Override
    public int compare(Job a,Job b){
        if(a.money > b.money){
            return -1;
        }
        else if(a.money < b.money)return 1;
        return 0;
    }
}

public class Solution {
    public static int[] jobScheduling(int [][]jobs) {
        int[] flagArr = new int[24];
        Arrays.fill(flagArr,-1);
        ArrayList<Job> joblist = new ArrayList<Job>();
        for(int i=0;i<jobs.length;i++){
            int[] a = jobs[i];
            Job a2 = new Job(a[0],a[1],a[2]);
            joblist.add(a2);
        }
        jobComp jc = new jobComp();

        Collections.sort(joblist,jc);

        for(int i=0;i<joblist.size();i++){
            Job a = joblist.get(i);
            if(flagArr[a.dedline -1]==-1){
                flagArr[a.dedline-1 ] = a.money;
            }
            else if(flagArr[a.dedline - 1] != -1){
                for(int j=a.dedline-1;j>=0;j--){
                    if(flagArr[j]!=-1){
                        continue;
                    }
                    else{
                        flagArr[j]=a.money;
                        break;
                    }
                }
            }
        }
        int sum = 0;
        int count = 0;
        for(int i=0;i<flagArr.length;i++){
            if(flagArr[i]!=-1){
                count++;
                sum+=flagArr[i];
            }
        }
        int[] ansArray = new int[2];
        ansArray[0] = count;
        ansArray[1] = sum;

        return ansArray;






    }
} //passes 28/80 test cases

