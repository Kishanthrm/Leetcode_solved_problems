class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char[] ch = s.toCharArray();
        int i=0,j=1, result=0;
        while(j < ch.length){
            if(map.get(ch[i]) >= map.get(ch[j])){
                result += map.get(ch[i]);
            }
            else{
                result -= map.get(ch[i]); 
            }
            i++;
            j++;
        }
        result += map.get(ch[ch.length - 1]);
        return result;
    }
}
