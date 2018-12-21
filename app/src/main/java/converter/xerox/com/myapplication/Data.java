package converter.xerox.com.myapplication;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

/**
 * Created by q5k66hns on 12/20/2018.
 */

public class Data extends BaseObservable {

    private String firstName;
    private String abcd = "aaaa";
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR._all);


    }

    public String getLastName() {
        return lastName;

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR._all);
    }

    public void onLoginButtonClick(){
       notifyPropertyChanged(BR._all);

    }

}
