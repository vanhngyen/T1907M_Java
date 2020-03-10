package session6;

import java.util.ArrayList;

public interface DataAccessObjectConcreate <E>{
    ArrayList<E> list();
    boolean create(E e);
    boolean update(E e);
    boolean delete(E e);
}
