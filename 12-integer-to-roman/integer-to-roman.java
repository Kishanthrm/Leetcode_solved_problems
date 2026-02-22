class Solution {
    public String intToRoman(int num) {
        String[] ch = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder str = new StringBuilder();
        for(int i=0;i<ch.length;i++){
            while(num >= nums[i]){
                str.append(ch[i]);
                num -= nums[i];
            }
            if(num == 0){
                break;
            }
        }
        return str.toString();
    }
}