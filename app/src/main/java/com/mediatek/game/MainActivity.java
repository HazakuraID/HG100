package com.mediatek.game;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends Activity {
  @Override public void onCreate(Bundle b) {
    super.onCreate(b);
    if (Build.VERSION.SDK_INT >= 31) getWindow().setFrameRate(120.0f);
    TextView v = new TextView(this);
    v.setText("Game Helio G100\n\nAndroid 16 / API 36\n120 FPS frame-rate request\nMali-G57 MP2\n\nProfiles:\nQQ飞车: com.tencent.tmgp.speedmobile\nSpeed Drifters: com.garena.game.fctw\n\n120 FP[...]
    v.setTextSize(17); v.setPadding(36,56,36,36); setContentView(v);
  }
}
