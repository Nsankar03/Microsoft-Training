class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> hash=new HashSet<>();
        HashSet<String> list=new HashSet<>();
        for(int i=0;i<=s.length()-10;i++)
        {
            if(hash.contains(s.substring(i,i+10)))
            {
                list.add(s.substring(i,i+10));
            }
            else
            {
                 hash.add(s.substring(i,i+10));
            }
        }
        ArrayList<String> arr
            = new ArrayList<>(list);
        return arr;
    }
}
