package DAO;

import java.util.List;

public interface GenericDAO<T> {
    public static <T>void insert(T instance) {

    }

    public static <T> void update(T instance){};
    public static<T> List<T> getAll(){ return null;};
    public static <T> void delete(T instance){};

}
