package dk.cphbusiness.pets.control;

import dk.cphbusiness.pets.model.Pet;
import dk.cphbusiness.pets.model.PetMapper;
import java.util.Collection;

public class PetManager {
  private final PetMapper mapper = PetMapper.instance();
  
  public Collection<Pet> list() {
    return mapper.list();
    }
  
  public Pet find(int id) {
    return mapper.find(id);
    }
  
  public Pet save(Pet pet) {
    if (pet.getAge() > 10) return pet;
    return mapper.save(pet);
    }
  
  }
