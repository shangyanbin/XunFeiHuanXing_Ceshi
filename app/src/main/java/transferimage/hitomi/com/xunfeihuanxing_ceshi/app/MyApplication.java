package transferimage.hitomi.com.xunfeihuanxing_ceshi.app;

import android.app.Application;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;

import transferimage.hitomi.com.xunfeihuanxing_ceshi.R;

public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        SpeechUtility.createUtility(this, SpeechConstant.APPID + "=5be53e78");
       // initializeIflytek();
    }
    /**
     * 初始化讯飞语音
     */ private void initializeIflytek() {
         StringBuffer param = new StringBuffer();
         //IflytekAPP_id为我们申请的Appid
        param.append("appid=5be53e78");
        param.append(",");
        // 设置使用v5+
        param.append(SpeechConstant.ENGINE_MODE+"="+SpeechConstant.MODE_MSC);
        SpeechUtility.createUtility(this, param.toString());
     }

}
