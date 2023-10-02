# Методы

```scala
def plusOne(number: Int): Int(возвращаемый тип) = number + 1
```

​	Тип возвращаемого значения можно опускать, если это очевидно. Scala попробует сделать это сама.

```scala
def plusOne(x: Int, y: Int, z: Int): Int = x + y + z

plusOne(1,2,3)
```

​		Можно группировать в списки параметров:

```scala
def plus(x:Int, y:Int)(z:Int) = x + y + z 

println(plus(1,2)(3))
```

​	Может не быть параметров. Можно воспринимать как переменную, вычисляемую каждый раз при ее использовании:

```scala
def sixty: Int = 10 * 6
```

​	Если писать что-то более сложное:

```scala
def plus(x:Int, y:Int): Int = {
    val res = x + y
    println(s"$x + $y = $res")
    res  //возвращается последнее выражение в блоке
}
```

 	Если **метод ничего не возвращает**, то **тип возвращаемого значения** - **Unit**:

```scala
def plus(x:Int, y:Int): Unit = {
    val res = x + y
    println(s"$x + $y = $res")
}
```

​	Вложенные методы:

```scala
def plusMul(q:Int, x:Int, y:Int): Int = {
    def mul(u: Int) = q * u
    mul(x) + mul(y)
}
```



​	**Повторяемые параметры:**

```scala
def sum(u: Int, nums:Int*): Int = u * nums.sum

sum(3, 1, 2, 3) // 18
```

​	**Значения по умолчанию:**

```scala
def plus(x: Int, y: Int = 0): Int = x + y
```

​	**Именованные аргументы:**

```scala
def plus(x: Int, y: Int = 0, z: Int = 0): Int = x + y + z

plus(x = 3)
plus(1, z = 2)
```

​	Если хотим, чтобы выражение вычислялось не всегда -> **Передача по имени**:

```scala
def replaceNeg(x: Int, z: => Int): Int = if (x >= 0) x else z

replaceNeg(1, 3*3*3) // 1
replaceNeg(-1, 3*3*3) // 27
```

​	**Передача блока:**

```scala
def replaceNeg(x: Int, z: => Int): Int = if (x >= 0) x else z

println(replaceNeg(1, {
  println("calculated")
  3 * 3 * 3
})) //1

println(replaceNeg(-1, {
  println("calculated")
  3 * 3 * 3
})) 
//calculated
//27
```

​	**Рекурсия** (обязательно надо указать тип):

```scala
def Sum(from: Int, to: Int): Int = 
	if (to < from) 0
	else from + sum(from + 1, to)
```

❗ Неэффективно, когда функция вызывает себя много раз, можем переполнить стэк.  Поэтому:

​	**Хвостовая рекурсия**. Это должно быть большое условное выражение. Каждый результат этого условного выражения - либо вызов той же самой функции, либо выражение, которые не ссылается на эту функцию. Тогда вся эта функция превратится в один большой цикл:

```scala
def sum(from: Int, to: Int, acc: Int = 0): Int = 
	if (to < else) acc
	else sum(from + 1, to, acc + from)
```



​	🧩аннотацию @tailrec можно поставить над функцией с хвостовой рекурсией и тогда компилятор развернёт её в цикл. Если у вас функция с бесконечной рекурсией и вы поставите над ней аннотацию @tailrec то компилятор выдаст ошибку