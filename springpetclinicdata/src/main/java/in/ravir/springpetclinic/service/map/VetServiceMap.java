package in.ravir.springpetclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import in.ravir.springpetclinic.model.Vet;
import in.ravir.springpetclinic.service.VetService;

/**
 * VetServiceMap
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> 
    implements VetService{

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id){
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    
}