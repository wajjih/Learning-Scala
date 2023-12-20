package OOP

object AbstractDataTypes extends App {
  // abstract
  abstract class Animal {
    val creatureType: String
    def eat: Unit

  }
  class Dog extends Animal {
    override val creatureType: String = "Canine"
    def eat: Unit = println("crunch crunch")

  }
  // traits
  // traits can be inherited along classes
  trait carnivore {
    def eat(animal: Animal): Unit
  }

  class crocodile extends Animal with carnivore {
    override val creatureType: String = "croc"

    override def eat: Unit = println("nom nom")
    def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")
  }
  val dog = new Dog
  val croc = new crocodile
  croc.eat(dog)

  // traits vs abstract classes
  //1 - traits do not have constructor parameters
  //2- multiple traits may be inherited by the same class
  //3- traits = behaviour, abstract class = "thing"
}
