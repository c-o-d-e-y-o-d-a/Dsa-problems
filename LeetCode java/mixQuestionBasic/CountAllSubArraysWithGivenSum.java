//optimal approach , uses two pointers

import java.util.*;
import java.io.*;

public class Solution {
    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        int p1 = 0;
        int p2 = 0;
        int finalAns = 0;
        int currSum = 0;

        while (p2 < arr.length) {
            currSum += arr[p2];
            
            while (currSum > s && p1 <= p2) {
                currSum -= arr[p1];
                p1++;
            }

            if (currSum == s) {
                finalAns++;
            }

            p2++;
        }

        return finalAns;
    }
}
