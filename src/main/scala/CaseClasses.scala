object CaseClasses extends App {

  case class Person(name: String, age: Int)

  val bob = Person("bob", 0)

  val greeting = bob match {
    case Person(n, a) if a < 21 => s"Hi, my name is $n and I can't drink in the US"
    case Person(n, a) if a >= 21 => s"Hi, my name is $n and I can drink in the US"
    case _ => 42
      None

  }
  println(greeting)

  trait Expr

  case class Number(n: Int) extends Expr

  case class Sum(e1: Expr, e2: Expr) extends Expr

  case class Prod(e1: Expr, e2: Expr) extends Expr

  def show(expr: Expr): String = {
    expr match
      case Number(n) => s"$n"
      case Sum(e1, e2) => show(e1) + " + " + show(e2)
      case Prod(e1, e2) => {
        def maybeShowParentheses(expr: Expr) = expr match {
          case Prod(_, _) => show(expr)
          case Number(_) => show(expr)
          case _ => "(" + show(expr) + ")"
        }
        maybeShowParentheses(e1) + " + " + maybeShowParentheses(e2)
      }

  }
  println(show(Sum(Number(2), Number(3))))
  println(show(Sum(Sum(Number(2),Number(3)), Number(4))))
  println(show(Prod(Sum(Number(2),Number(1)),Number(3))))
}
