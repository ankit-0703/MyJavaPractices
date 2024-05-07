// Here we need to the number of steps take to bring down the given vlaue to zero.
//idea is if num is even divide by 2 else reduce one
class numOFsteps{
    public static void main(String[] args){
        numOFsteps n=new numOFsteps();
        System.out.println(n.steps(13));
    }
    public int steps(int n){
        int steps=0;
        return helper(n,steps);
    }
    private int helper(int n,int steps){
        if(n==0){
            return steps;
        }
        if(n%2==0){
            return helper(n/2,steps+1);
        }
        else{
            return helper(n-1,steps+1);
        }
    }
}