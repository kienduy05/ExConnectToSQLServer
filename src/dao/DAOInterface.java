package dao;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface DAOInterface<T> {
    public ArrayList<T> selectAll();
}
