package in.ravir.springpetclinic.service;

import in.ravir.springpetclinic.model.Owner;

/**
 * OwnerService
 */
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName( String lastName );

}