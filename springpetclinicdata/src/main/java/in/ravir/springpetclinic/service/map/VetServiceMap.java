package in.ravir.springpetclinic.service.map;

import in.ravir.springpetclinic.model.Speciality;
import in.ravir.springpetclinic.model.Vet;
import in.ravir.springpetclinic.service.SpecialityService;
import in.ravir.springpetclinic.service.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * VetServiceMap
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> 
    implements VetService{

    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

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

        if( object.getSpecialities().size() > 0 ) {
            object.getSpecialities().forEach( speciality -> {
                if( speciality.getId() == null ) {
                    Speciality saveSpeciality = specialityService.save(speciality);
                    speciality.setId(saveSpeciality.getId());
                }
            });
        }

        return super.save(object);
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