class Solution {
    public String sortSentence(String s) {
        String arr[] = s.split(" ");
        Arrays.sort(arr, (a, b) -> {
            return Character.compare(
                    a.charAt(a.length() - 1),
                    b.charAt(b.length() - 1));
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            String st = arr[i].substring(0,arr[i].length()-1);
            sb.append(st);
            if(i != arr.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}