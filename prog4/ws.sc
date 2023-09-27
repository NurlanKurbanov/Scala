123
123L

(1: Byte)

(1:Short)

//res будет Int!!!
(1:Short) + (2:Short)

((1:Short) + (2:Short)).toShort

'A'.toInt

('A'.toInt + 1).toChar

//res = 2
'C' - 'A'

val x = BigInt(123)
//BigInt можно перевести в другую систему
x.toString(16)

"2834".toInt

val x = 1.0
// res is double
x + 3

//double с  Big нельзя
x + BigInt(10)