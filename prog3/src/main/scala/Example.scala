object Example extends App{
  val message: AnyRef = "Scala!"

  //val message2: String = message - так нельзя

  //объект Math встроен в java
  // acos принимает double
  val message_ = Math.acos(1.0)

  //Any - что угодно
  // Unit - тоже, но
  val message2: Unit = "HI!"
  val message3: Unit = Math.acos(1)
  println(message2) // -> ()
  println(message3) // -> ()

  // можем даже так:
  val message4 = println(message2) // тут сработает println()
  println(message4) // тут тоже. напечатает ()

  // тип блока - тип последнего выражения в блоке
  val message5: Double = {
    val x = 1.0
    Math.acos(x)
  }

  println(message5) // -> 0.0}
