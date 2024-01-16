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
        Random r = new Random();
        int a = r.nextInt(set.size()), b = 0;
        while(iterator.hasNext()){
            if(a == b) return iterator.next();
            else{
                iterator.next();
                b++;
            }
        }
        return iterator.next();
    }
}