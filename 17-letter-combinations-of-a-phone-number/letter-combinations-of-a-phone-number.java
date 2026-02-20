class Solution {
    Map<Character,String> map = new HashMap<>(){{
        put('2',"abc");
        put('3',"def");
        put('4',"ghi");
        put('5',"jkl");
        put('6',"mno");
        put('7',"pqrs");
        put('8',"tuv");
        put('9',"wxyz");
    }};
    List<String> list;
    String dig;
    public List<String> letterCombinations(String digits) {
        list = new ArrayList<>();
        dig = digits;
        StringBuilder sb = new StringBuilder();
        backTracking(0,sb);
        return list;
    }

    public void backTracking(int index, StringBuilder sb){
        if(index == dig.length()){
            list.add(sb.toString());
            return;
        }

        String str = map.get(dig.charAt(index));
        for(char ch : str.toCharArray()){
            sb.append(ch);
            backTracking(index+1,sb);
            sb.setLength(sb.length() - 1);
        }
    }
}