// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    
    public Integer next = null; // next 값을 저장할 변수
    public Iterator<Integer> iter;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    iter = iterator;
        next = iter.hasNext() ? iter.next() : null; // 다음 요소가 있다면 next 저장
	}
	
	public Integer peek() {
        return next; // 다음 요소인 next 반환
	}
	
	@Override
	public Integer next() {
        Integer temp = next;
        next = iter.hasNext() ? iter.next() : null; // next의 다음 요소가 있다면 next 저장
        return temp; // 다음 요소인 next 반환
	}
	
	@Override
	public boolean hasNext() {
	    return next != null; // 다음 요소인 next가 null이면 false 반환
	}
}