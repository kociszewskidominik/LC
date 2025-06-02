class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        HashMap<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        
        for(int i = 0; i < s.length() - 1; i++){
            char c = s.charAt(i);
            char n = s.charAt(i + 1);
            int val1 = m.get(c);
            int val2 = m.get(n);

            if(val1 < val2){
                sum -= val1;
            } else {
                sum += val1;
            }
        }
        
        return sum += m.get(s.charAt(s.length() - 1));
    }
}