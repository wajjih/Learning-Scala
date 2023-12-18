package OOP

object Objects extends App {

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY. DOES NOT KNOW THE CONCEPT OF "STATIC"
  object Person {
    // "Static"/"Class" - level functionality
    val N_EYES = 2
    def canFly: Boolean = false

    //factory method - sole purpose is to create instance of class Person
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }
  class Person(val name: String){
    // instance-level functionality

  }
  //Companions - Object Person and Class Person reside in the same scope and have the same name

  println(Person.N_EYES)
  println(Person.canFly)

  //Scala Object = SINGLETON INSTANCE
  val mary = Person
  val john = Person
  println(mary == john)

  //Scala Class = Multiple Instance
  val siri = new Person("siri")
  val josh = new Person("josh")
  println(siri == josh)

  val bobbie = Person(siri,josh)
}
