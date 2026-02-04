class Solution {
    public int minOperations(String[] logs) {
        int cnt = 0;
        for(int i = 0;i<logs.length;i++){
            if(logs[i].equals("../")){
                if(cnt > 0)
                cnt--;
            }
            else if(logs[i].equals("./")){
                continue;
            }
            else{
                cnt++;
            }
        }
        return cnt;
    }
}