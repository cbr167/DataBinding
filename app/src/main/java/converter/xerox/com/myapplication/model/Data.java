package converter.xerox.com.myapplication.model;

import android.databinding.BaseObservable;

import converter.xerox.com.myapplication.BR;

/**
 * Created by q5k66hns on 12/20/2018.
 */

public class Data extends BaseObservable {


    private String firstName;
    private String lastName;
    public String fNameHint;
    public String lNameHint;


    public Data(String fNameHint, String lNameHint) {
        this.fNameHint = fNameHint;
        this.lNameHint = lNameHint;
    }

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

}
