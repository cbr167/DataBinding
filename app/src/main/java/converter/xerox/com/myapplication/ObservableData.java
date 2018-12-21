package converter.xerox.com.myapplication;

import android.databinding.ObservableField;

/**
 * Created by q5k66hns on 12/20/2018.
 */

public class ObservableData {

    private ObservableField<String> firstName;
    private ObservableField<String> lastName;

    public void onLoginButtonClick(){
        firstName = new ObservableField<>();
        lastName = new ObservableField<>();
    }

    public ObservableField<String> getFirstName() {
        return firstName;
    }

    public void setFirstName(ObservableField<String> firstName) {
        this.firstName = firstName;
    }

    public ObservableField<String> getLastName() {
        return lastName;
    }

    public void setLastName(ObservableField<String> lastName) {
        this.lastName = lastName;
    }
}
