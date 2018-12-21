package converter.xerox.com.myapplication;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;

import converter.xerox.com.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        DisplayMetrics metrics = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(metrics);
//        Log.d("metrics.widthPixels", String.valueOf(metrics.widthPixels));
//        Log.d("metrics.height", String.valueOf(metrics.heightPixels));

      afterUpdate();


    }
    public void afterUpdate(){
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        Data data = new Data();
        activityMainBinding.setBindingData(data);
    }
}
