package longproject0;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class SimpleDoublyLinkedList<T> implements List<T>,Iterable<T>{

	Node<T> header;
	Node<T> tail;
	int size;
	public SimpleDoublyLinkedList(){
		header = new Node<>(null);
		tail = new Node<>(null);
		header.next=tail;
		tail.prev = header;
	}
	
	public Node<T> getHeader(){
		return header;
	}
	
	public Node<T> getTail(){
		return tail;
	}
	
	public T getFirst(){
		return header.next.x;
	}
	
	private Node<T> getFirstNode(){
		return header.next;
	}
	
	private Node<T> getLastNode(){
		return tail.prev;
	}
	
	public Index addWithIndex(T x){
		size++;
		Node<T> node = new Node(x);
		tail.prev.next= node;
		node.prev = tail.prev;
		tail.prev=node;
		node.next = tail;
		Index<Node<T>> index = new Index<>();
		index.setIndex(node);
		return index;	
	}
	
	public T remove(Index<T> index){
		size--;
		Node<T> node = index.getIndex();
		node.prev.next = node.next;
		node.next.prev = node.prev;
		return node.x;
	}
	
	public void merge(Index<T> index, SimpleDoublyLinkedList<T> toBeMerged){
		Node<T> node = index.getIndex();
		node.prev.next = toBeMerged.getFirstNode();
		toBeMerged.getFirstNode().prev = node.prev;
		node.prev = toBeMerged.getLastNode();
		toBeMerged.getLastNode().next = node;
		size += toBeMerged.size;
		
	}
	public void printlist(){
		Node<T> temp = header.next;
		int count =0;
		while(temp!=tail){
			System.out.println(temp.x);
			temp=temp.next;
			count++;
		}
		//System.out.println(count);
	}
	
	@Override
	public boolean isEmpty(){
		if(header.next==tail)
			return true;
		else
			return false;
	}

	@Override
	public boolean removeIf(Predicate<? super T> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Stream<T> stream() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void add(int arg0, T arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addAll(Collection<? extends T> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int arg0, Collection<? extends T> arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T remove(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void replaceAll(UnaryOperator<T> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T set(int arg0, T arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public void sort(Comparator<? super T> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Spliterator<T> spliterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> subList(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<T> parallelStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(T arg0) {
		// TODO Auto-generated method stub
		return false;
	}
}
