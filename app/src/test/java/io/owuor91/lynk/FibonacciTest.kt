package io.owuor91.lynk

import org.junit.Test

class FibonacciTest {
  @Test fun fibonacciGeneratorGeneratesSequence() {
    assert(Fibonacci().fibonacciGenerator(13).contains(144))
  }
  
  @Test fun fibonacciGeneratorGenerates_n_Elements() {
    assert(Fibonacci().fibonacciGenerator(5).size == 5)
  }
  
  @Test fun listFilterFiltersUniqueElements() {
    assert(Fibonacci().listFilter(Fibonacci().fibonacciGenerator(100)).size == 7)
  }
  
  @Test fun listFilterResultHasNoFibonacciElements() {
    assert(!Fibonacci().listFilter(Fibonacci().fibonacciGenerator(100)).contains(144))
  }
}