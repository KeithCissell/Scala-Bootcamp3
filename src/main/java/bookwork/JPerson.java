// src/main/java/JPerson.java
package bookwork.basicoop;

public class JPerson {
  private String name;
  private int     age;

  public Jperson(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void   setName(String name) { this.name = name; }
  public String getName()            { return this.name; }

  public void setAge(int age) { this.age = age; }
  public int  getAge()        { return this.age; }
}

/*
The scala declaration for this same class:
class Person(var name: String, var age: Int)
*/
