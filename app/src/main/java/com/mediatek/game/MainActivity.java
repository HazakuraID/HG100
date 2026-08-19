package com.mediatek.game;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.window.WindowCompat;

public class MainActivity extends Activity {
  @Override public void onCreate(Bundle b) {
    super.onCreate(b);
    if (Build.VERSION.SDK_INT >= 34) {
      setFrameRateApi34();
    } else if (Build.VERSION.SDK_INT >= 31) {
      setFrameRateApi31();
    }
    TextView v = new TextView(this);
    v.setText("Game Helio G100\n\nAndroid 16 / API 36\n120 FPS frame-rate request\nMali-G57 MP2\n\nProfiles:\nQQ飞车: com.tencent.tmgp.speedmobile\nSpeed Drifters: com.garena.game.fctw\n\n120 FPS unlocked");
    v.setTextSize(17); v.setPadding(36,56,36,36); setContentView(v);
  }

  @RequiresApi(34)
  private void setFrameRateApi34() {
    WindowCompat.setWindowFrameRate(this, 120.0f, Surface.FRAME_RATE_COMPATIBILITY_DEFAULT);
  }

  @RequiresApi(31)
  private void setFrameRateApi31() {
    WindowCompat.setWindowFrameRate(this, 120.0f);
  }
}
