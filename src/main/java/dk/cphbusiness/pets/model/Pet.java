package dk.cphbusiness.pets.model;

public class Pet {
  private int id;
  private String name;
  private int age;
  
  public Pet(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
    }
  
  public int getId() { return id; }
  
  public void setId(int value) { id = value; }
  
  public String getName() { return name; }
  
  public void setname(String value) { name = value; }

  public int getAge() { return age; }

  public void setAge(int value) { age = value; }
  
  }

