class MyCircularDeque {
    List<Integer> list;
    int size;

    public MyCircularDeque(int k) {
        list = new ArrayList<>();
        size = k;
    }

    public boolean insertFront(int value) {
        if (list.size() < size) {
            list.addFirst(value);
            return true;
        }
        return false;
    }

    public boolean insertLast(int value) {
        if (list.size() < size) {
            list.addLast(value);
            return true;
        }
        return false;

    }

    public boolean deleteFront() {
        if (!list.isEmpty()) {
            list.remove(0);
            return true;
        }
        return false;
    }

    public boolean deleteLast() {
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
            return true;
        }
        return false;
    }

    public int getFront() {
        if (!list.isEmpty()) return list.get(0);
        return -1;
    }

    public int getRear() {
        if (!list.isEmpty()) return list.get(list.size() - 1);
        return -1;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean isFull() {
        return list.size() == size;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */