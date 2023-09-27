//Cчитайте из консоли два числа: startIndex и endIndex. Они расположены в первой строке и разделены одним пробелом. Далее считайте строку str.
//
//Напечатайте в ответ входную строку, обратив порядок символов от startIndex до endIndex ﻿включительно.

import scala.io.StdIn

object Main {
  def main(args: Array[String]) {
    val s_idx = StdIn.readLine()
    val s = StdIn.readLine()

    val t = s_idx.split(" ")
    val x = t(0).toInt
    val y = t(1).toInt

    val s_part = s.substring(x,y+1)
    val part_reverse = s_part.reverse

    print(s.substring(0,x) + part_reverse + s.substring(y+1, s.length))
  }
}