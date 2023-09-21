import ru.tinkoff.Module

object Main extends App{
  val myName = Module.name
  println(myName) //Oleg
}

// можно было import ru.tinkoff.Module.name
// val myName = name

//стабильные идентификаторы - указывают на значения, которые точно не будут меняться
//package, любой параметр функции, val, lazy val, object

//нестабильный, например, def - вычисляется каждый раз и возможно возвращает не одно и то же


import ru.tinkoff.Module2.{name, name2}
object main2 extends App{
  println(name) //John
  println(name2) //Kate
}
//import ru.tinkoff.Module2._ - импортировать все
//import ru.tinkoff.Module2.{name =>name1} - чтобы переименовать
//import ru.tinkoff.Module2.{_, name2=>_} - испортировать все кроме