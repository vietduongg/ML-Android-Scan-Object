package com.vietduong.HiU

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnObjectDetection_click(view: View) {
        val intent = Intent(this, ObjectDetection::class.java)
        startActivity(intent)
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {

        //Khởi động native-lib
        init {
            System.loadLibrary("native-lib")
        }
    }
}
