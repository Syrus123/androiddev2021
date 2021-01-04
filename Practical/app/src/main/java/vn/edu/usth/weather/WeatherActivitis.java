package vn.edu.usth.weather;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
public class WeatherActivitis extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_activitis);

        Log.i("MainActivity Lifecycle", "===== onCreate =====");

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity Lifecycle", "===== onStart =====");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivity Lifecycle", "===== onRestart =====");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity Lifecycle", "===== onResume =====");
    }
    @Override
    protected void onPause() {
        super.onPause();

        Log.i("MainActivity Lifecycle", "===== onPause =====");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity Lifecycle", "===== onStop =====");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity Lifecycle", "===== onDestroy =====");
    }
}
