package com.example.camera;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

        private Button btnImage;
        private ImageView imgImage;
        private static final int Image_Capture_Code=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnImage=(Button) findViewById(R.id.btnTakePhoto);
        imgImage=(ImageView) findViewById(R.id.capturedImage);
        btnImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent (MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,Image_Capture_Code);
            }
        });
    }

        @Override
    protected void  onActivityResult(int requestcode ,int resultcode, Intent data){

            if(requestcode==Image_Capture_Code){
                if (resultcode == Image_Ok)
            }
    }


}