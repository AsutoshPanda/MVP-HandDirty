package com.mobotechnology.bipinpandey.mvp_hand_dirty;

public class Contract {

    public interface Prersenter{
        void updateFullName(String fullName);
        void updateEmail(String email);
    }

    public interface View{
        void updateUserInfoTextView(String info);
        void showProgressBar();
        void hideProgressBar();
    }
}
