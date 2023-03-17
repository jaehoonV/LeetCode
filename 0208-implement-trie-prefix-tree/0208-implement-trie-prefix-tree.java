class Trie {
    ArrayList<String> arr;
    
    public Trie() {
        arr = new ArrayList<>();
    }
    
    public void insert(String word) {
        arr.add(word);
    }
    
    public boolean search(String word) {
        return arr.contains(word);
    }
    
    public boolean startsWith(String prefix) {
        for(String s : arr){
            if(s.startsWith(prefix)) return true;
        }
        return false;
    }
}