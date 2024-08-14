package com.example.app_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewcomputer;
    private TextView textViewResult;
    private ImageButton imgButtonScissor, imgButtonRock, imgButtonPaper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewcomputer = (ImageView) findViewById(R.id.imageView_computer);
        imageViewcomputer.setVisibility(View.INVISIBLE);

        textViewResult = (TextView) findViewById(R.id.textView_result);
        textViewResult.setText("");

        imgButtonScissor = (ImageButton) findViewById(R.id.imageButton_scissor);
        imgButtonRock = (ImageButton) findViewById(R.id.imageButton_rock);
        imgButtonPaper = (ImageButton) findViewById(R.id.imageButton_paper);

        imgButtonScissor.setOnClickListener(new MyClass());
        imgButtonRock.setOnClickListener(new MyClass());
        imgButtonPaper.setOnClickListener(new MyClass());

    }

    private class MyClass implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            int number = (int)(Math.random()*3+1);
            Log.d("main", "number="+number);
            imageViewcomputer.setVisibility(View.VISIBLE);

            switch (v.getId()) {
                case R.id.imageButton_scissor:
                    Log.d("main", "scissor");
                    switch (number){
                        case 1:
                            imageViewcomputer.setImageResource(R.drawable.scissor);
                            textViewResult.setText(getString(R.string.draw));
                            break;

                        case 2:
                            imageViewcomputer.setImageResource(R.drawable.rock);
                            textViewResult.setText(getString(R.string.lose));
                            break;

                        case 3:
                            imageViewcomputer.setImageResource(R.drawable.paper);
                            textViewResult.setText(getString(R.string.win));
                            break;
                    }
                    break;

                case R.id.imageButton_rock:
                    Log.d("main", "rock");

                    switch (number){
                        case 1:
                            imageViewcomputer.setImageResource(R.drawable.scissor);
                            textViewResult.setText(getString(R.string.win));
                            break;

                        case 2:
                            imageViewcomputer.setImageResource(R.drawable.rock);
                            textViewResult.setText(getString(R.string.draw));
                            break;

                        case 3:
                            imageViewcomputer.setImageResource(R.drawable.paper);
                            textViewResult.setText(getString(R.string.lose));
                            break;
                    }
                    break;

                case R.id.imageButton_paper:
                    Log.d("main", "paper");

                    switch (number){
                        case 1:
                            imageViewcomputer.setImageResource(R.drawable.scissor);
                            textViewResult.setText(getString(R.string.lose));
                            break;

                        case 2:
                            imageViewcomputer.setImageResource(R.drawable.rock);
                            textViewResult.setText(getString(R.string.win));
                            break;

                        case 3:
                            imageViewcomputer.setImageResource(R.drawable.paper);
                            textViewResult.setText(getString(R.string.draw));
                            break;
                    }
                    break;

            }
        }
    }
}