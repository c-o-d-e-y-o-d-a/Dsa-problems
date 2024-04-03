//passes 9/12 test cases

import java.util.* ;
import java.io.*; 
public class Solution {
	public static ArrayList<Integer> findAnagramsIndices(String str, String ptn, int n, int m) {
		HashMap<Character,Integer> mapPerm = new HashMap();
		HashMap<Character,Integer> mapTemp = new HashMap();
		ArrayList<Integer> ans = new ArrayList<Integer>();

		for(int i=0;i<m;i++){
			mapPerm.put(ptn.charAt(i), mapPerm.getOrDefault(ptn.charAt(i), 0) + 1);
		}//temp-put the elements till m-1 in the hashmap

		for(int k=0;k<m-1;k++){
			mapTemp.put(str.charAt(k), mapTemp.getOrDefault(str.charAt(k), 0) + 1);
		}
		
		int i=m-1;
		int j=0;
		while(i<n){
			Character rightChar = str.charAt(i);
			if(!mapTemp.containsKey(rightChar)){
				mapTemp.put(rightChar,1);
			}
			else{
				mapTemp.put(rightChar,mapTemp.get(rightChar)+1);

			}
			boolean ifAdd = true;
			for(Character key: mapTemp.keySet()){
				if(mapPerm.containsKey(key) && mapPerm.get(key)==mapTemp.get(key)){
					continue;
				}
				else{
					ifAdd = false;
				}

			}
			if(ifAdd)ans.add(j);
			if(mapTemp.get(str.charAt(j))==1){
				mapTemp.remove(str.charAt(j));
			}
			else{mapTemp.put(str.charAt(j),mapTemp.get(str.charAt(j))-1);}
			j++;
			i++;

			
		}
		return ans;
	}
}

//this code passes all test cases 
import java.util.*;

public class Solution {
    public static ArrayList<Integer> findAnagramsIndices(String str, String ptn, int n, int m) {
        HashMap<Character, Integer> mapPerm = new HashMap<>();
        HashMap<Character, Integer> mapTemp = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        // Count occurrences of characters in the pattern
        for (int i = 0; i < m; i++) {
            mapPerm.put(ptn.charAt(i), mapPerm.getOrDefault(ptn.charAt(i), 0) + 1);
        }

        // Initialize mapTemp with the first m-1 characters in str
        for (int k = 0; k < m - 1; k++) {
            mapTemp.put(str.charAt(k), mapTemp.getOrDefault(str.charAt(k), 0) + 1);
        }

        int i = m - 1;
        int j = 0;
        while (i < n) {
            // Add the current character to mapTemp
            mapTemp.put(str.charAt(i), mapTemp.getOrDefault(str.charAt(i), 0) + 1);

            // Check if the current window is an anagram
            if (mapTemp.equals(mapPerm)) {
                ans.add(j);
            }

            // Remove the leftmost character from the window
            if (mapTemp.get(str.charAt(j)) == 1) {
                mapTemp.remove(str.charAt(j));
            } else {
                mapTemp.put(str.charAt(j), mapTemp.get(str.charAt(j)) - 1);
            }

            // Move the window
            j++;
            i++;
        }
        return ans;
    }

    
}
//official sol
import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> findAnagramsIndices(String str, String ptr, int n, int m) {
		char strArray[] = str.toCharArray();
		char ptrArray[] = ptr.toCharArray();

		// Array to store frequeny of character.
		int strMap[] = new int[26];

		int ptrMap[] = new int[26];

		ArrayList<Integer> answer = new ArrayList<>();

		/*
			If 'A' character in 'st'
			then we will increase value of 'strMap[0]' and
			character is 'B' then value of 'strMpa[1]' will increase.
		*/
		for (int i = 0; i < m; i++) {
			ptrMap[ptrArray[i] - 65] += 1;

			strMap[strArray[i] - 65] += 1;
		}

		// To check starting substring is anagram or not.
		boolean flag = true;
		for (int j = 0; j < 26; j++) {
			if (strMap[j] != ptrMap[j]) {
				flag = false;
				break;
			}
		}

		if (flag) {
			answer.add(0);
		}

		for (int i = m; i < n; i++) {
			strMap[strArray[i] - 65] += 1;

			strMap[strArray[i - m] - 65] -= 1;

			boolean flag1 = true;
			for (int j = 0; j < 26; j++) {
				if (strMap[j] != ptrMap[j]) {
					flag1 = false;
					break;
				}
			}

			// If index 'i-m+1' to 'i' substring is anagram with 'ptr'.
			if (flag1) {
				answer.add(i - m + 1);
			}
		}

		return answer;
	}
}
