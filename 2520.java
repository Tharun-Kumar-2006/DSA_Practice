class Solution {
    public int countDigits(int n) {
        int cnt=0;
        int div=1;
        while(div<=n){
            int ld=(n%(div*10))/div;
            if(n%ld==0) cnt++;
            div=div*10;
        }
        return cnt;
        
    }
}