package com.thida.userloginmvp.presenter;

import com.thida.userloginmvp.model.User;

public class LoginPresenter {
    private User user;
    private View view;

    public LoginPresenter(View view) {
        this.user = new User();
        this.view = view;
    }

    public void updateUserName(String userName){
        user.setUserName(userName);
        view.updateUserName(user.getUserName());
    }

    public void updateEmail(String email){
        user.setEmail(email);
        view.updateUserEmail(user.getEmail());
    }

    public interface View{
        void updateUserName(String info);
        void updateUserEmail(String info);
    }
}
