def sumEven(n: Int): Int = {
  def go(i: Int): Int =
    if ( i > n) 0
    else i + go(i + 2)

  go(2)
}

sumEven(100)
//sumEven(10000000) //error

// нужно сделать рекурсию хвостовой


def sumEven_(n: Int): Long = {
  def go(i: Int, acc: Long): Long = {
    if ( i > n) acc
    else go(i + 2, acc + i)
    //вместо того чтобы вычислять значение в след точке
    //и потом возвращаться, чтобы суммировать,
    // сразу перейдем к след функции
  }
  go(2, acc=0)
}

sumEven_(100000)


def fibs(num: Int): Long = {
  def f(n: Int, a: Long, b: Long): Long = {
    if (n == num) a+b
    else f(n+1, b, a+b)
  }

  if ((num == 1) || (num == 2)) 1
  else f(3, 1, 1)
}

println(fibs(7))