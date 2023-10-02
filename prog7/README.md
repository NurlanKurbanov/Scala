# Функции

-- значение, которое может быть использовано как метод.

🧩max number of parameters is scala function = 22.

​	Определить функцию можно через **лямбда-выражений**:

```scala
val addOne: Int => Int = x => x + 1
val plus: (Int, Int) => Int = (x,y) => x + y
```

Не обязательно писать _val_, можно, например, и _var_.  По сути лямбда функция  находится справа, а слева это переменная, через которую ее можно вызывать.

​	Если каждый параметр используется один раз, и все параметры используются по порядку.

```scala
val addOne: Int => Int = _ + 1
val plus: (Int, Int) => Int = _ + _
```



​	Можно не указывать тип результата, но указывать тип параметров в лямбда-выражениях, тогда scala попробует вывести тип всего выражения сама:

```scala
val addOne = (x: Int) => x + 1
val plus = (x: Int, y: Int) => x + y
```

​	Или короче, если каждый параметр используется один раз, и все параметры используются по порядку:

```scala
val addOne3 = (_: Int) + 1
val plus = (_: Int) + (_: Int)
```





​	Другой способ определить функцию - **эта-конверсия** (превратить метод в функцию): 

```scala
def addOne(x: Int) = x + 1
val add1 = addOne _

def plus(x: Int, y: Int) = x + y
val pl = plus _
//pl(1,2) -> 3
```

Если надо указать возвращаемый тип:

```scala
def addOne(x: Int) = x + 1
val add1: Int => Int = addOne //если scala понимает, что должна быть функция в этом месте, то _ можно не ставить

def plus(x: Int, y: Int) = x + y
val pl: (Int, Int) => Int = plus //если scala понимает, что должна быть функция в этом месте, то _ можно не ставить
```



```scala
def greaterOn(f: Int => Int): (Int, Int) => Boolean = (x,y) => f(x) > f(y)

val greaterOnOnes = greaterOn(x => x % 10)
greaterOnOnes(23, 75) //false
greaterOnones(27, 45) //true
```



​	__Каррирование__: можно представить функцию многих параметров как последовательность функций от одного параметра, возвращающих функцию

```scala
def plus: Int => Int => Int = x => y = > x + y

plus(1)(2) // 3
```

​	Можно превратить функцию многих параметров в каррированный вариант:

```scala
val plus3 = (x: Int, y: Int, z: Int) => x + y + z
val plus3c: Int => Int => Int => Int = plus3.curried

plus3c(1)(2)(3)
```



​	__Композиция__:

```scala
val plus1 = (_: Int) + 1
val mul3 = (_: Int) * 3

val plusThenMul = plus1 andThen mul3 
val mulThenPlus - plus1 compopse mul3

plusThenMul(5) //18
mulThenPlus(5) //16
```

