package cl.isisur.appchillanviejov2.ui.home;

import android.os.Bundle;
import android.widget.EditText;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.google.android.gms.maps.GoogleMap;

import cl.isisur.appchillanviejov2.R;

public class HomeViewModel extends ViewModel {


    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Aquí va el mapa");
    }



    public LiveData<String> getText() {
        return mText;
    }
}