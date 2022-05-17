package com.example.shoppingcart.ui.information;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InformationViewModel extends ViewModel {


    private final MutableLiveData<String> openingHours;
    private final MutableLiveData<String> openingHoursTitle;

    public InformationViewModel() {
        openingHoursTitle = new MutableLiveData<>();
        openingHoursTitle.setValue("Opening Hours");
        openingHours = new MutableLiveData<>();
        openingHours.setValue(
                "Monday: 08:00 - 20:00\n" +
                "Tuesday: 08:00 - 20:00\n" +
                "Wednesday: 08:00 - 20:00\n" +
                "Thursday: 08:00 - 20:00\n" +
                "Friday: 08:00 - 20:00\n" +
                "Saturday: 10:00 - 15:00\n" +
                "Sunday: Closed");
    }

    public LiveData<String> getOpeningHoursTitle() {
        return openingHoursTitle;
    }

    public LiveData<String> getOpeningHours() {
        return openingHours;
    }
}