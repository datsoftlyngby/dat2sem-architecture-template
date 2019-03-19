package dk.cphbusiness.pets.model;

import java.util.Collection;

public abstract class PetMapper {
  
  public static PetMapper instance() {
    return HashPetMapper.getInstance();
    }
  
  public abstract Collection<Pet> list();
  
  public abstract Pet find(int id);
  
  public abstract Pet save(Pet pet);
  
  }
