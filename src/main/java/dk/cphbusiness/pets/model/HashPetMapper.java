package dk.cphbusiness.pets.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class HashPetMapper extends PetMapper {
  private static HashPetMapper instance = null;
  private final Map<Integer, Pet> pets = new HashMap<>();
  private int nextId = 1;
  
  private HashPetMapper() {
    save(new Pet(0, "Rufus", 7));
    save(new Pet(0, "Felix", 9));
    save(new Pet(0, "Ninus", 5));
    save(new Pet(0, "Piphans", 3));
    }
  
  public synchronized static HashPetMapper getInstance() {
    if (instance == null) instance = new HashPetMapper();
    return instance;
    }
  
  @Override
  public final Collection<Pet> list() {
    return pets.values();
    }

  @Override
  public final Pet find(int id) {
    return pets.get(id);
    }

  @Override
  public final Pet save(Pet pet) {
    if (pet.getId() == 0) pet.setId(nextId++);
    pets.put(pet.getId(), pet);
    return pet;
    }
  
  }
