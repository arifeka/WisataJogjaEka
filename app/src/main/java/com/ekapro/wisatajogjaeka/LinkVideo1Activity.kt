package com.ekapro.wisatajogjaeka

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView

class LinkVideo1Activity : YouTubeBaseActivity(), YouTubePlayer.OnInitializedListener {
    lateinit var yt : YouTubePlayerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_link_video1)

        yt = findViewById(R.id.linkVideo1)
        yt.initialize("AIzaSyDFX4GeCLo6oEzTikhwqaTD2oyTHG7SzAA", this)
        requestedOrientation= ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
    }
    override fun onInitializationSuccess(
        p0: YouTubePlayer.Provider?,
        p1: YouTubePlayer?,
        p2: Boolean
    ) {

        p1!!.setFullscreen(true)
        p1.cueVideo("WdNCl4Cx8iU")
        p1.play()

    }

    override fun onInitializationFailure(
        p0: YouTubePlayer.Provider?,
        p1: YouTubeInitializationResult?
    ) {
        if (p1!!.isUserRecoverableError){
            p1.getErrorDialog(this,1).show()
        }

    }
}