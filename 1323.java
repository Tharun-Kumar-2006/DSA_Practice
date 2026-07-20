class Solution {
    public int maximum69Number (int n){
        int diff=3;
        int div=1;
        int sum=0;
        while(div<=n){
            int ld=(n%(div*10))/div;
            if(ld==6) sum=diff;
            diff*=10;
            div*=10;
        }
        return n+sum;
        
    }
}