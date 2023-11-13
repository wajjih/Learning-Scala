package OOP

import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name: String,var age: Int = 0, val favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(string: String): Person = new Person(this.name + "(" + string + ")", this.age ,this.favoriteMovie)
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"${name}, what good?!"
    def unary_+ : Int = this.age + 1
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"

    override def toString = s"Person($name, $favoriteMovie)"
  }

  val mary = new Person("Mary",3,"Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") //Infix notation works with methods with one parameter

  val tom = new Person("Tom",10, "FightClub")
  println(mary hangOutWith tom) //All Operators are methods
  //Syntactic Sugar is more simple way of writing code that translates into english

  //Prefix Notation
  val x = -1
  val y = 1.unary_-

  println(!mary)

  //Postfix Notation
  println(mary isAlive)
  println(mary.apply())
  println(mary()) // equivalent to previous statement


  println(mary + "Im that nigga")
  println(+mary)
}
