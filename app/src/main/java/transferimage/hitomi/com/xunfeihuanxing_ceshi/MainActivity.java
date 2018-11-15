package transferimage.hitomi.com.xunfeihuanxing_ceshi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;

public class MainActivity extends AppCompatActivity {


    private WakeUpUtil wakeUpUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 开启唤醒
        wakeUpUtil = new WakeUpUtil(this) {
            @Override
            public void wakeUp() {
                Toast.makeText(MainActivity.this, "唤醒成功", Toast.LENGTH_SHORT).show();
                // 开启唤醒
               // wakeUpUtil.wake();
            }
        };
    }
    public void button(View view){
        wakeUpUtil.wake();

    }
}
