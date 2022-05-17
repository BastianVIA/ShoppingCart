package com.example.shoppingcart.ui.carts;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CartsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public CartsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is carts fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
