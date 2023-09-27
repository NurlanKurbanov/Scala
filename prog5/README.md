# Bool

```scala
x && y
x || y
!x

val y = "oleg" contains "l"
```

```scala
val x = "Ol"
val y = "eg"
val a = x + y
val b = x + y

a == b // true

// сравнение для ссылочных типов
a eq b // false (сравниваем ссылки)
```



```scala

val s3 = "bar"; val s1 = "foo" + s3; val s2 = "foo" + s3; println(s1 == s2) //true

val s1 = "foo"; val s2 = "foo"; println(s1 == s2) //true

val s3 = "bar"; val s1 = "foo" + s3; val s2 = "foo" + s3; println(s1 eq s2) //false

val s1 = "foo"; val s2 = "foo"; println(s1 eq s2) //true (Видимо работает как и в джаве: одинаковые строки без явного объявления new являются одними и теми же объектами из строкового кэша)
```



​	Check if char at idx pos in capital:

```scala
def isCapital(word: String, pos: Int): Boolean = {
    val charAtIndex = word.charAt(pos)
    (charAtIndex.toInt > 64) && (charAtIndex.toInt < 91)
}
```

# String

```scala
val name = "Oleg"
val greet = "Hello" + name

val greet = s"Hello $name" //как f-строки в python

val s =
	"""
	переносы
	не
	потеряны
	"""

val s = //все символы до вертикальной палочки вместе с ней выбросятся
	"""
	|переносы
	|не
	|потеряны
	""".stripMargin

val s = "aabbcc"
s.startsWith("aa")
s.endsWith("bb")
s.contains("ab")

s.matches("a+b+") // принимает регулярное выражение

val regex = "a+b+".r //чтобы первратить в регулярное выражение

val x = "sd"
val y = 12
println(x+y) //Автоматически в строку!!!


//split!!!
val s = """
  |dgbg
  |dvd
""".stripMargin

println(s.length) //10
println(s.split("\n").length) //3
```

