package com.example.shoppingcart.ui.unlock;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UnlockViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public UnlockViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is unlock fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}