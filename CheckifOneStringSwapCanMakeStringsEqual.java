class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;

        int m = s2.length();
        int mismatch = 0;

        List <Character> ans = new ArrayList <>();
        int pos = 0;

        while (pos < m){
            if (s1.charAt(pos) != s2.charAt(pos)) {
                ans.add(s1.charAt(pos));
                ans.add(s2.charAt(pos));
                mismatch++;
        }
        pos++;
        }
        if (ans.size() == 4) {
            return (ans.get(0) == ans.get(3) && ans.get(1) == ans.get(2));
        }
        return false;
    }
}