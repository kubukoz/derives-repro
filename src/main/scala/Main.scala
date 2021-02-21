type Id[A] = A

trait Codec[A]
object Codec:
  def derived[A]: Codec[A] = ???


enum Expr[F[_]] derives Codec:
  case Term(name: F[String])
  case Apply(on: Expr[F], param: Expr[F])

//this works:
// object Expr:
//   given Codec[Expr[Id]] = Codec.derived
