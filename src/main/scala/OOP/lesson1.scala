package OOP

object lesson1 extends App {

  val person = new Person("John",26)
  println(person.age)
  println(person.greet("Yello"))
}
//age is a class Parameter not a class member that you can access with dot operator
//class parameters are NOT FIELDS
//Convert parameter to field insert val
// constructor
class Person(name: String, val age: Int) {
  def greet(name: String): Unit = println(s"${this.name}  says: Hi, $name")
}
