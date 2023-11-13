object Maps extends App {

  val num = List(1,2,3)
  val chars = List("a","b","c","d")

  val combination = num.flatMap(n => chars.map(c => "" + c + n))
  println(combination)

  val cool = num.map(c => chars.map(d => c + d))
  println(cool)
}
