package com.example.cookies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean buttonState = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w("Main Activity","Good morning America");
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {

        ImageView cookieImage = findViewById(R.id.android_cookie_image_view);
        TextView stomachText = findViewById(R.id.status_text_view);

        if(buttonState == false){
            // TODO: Find a reference to the ImageView in the layout. Change the image.
            cookieImage.setImageResource(R.drawable.after_cookie);

            // TODO: Find a reference to the TextView in the layout. Change the text.
            stomachText.setText(R.string.stomach);

            buttonState = true;
        }
        else{
            // TODO: Find a reference to the ImageView in the layout. Change the image.
            cookieImage.setImageResource(R.drawable.before_cookie);

            // TODO: Find a reference to the TextView in the layout. Change the text.
            stomachText.setText(R.string.stomachEmpty);
            buttonState = false;
        }

    }
}