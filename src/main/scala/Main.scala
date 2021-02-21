import io.circe._

enum Expr[F[_]] derives Codec.AsObject:
  case Term(name: F[String])
  case Apply(on: Expr[F], param: Expr[F])

//this works:
// object Expr:
//   given Codec.AsObject[Expr[cats.Id]] = Codec.AsObject.derived
