package CustomImplementations.collections;
import java.util.AbstractList;
public class CustomList<T> extends AbstractList<T> {
	 private final T li[];
	 CustomList(T[] arr)
	 {
		 li = arr;
	 }
	public T get(int index) {
	        return li[index];
	    }
	public T set(int index,T value)
	{
		T existing_value = li[index];
		li[index] = value;
		return existing_value;
	}
	public int size() {
		return li.length;
	}
	
}
