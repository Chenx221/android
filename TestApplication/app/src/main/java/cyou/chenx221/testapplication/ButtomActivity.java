package cyou.chenx221.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ButtomActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttom);

        Button btn1 = findViewById(R.id.btn1);
        MyClickListener mc1 = new MyClickListener();
        btn1.setOnClickListener(mc1); //为按钮注册点击事件监听器

        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("TAG","匿名内部类");
            }


        });
        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.e("TAG","用本类实现OnClickListener");
    }

    class MyClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Log.e("TAG","hello world");
        }
    }

    public void myClick(View v){
        Log.e("TAG","hello world");
    }
}