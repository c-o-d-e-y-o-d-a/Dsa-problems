/*
Runtime
Details
-ms
Beats 100.00%of users with Java
Memory
Details
43.65mb
Beats 76.01%of users with Java
There is a city composed of n x n blocks, where each block contains a single building shaped like a vertical square prism. You are given a 0-indexed n x n integer matrix grid where grid[r][c] represents the height of the building located in the block at row r and column c.

A city's skyline is the outer contour formed by all the building when viewing the side of the city from a distance. The skyline from each cardinal direction north, east, south, and west may be different.

We are allowed to increase the height of any number of buildings by any amount (the amount can be different per building). The height of a 0-height building can also be increased. However, increasing the height of a building should not affect the city's skyline from any cardinal direction.

Return the maximum total sum that the height of the buildings can be increased by without changing the city's skyline from any cardinal direction.


 */


/*
Even though the way the question has been given makes it look more complex , the question is pretty easy
you just need to find the biggest element in each row and each column after you use the 
2 dimensional array to make a matrix (thats what its supposed to represent) ,
to find the solve the minimum value between the max value in row and column and subtract the 
no from that value when you are iterating through the height of each building and then add those
differences together to find the answer
 sc - n prolly and tc is n2 too*/

class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] rowMax = new int[grid.length];
        int[] colMax = new int[grid.length];

        for(int i=0;i<grid.length;i++){
            int maxYet = 0;
            for(int j=0;j<grid.length;j++){
                maxYet = Math.max(maxYet,grid[i][j]);
                
            }
            rowMax[i]=maxYet;
        }
        int index = 0;

        while(index<grid.length){
            int maxYet =0;
            for(int i=0;i<grid.length;i++){
            
            maxYet = Math.max(maxYet,grid[i][index]);
            
            


            
                

            

        }
        index++;
        colMax[index-1]=maxYet;



        }
        int finalAns =0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                int maxOfCurrentIndex = Math.min(rowMax[i],colMax[j]);
                if(grid[i][j]<maxOfCurrentIndex){
                    finalAns = finalAns+(maxOfCurrentIndex-grid[i][j]);
                }
            }
        }
        return finalAns;

        


        
    }
}