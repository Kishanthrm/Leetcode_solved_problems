class Solution {
    public String convert(String s, int n) {
        StringBuilder[] str = new StringBuilder[n];
        for(int i=0;i<n;i++){
            str[i] = new StringBuilder();
        }
        int size = s.length();
        int index = 0;
        while(index < size){
            for(int i=0;i<n && index < size;i++){
                str[i].append(s.charAt(index));
                index++;
            }
            for(int j=n-2;j>0 && index < size;j--){
                str[j].append(s.charAt(index));
                index++;
            }
        }
        StringBuilder res = new StringBuilder(str[0]);
        for(int i=1;i<n;i++){
            res.append(str[i].toString());
        }
        return res.toString();
    }
}