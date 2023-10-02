val add1 = (_: Int) + 1

val calc42 = (f: Int => Int) => f(42)

calc42(add1)

calc42(_ + 7)

def sumTo(x: Int): Int = if(x == 0) 0 else x + sumTo(x-1)
calc42(sumTo)

// хотим то же самое сделать внутри calc

//  calc42((x: Int) => if(x == 0) 0 else x + )
// + что? ведь теперь нет имени внутренней функции

// для этого придумали y-combinator
//находит неподвижную точку(fix point)

def fix(f: (=>Int => Int) => Int => Int): Int => Int = f(fix(f))

fix(rec => x => if(x == 0) 0 else x + rec(x - 1))(7)

calc42(fix(rec => x => if(x == 0) 0 else x + rec(x - 1)))