package OOP

object Inheritance extends App {
  // Single Class Inheritance
  sealed class Animal {
    val creatureType = "wild"
    def eat = println("nom nom")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("Crunch crunch")
    }
  }
  val cat = new Cat
  cat.crunch

  // contructors
  class Person(name: String, age:Int) {
    def this(name: String) = this(name,0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  // overriding
  // You can also override fields in the paramater itslef
  // Ex. class Dog(override val creatureType: String) extends Animal
  class Dog extends Animal {
    override val creatureType: String = "domestic"

    override def eat: Unit = {
      super.eat
      println("bark bark")
    }
  }
  val dog = new Dog
  dog.eat
  println(dog.creatureType)

  // type substitution (broad: polymorphism
  val unknownAnimal: Animal = new Dog
  unknownAnimal.eat

  //Super

  // preventing overrides
  // 1 - use final on member
  // 2 - use final on class
  // 3 - seal the class = extend classes in THIS FILE, prevent extension in other files


}
