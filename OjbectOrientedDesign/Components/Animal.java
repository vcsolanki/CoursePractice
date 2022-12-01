package OjbectOrientedDesign.Components;

public class Animal {
  protected String _petName;
  protected String _scientificName;
  protected String _commonName;
  protected float _weight;
  protected float _age;
  protected int _numberOfLegs;
  private AnimalType _type;

  public Animal() {
    _numberOfLegs = 0;
    _petName = "default";
    _weight = 0.0f;
    _scientificName = "default";
    _commonName = "default";
    _type = AnimalType.Default;
  }

  public String getName() {
    return _petName;
  }

  public void setName(String name) {
    _petName = name;
  }

  public int getNumberOfLegs() {
    return _numberOfLegs;
  }

  public String getScientificName() {
    return _scientificName;
  }

  public String getCommonName() {
    return _commonName;
  }

  public AnimalType getType() {
      return _type;
  }

  public float getAge() {
      return _age;
  }
}
