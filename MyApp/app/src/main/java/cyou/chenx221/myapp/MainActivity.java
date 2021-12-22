package cyou.chenx221.myapp;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    String key1 = "admin", key2 = "admin";
    int time=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        setContentView(R.layout.chatting_layout);
        setContentView(R.layout.login_layout);
//        //根布局为线性布局
//        LinearLayout ll = new LinearLayout(this);
//        //设置宽高
//        ll.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
//        //设置背景色
//        ll.setBackgroundColor(Color.RED);
//        //指定activity为这个线性布局
//        setContentView(ll);

    }

    public void buttom_submit_click(View view) {
        EditText e1 = (EditText) findViewById(R.id.username);
        EditText e2 = (EditText) findViewById(R.id.password);
        Button b1 = (Button) findViewById(R.id.button_submit);
        TextView t1 = (TextView) findViewById(R.id.log);

        if(time==5){
            b1.setEnabled(false);
            b1.setText("登尼玛登");
        }
        else {
            if (e1.getText().toString().equals(key1) && e2.getText().toString().equals(key2)) {
                t1.setText(t1.getText() + "\nSuccess");
            } else {
                t1.setText(t1.getText() + "\nFail");
                time++;
            }
//        else{
//            t1.setText("fail\n"+e1.getText().toString());
//        }
        }
    }

    public void buttom_reset_click(View view) {
        EditText e1 = (EditText) findViewById(R.id.username);
        EditText e2 = (EditText) findViewById(R.id.password);
        TextView t1 = (TextView) findViewById(R.id.log);
        Button b1 = (Button) findViewById(R.id.button_reset);
        if(time==5){
            b1.setEnabled(false);
        }
        e1.setText("");
        e2.setText("");
        t1.setText("Log:");
    }

    public void buttom_register_click(View view) {
        Button b1 = (Button) findViewById(R.id.button_reg);
        b1.setText(b1.getText() + "(尚未实现)");
        b1.setEnabled(false);
    }

    public void buttom_forget_click(View view) {
        TextView t1 = (TextView) findViewById(R.id.log);
        Button b1 = (Button) findViewById(R.id.button_forget);
        if(time==5){
            b1.setEnabled(false);
        }
        t1.setText(t1.getText() + "\nUsername:" + key1 + "\nPassword:" + key2);
    }
}
