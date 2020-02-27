package in.ravir.springpetclinic.service;

import java.util.Set;

/**
 * CrudService
 */
public interface CrudService<T,ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}