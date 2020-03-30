package com.mobotechnology.bipinpandey.mvp_hand_dirty.main_activity.presenter;

import com.mobotechnology.bipinpandey.mvp_hand_dirty.main_activity.Contract;
import com.mobotechnology.bipinpandey.mvp_hand_dirty.main_activity.model.User;


public class MainActivityPresenterImpl implements Contract.Prersenter{

    private User user;
    private Contract.View callback;

    public MainActivityPresenterImpl(Contract.View view) {
        this.user = new User();
        this.callback = view;
    }

    @Override
    public void updateFullName(String fullName){
        user.setFullName(fullName);
        callback.updateUserInfoTextView(user.toString());

    }

    @Override
    public void updateEmail(String email){
        user.setEmail(email);
        callback.updateUserInfoTextView(user.toString());

    }
}
