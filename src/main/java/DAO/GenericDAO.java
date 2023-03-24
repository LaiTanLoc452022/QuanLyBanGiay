package DAO;

import java.util.List;

public class GenericDAO<T> {
    public T findById(Long id) {
        return null;
    }
    public List<T> findAll() {
        return null;
    }
    public Long save(T t) {
        return 1L;
    }
    public void update(T t) {
        
    }
    
    public boolean delete(Long id) {
        return true;
    }
}
