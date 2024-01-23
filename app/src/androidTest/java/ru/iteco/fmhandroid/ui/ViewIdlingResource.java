package ru.iteco.fmhandroid.ui;

import androidx.test.espresso.IdlingResource;

public class ViewIdlingResource implements IdlingResource {
    public ViewIdlingResource(int i) {
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void registerIdleTransitionCallback(ResourceCallback callback) {

    }

    @Override
    public boolean isIdleNow() {
        return false;
    }
}
