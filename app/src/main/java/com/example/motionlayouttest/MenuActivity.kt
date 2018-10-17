package com.example.motionlayouttest

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    fun openFirstScene(v: View) {
        startActivity<Scene01Activity>()
    }

    fun openScene02(v: View) {
        startActivity<Scene02Activity>()
    }

    fun openImageTransition(v: View) {
        startActivity<ImageTransitionActivity>()
    }

    fun openMeridianSunset(v: View) {
        startActivity<MeridianSunsetActivity>()
    }
}

inline fun <reified T : Activity> Context.startActivity() {
    val intent = Intent(this, T::class.java)
    startActivity(intent)
}