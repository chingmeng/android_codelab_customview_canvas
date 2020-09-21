package com.example.android.android_codelab_customview_canvas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(MyCanvasView(this).apply {
            systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN // Will also remove os status bar on top
            contentDescription = getString(R.string.canvasContentDescription)
        })
    }
}