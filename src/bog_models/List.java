package bog_models;

import java.util.ArrayList;

/**
 *
 * @author irene
 */
public class List<T> {
    protected ArrayList<T> list;

    public List() {
        list = new ArrayList<>();
    }

    public int getSize() {
        return this.list.size();
    }

    public void add(T t) throws Exception {
        this.list.add(t);
    }

    public void delete(T t) {
        this.list.remove(t);
    }

    public T getAt(int position) {
        return this.list.get(position);
    }

    public void clear() {
        this.list.clear();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public ArrayList<T> getArrayList() {
        ArrayList<T> aList = new ArrayList<>(list);
        return aList;
    }

}
