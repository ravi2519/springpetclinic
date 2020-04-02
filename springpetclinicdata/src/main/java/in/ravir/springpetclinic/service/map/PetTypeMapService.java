package in.ravir.springpetclinic.service.map;

import in.ravir.springpetclinic.model.PetType;
import in.ravir.springpetclinic.service.PetTypeService;

import java.util.Set;

public class PetTypeMapService extends AbstractMapService implements PetTypeService {


    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public PetType save(PetType object) {
        return (PetType) super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType findById(Long id) {
        return (PetType) super.findById(id);
    }
}
