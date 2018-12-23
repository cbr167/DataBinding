package converter.xerox.com.myapplication;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import converter.xerox.com.myapplication.commands.ButtonClick;
import converter.xerox.com.myapplication.databinding.ActivityMainBinding;
import converter.xerox.com.myapplication.model.Data;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
//        DisplayMetrics metrics = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(metrics);
//        Log.d("metrics.widthPixels", String.valueOf(metrics.widthPixels));
//        Log.d("metrics.height", String.valueOf(metrics.heightPixels));

      afterUpdate();


    }
    public void afterUpdate(){
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        final Data data = new Data("First Name","Last Name");
        activityMainBinding.setBindingData(data);

        activityMainBinding.setButtonClick(new ButtonClick() {
            @Override
            public void onClick() {
                Toast.makeText(MainActivity.this, data.getFirstName() + " " + data.getLastName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
