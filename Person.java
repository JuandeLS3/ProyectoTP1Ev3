public class Person {
 private String name;
 private int age;
 private int height;
 private int weight;
 private String eyeColor;
 private String gender;
 public Person() {
  // Nothing to do...
 }
 public Person(String name, int age, int height, int weight, String eyeColor, String gender){
   this.name = name;
   this.age = age;
   this.height = height;
   this.weight = weight;
   this.eyeColor = eyeColor;
   this.gender = gender;
  }
  public int getWeight() {
     return weight;
  }
  public int getAge() {
     return age;
  }
  public int getHeight() {
     return height;
  }
  public String getGender() {
     return gender;
  }
  public String getName() {
     return name;
  }
  public String getEyeColor() {
     return eyeColor;
  }
}

