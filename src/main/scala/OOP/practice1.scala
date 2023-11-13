package OOP

import java.io
import java.io.Writer

object practice1 extends App {
  /*
  Novel and Writer Class

  Writer: first name, last name, year of birth
  - method fullname = first name + second name

  Novel: name, year of release, author (instance of type Writer)
  -author age - returns age of author at the year of release
  -isWrittenBy(author)
  -copy(new year of release) = new  instance of Novel (author revised or added to the edition)

  */
  val writer = new Writer("John", "Doe", 1980)
  println(writer.fullName())

  val novel = new Novel("Sorcerers Stone",2007,writer)
  println(novel.authorAge())
  println(novel.isWrittenBy(writer))
  println(novel)
  novel.copy(2009,novel)
  println(novel)

}
class Writer( val firstName: String, val lastName: String, val year: Int){
  def fullName(): String = firstName + " " + lastName


  override def toString = s"Writer($firstName, $lastName, $year)"
}
class Novel(val name: String, var year: Int, val author: Writer){

  def authorAge(): Int = year - author.year

  def isWrittenBy(author: Writer): Boolean = author == this.author


  def copy(newYear: Int, novel: Novel): Unit = novel.year = newYear


  override def toString = s"Novel($name, $year, $author)"
}
