package com.example.administrator.test;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.Relative);
        imageView = (ImageView)findViewById(R.id.imageview);
        //设置margin;
       // ViewGroup.MarginLayoutParams margin = new ViewGroup.MarginLayoutParams(
              //  imageView.getLayoutParams());
        //margin.setMargins(100, 100, 0, 0);// 在左边距100像素，顶边距100像素的位置显示图片
        //RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
              //  margin);

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(relativeLayout.getLayoutParams());
//layoutParams.addRule(RelativeLayout.CENTER_IN_PARENT);
        //居中显示
layoutParams.setMargins(300,100,0,0);
//好像图片显示与原图像相同，如果是正方形，还是正方形
        layoutParams.height = 500;// 设置图片的高度
        layoutParams.width = 300; // 设置图片的宽度
        //imageView.setScaleType(ImageView.ScaleType.FIT_XY);使图片充满控件大小
        //imageView.setPadding(100,100,0,0);设置Padding值
        imageView.setLayoutParams(layoutParams);

    }
}
