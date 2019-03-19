package dk.cphbusiness.pets.data;

import java.util.Collection;

public interface PetMapper {
  
  Collection<Pet> list();
  
  Pet find(int id);
  
  Pet save(Pet pet);
  
  }
