package io.owuor91.lynk

class Fibonacci {
  fun fibonacciGenerator(n: Long): List<Long> {
    var fibonacciList = ArrayList<Long>()
    fibonacciList.add(0)
    fibonacciList.add(1)
    for (i in 2 until n) {
      var last = fibonacciList.get(fibonacciList.size - 1)
      var secondLast = fibonacciList.get(fibonacciList.size - 2)
      fibonacciList.add(last + secondLast)
    }
    return fibonacciList;
  }
  
  fun listFilter(firstList: List<Long>): List<Long> {
    var secondList:List<Long> = arrayListOf(1, 89, 7, 40, 0, 7, 8, 34, 21, 55, 91, 100, 24, 28, 103, 144)
    var diffSet = secondList.toSet().minus(firstList.toSet())
    return diffSet.toList();
  }
}