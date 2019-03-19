package dk.cphbusiness.pets.model;

import java.util.Collection;

public interface PetMapper {
  
  Collection<Pet> list();
  
  Pet find(int id);
  
  Pet save(Pet pet);
  
  }
