class Solution {
    public double myPow(double x, int n) {
        return myPow(x, (long) n);
    }

    public double myPow(double x, long n){

        if(n < 0){
            return 1 / (Math.pow(x, -n));

        }

        return Math.pow(x, n);
       

        
    }
}