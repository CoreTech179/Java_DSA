// Suppose we have given a number of stairs and initially you are at the 0th stair and you need to reach to the nth stair.Each time you oly climb one step or 2 stpes. You are supposed to return the number of distinct ways in which you can climb from 0th step to nth step


public class ClimbStairs {

    public static int countDistinctWays(int nStairs){
        // Base case 
        // here nStairs < 0 means there is no underground stairs 
        if(nStairs<0){
            return 0;
        }
        // here nStairs==0 means we jump at the 0th stair and remain at the 0th stair
        if(nStairs==0){
            return 1;
        }

        // Here at the nth stair either we reached to the nth stair by jumping from n-1 stair or n-2 stair
        // here left function will be going continuously until reach its end (i.e top to bottom) and then the right function will call from bottom to top by adding the ans. 
        int ans = countDistinctWays(nStairs-1) + countDistinctWays(nStairs-2);
        return ans;
    }

    public static void main(String[] args) {
        int result = countDistinctWays(4);
        System.out.println(result);
    }
}
