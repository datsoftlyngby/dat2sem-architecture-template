package dk.cphbusiness.pets.logic;

import dk.cphbusiness.pets.data.HashPetMapper;
import dk.cphbusiness.pets.data.Pet;
import dk.cphbusiness.pets.data.PetMapper;
import java.util.Collection;

public class PetManager {
  private PetMapper mapper = HashPetMapper.getInstance();
 
  
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
