class Solution {
    HashMap<String, Integer> map;
    List<List<String>> res;
    String b;

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        map = new HashMap<>();
        map.put(beginWord,1);
        b = beginWord;
        Set<String> set = new HashSet<>();
        for(String s : wordList){
            set.add(s);
        }
        set.remove(beginWord);

        while(!q.isEmpty()){
            String word = q.remove();
            int steps = map.get(word);
            if(word.equals(endWord)) break;

            for(int i = 0; i<word.length(); i++){
                for(char ch = 'a'; ch<='z'; ch++){
                    char[] replaceCharArray = word.toCharArray();
                    replaceCharArray[i] = ch;
                    String newWord = new String(replaceCharArray);
                    if(set.contains(newWord)){
                        q.add(newWord);
                        set.remove(newWord);
                        map.put(newWord,steps+1);
                    }
                }
            }
        }
        res = new ArrayList<>();

        if(map.get(endWord)!=null){
            List<String> endToStartList = new ArrayList<>();
            endToStartList.add(endWord);
            dfs(endWord,endToStartList);
        }
        return res;
    }

    private void dfs(String word, List<String> endToStartList){
        if(word.equals(b)){
            List<String> startToEndList = new ArrayList<>(endToStartList);
            Collections.reverse(startToEndList);
            res.add(startToEndList);
            return;
        }
        // change character and check and backtrack
        for(int i = 0; i<word.length(); i++){
            for(char ch = 'a'; ch<='z'; ch++){
                char[] replaceCharArray = word.toCharArray();
                replaceCharArray[i] = ch;
                String newWord = new String(replaceCharArray);

                if(map.get(newWord)!=null && map.get(newWord) == map.get(word) - 1){
                    endToStartList.add(newWord);
                    dfs(newWord,endToStartList);
                    endToStartList.remove(endToStartList.size()-1);
                }
            }
        } 
    }
}