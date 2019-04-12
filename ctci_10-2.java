	//10.2 Group anagrams
	public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0)
            return new ArrayList();
        Map<String,List> ans = new HashMap();
        int[] count = new int[26];   // array to store the count of each character in a word
        for(String s : strs)
        {
            Arrays.fill(count,0);
            for(char c:s.toCharArray())
                count[c-'a']++;
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<26;i++)
            {	
                sb.append("#");					// append # to the count value eg: #0#2#3..
                sb.append(count[i]);
            }
            if(!ans.containsKey(sb.toString()))
                ans.put(sb.toString(),new ArrayList());
            ans.get(sb.toString()).add(s);
        }
        return new ArrayList(ans.values());
    }