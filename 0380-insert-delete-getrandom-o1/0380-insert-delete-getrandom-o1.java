class RandomizedSet {
    
    HashSet<Integer> set;
    
    public RandomizedSet() {
        set = new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(!set.contains(val)){
            set.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(set.contains(val)){
            set.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        Iterator<Integer> iterator = set.iterator();
        Random random = new Random();
        int a = random.nextInt(set.size());
        int b = 0;
        while(iterator.hasNext()){
            if(a == b){
                return iterator.next();
            } else{
                iterator.next();
                b++;
            }
        }
        return iterator.next();
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */