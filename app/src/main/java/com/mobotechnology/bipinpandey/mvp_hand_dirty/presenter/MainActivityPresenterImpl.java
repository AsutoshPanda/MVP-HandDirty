package com.mobotechnology.bipinpandey.mvp_hand_dirty.presenter;

import com.mobotechnology.bipinpandey.mvp_hand_dirty.Contract;
import com.mobotechnology.bipinpandey.mvp_hand_dirty.model.UserModel;


public class MainActivityPresenterImpl implements Contract.Presenter {

    private UserModel userModel;
    private Contract.View viewCallback;

    public MainActivityPresenterImpl(Contract.View view) {
        this.userModel = new UserModel();
        this.viewCallback = view;
    }

    @Override
    public void updateFullName(String fullName){
        userModel.setFullName(fullName);
        viewCallback.updateUserInfoTextView(userModel.toString());

    }

    @Override
    public void updateEmail(String email){
        userModel.setEmail(email);
        viewCallback.updateUserInfoTextView(userModel.toString());

    }
}
