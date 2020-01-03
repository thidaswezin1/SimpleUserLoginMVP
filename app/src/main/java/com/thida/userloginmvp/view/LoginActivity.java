package com.thida.userloginmvp.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.thida.userloginmvp.R;
import com.thida.userloginmvp.presenter.LoginPresenter;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity implements LoginPresenter.View {
    LoginPresenter presenter;
    EditText name,email;
    TextView tvName,tvEmail;
    Button btnLogin;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvName = findViewById(R.id.textView1);
        tvEmail = findViewById(R.id.textView2);
        name = findViewById(R.id.user_name);
        email = findViewById(R.id.email);
        btnLogin = findViewById(R.id.login);
        presenter = new LoginPresenter(this);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.updateUserName(name.getText().toString());
                presenter.updateEmail(email.getText().toString());
            }
        });
    }

    @Override
    public void updateUserName(String info) {
        tvName.setText(info);
    }

    @Override
    public void updateUserEmail(String info) {
        tvEmail.setText(info);
    }
}
