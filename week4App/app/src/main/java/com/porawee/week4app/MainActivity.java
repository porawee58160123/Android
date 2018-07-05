package com.porawee.week4app;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //array ที่เก็บ reference ของ Imageview (รูปสัตว์ ทั้ง 9)
    private final ImageView imageAnimals[] = new ImageView[9];
    //object MediaPlayer ที่ใช้เล่นไฟล์เสียง
    private MediaPlayer mPlayer;
    private View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ค้นหา ImageView ต่างๆ จาก Layout Fine แล้วเก็บการอ้างอิงลง Array
// imageAnimals[0] = (ImageView) findViewById(R.id.pig);
// imageAnimals[1] = (ImageView) findViewById(R.id.dog);
        imageAnimals[0] = (ImageView) findViewById(R.id.ImgTxtRhino);
        imageAnimals[1] = (ImageView) findViewById(R.id.ImgTxtTiger);
        imageAnimals[2] = (ImageView) findViewById(R.id.ImgTxtSheep);
        imageAnimals[3] = (ImageView) findViewById(R.id.ImgTxtCat);
        imageAnimals[4] = (ImageView) findViewById(R.id.ImgTxtCow);
        imageAnimals[5] = (ImageView) findViewById(R.id.ImgTxtDog);
        imageAnimals[6] = (ImageView) findViewById(R.id.ImgTxtgoat);
        imageAnimals[7] = (ImageView) findViewById(R.id.ImgTxthorse);
        imageAnimals[8] = (ImageView) findViewById(R.id.ImgTxtpig);

//กำหนดให้การคลิก ImageView ทกอันเรียกมาที่ onClick ใน object ปัจจุบัน
        for (int i = 0; i < imageAnimals.length; i++) {
            imageAnimals[i].setOnClickListener(this);
        }

    }
    public void onClick(View v){
        int resID = 0;

        switch (v.getId()){
            case R.id.ImgTxtRhino:
                resID = R.raw.rhinoceros;
                break;
            case R.id.ImgTxtTiger:
                resID = R.raw.tiger;
                break;
            case R.id.ImgTxtSheep:
                resID = R.raw.sheep;
                break;
            case R.id.ImgTxtCat:
                resID = R.raw.cat;
                break;
            case R.id.ImgTxtCow:
                resID = R.raw.cow;
                break;
            case R.id.ImgTxtDog:
                resID = R.raw.dog;
                break;
            case R.id.ImgTxtgoat:
                resID = R.raw.goat;
                break;
            case R.id.ImgTxthorse:
                resID = R.raw.horse;
                break;
            case R.id.ImgTxtpig:
                resID = R.raw.pig;
                break;

        }
        playSound(resID);

    }

    private void playSound(int id) {
        if(mPlayer !=null){
            mPlayer.stop();
            mPlayer.release();
        }

//สร้าง object MediaPlayer เพื่อเล่นเสียงตาม Resource ID ที่ระบุ
        mPlayer = MediaPlayer.create(this,id);
        mPlayer.start();
    }
}

