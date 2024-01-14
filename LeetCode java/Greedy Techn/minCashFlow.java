import java.util.* ;

 

import java.io.*;

 

public class Solution

 

{

 

public static int minCashFlow(ArrayList<ArrayList<Integer>> money, int n)

 

{

 

// Write your code here.

 

int khataBook[]=new int[n];

 

for(int i=0;i<money.size();i++){

 

for(int j=0;j<money.get(0).size();j++){

 

khataBook[i]=khataBook[i]-money.get(i).get(j);

 

khataBook[j]=khataBook[j]+money.get(i).get(j);

 

}

 

}

 

int MinCashFlowAmount=0;

 

for(int i=0;i<khataBook.length;i++){

 

if(khataBook[i]<0){

 

MinCashFlowAmount=MinCashFlowAmount+(khataBook[i]*-1);

 

}

 

}

 

return MinCashFlowAmount;

 

}

 

}