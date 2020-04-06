package in.ravir.springpetclinic.service.map;

import in.ravir.springpetclinic.model.Pet;
import in.ravir.springpetclinic.service.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * PetServiceMap
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> 
    implements PetService {

        @Override
        public Set<Pet> findAll() {
            return super.findAll();
        }

        @Override
        public Pet findById(Long id){
            return super.findById(id);
        }
    
        @Override
        public Pet save(Pet object) {
            return super.save(object);
        }
    
        @Override
        public void delete(Pet object) {
            super.delete(object);
        }
    
        @Override
        public void deleteById(Long id) {
            super.deleteById(id);
        }
}