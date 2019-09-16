package io.owuor91.lynk.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import io.owuor91.lynk.Fibonacci
import io.owuor91.lynk.R.layout
import io.owuor91.lynk.R.string
import io.owuor91.lynk.uiimport.NumbersRecyclerViewAdapter
import kotlinx.android.synthetic.main.activity_main.rvNumbers

class MainActivity : AppCompatActivity() {
  
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(layout.activity_main)
    showDiffList()
    supportActionBar?.title = getString(string.list_diff)
  }
  
  fun showDiffList() {
    var diffList = Fibonacci().listFilter(Fibonacci().fibonacciGenerator(100))
    var numberAdapter = NumbersRecyclerViewAdapter()
    numberAdapter.data = diffList
    rvNumbers.layoutManager = LinearLayoutManager(this)
    rvNumbers.adapter = numberAdapter
  }
  
}
