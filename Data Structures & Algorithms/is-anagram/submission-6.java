class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm1= new HashMap<>();
        HashMap<Character,Integer> hm2= new HashMap<>();


        for(char c: s.toCharArray()){
            if(hm1.containsKey(c)){
                int count=hm1.get(c);
                count++;
                hm1.put(c,count);
            }
            else{
                hm1.put(c,1);
            }
        }
        for(char c: t.toCharArray()){
            if(hm2.containsKey(c)){
                int count=hm2.get(c);
                count++;
                hm2.put(c,count);
            }
            else{
                hm2.put(c,1);
            }
        }

        if(hm1.size()!=hm2.size()){
            return false;
        }

        for(char c : hm1.keySet()){
            if(!hm2.containsKey(c)||!hm1.get(c).equals(hm2.get(c))){
                return false;
            }
        }
        return true;
    }
}
