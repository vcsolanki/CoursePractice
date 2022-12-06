package ObjectOrientedDesign.Components;

public class Animal {
  protected String petName;
  protected String scientificName;
  protected String commonName;
  protected float weight;
  protected float age;
  protected int numberOfLegs;
  private AnimalType animalType;

  public Animal() {
    numberOfLegs   = 0;
    petName        = "default";
    weight         = 0.0f;
    scientificName = "default";
    commonName     = "default";
    animalType     = AnimalType.Default;
  }

  public String getName() {
    return petName;
  }

  public void setName(String name) {
    petName = name;
  }

  public int getNumberOfLegs() {
    return numberOfLegs;
  }

  public String getScientificName() {
    return scientificName;
  }

  public String getCommonName() {
    return commonName;
  }

  public AnimalType getType() {
    return animalType;
  }

  public float getAge() {
    return age;
  }
}
