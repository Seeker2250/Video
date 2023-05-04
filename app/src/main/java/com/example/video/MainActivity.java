package com.example.video;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.fountain_night);
        VideoView videoView = (VideoView)findViewById(R.id.videoView);

        //MediaController 만들자
        MediaController mc = new MediaController(this);
        //MediaController를 video view에 장착
        videoView.setMediaController(mc);
        videoView.setVideoURI(uri);
        videoView.start();
        //상수는 View class에 define되어있어
        videoView.setVisibility(View.VISIBLE);

    }
}