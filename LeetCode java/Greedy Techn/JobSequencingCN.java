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