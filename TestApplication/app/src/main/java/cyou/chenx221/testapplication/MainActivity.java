package cyou.chenx221.testapplication;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.xxvideo_layout);
        setContentView(R.layout.color_select_linearlayout);

    }

    public void rb1_onclick(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.show_color_pad);
        linearLayout.setBackgroundColor(Color.GRAY);
    }

    public void rb2_onclick(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.show_color_pad);
        linearLayout.setBackgroundColor(getResources().getColor(R.color.pink));
    }

    public void rb3_onclick(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.show_color_pad);
        linearLayout.setBackgroundColor(Color.YELLOW);
    }
}