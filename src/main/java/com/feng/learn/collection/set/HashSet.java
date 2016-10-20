/**
 * 
 */
package com.feng.learn.collection.set;

import java.util.Collection;
import java.util.Iterator;

import com.feng.learn.collection.map.HashMap;
import com.feng.learn.collection.map.Map;

/**
 * @author feng
 *
 */
public class HashSet<E> implements Set<E> {

	private static final Object PRESENT = new Object();

	private Map<E, Object> datas = new HashMap<E, Object>();

	/* (non-Javadoc)
	 * @see java.util.Set#size()
	 */
	@Override
	public int size() {
		return datas.size();
	}

	/* (non-Javadoc)
	 * @see java.util.Set#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return 0 == datas.size();
	}

	/* (non-Javadoc)
	 * @see java.util.Set#contains(java.lang.Object)
	 */
	@Override
	public boolean contains(Object o) {
		return datas.containsKey(o);
	}

	/* (non-Javadoc)
	 * @see java.util.Set#iterator()
	 */
	@Override
	public Iterator<E> iterator() {
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.Set#toArray()
	 */
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.Set#toArray(java.lang.Object[])
	 */
	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.Set#add(java.lang.Object)
	 */
	@Override
	public boolean add(E e) {
		return datas.put(e, PRESENT) == PRESENT;
	}

	/* (non-Javadoc)
	 * @see java.util.Set#remove(java.lang.Object)
	 */
	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see java.util.Set#containsAll(java.util.Collection)
	 */
	@Override
	public boolean containsAll(Collection<?> c) {
		Iterator<?> itr = c.iterator();
		while (itr.hasNext()) {
			if (!contains(itr.next())) {
				return false;
			}
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.util.Set#addAll(java.util.Collection)
	 */
	@Override
	public boolean addAll(Collection<? extends E> c) {
		boolean modified = false;
		Iterator<? extends E> itr = c.iterator();
		while (itr.hasNext()) {
			if (add(itr.next())) {
				modified = true;
			}
		}
		return modified;
	}

	/* (non-Javadoc)
	 * @see java.util.Set#retainAll(java.util.Collection)
	 */
	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see java.util.Set#removeAll(java.util.Collection)
	 */
	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see java.util.Set#clear()
	 */
	@Override
	public void clear() {
		datas.clear();
		size = 0;
	}

}
