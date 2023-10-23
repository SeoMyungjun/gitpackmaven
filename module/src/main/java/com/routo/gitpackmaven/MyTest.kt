package com.routo.gitpackmaven

import android.content.Context
import android.widget.Toast

class MyTest(context: Context) {
  fun test(context: Context, message:String) {
    Toast.makeText(context, "maventest", Toast.LENGTH_SHORT).show()

  }
}