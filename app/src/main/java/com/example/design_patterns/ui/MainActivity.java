package com.example.design_patterns.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.design_patterns.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, MovieView {

    MoviePresenter presenter;
    @BindView(R.id.tv)
    TextView tv;
    @BindView(R.id.btn)
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        btn.setOnClickListener(this);

        presenter = new MoviePresenter(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn) {
            presenter.getMovieName();
        }
    }

    @Override
    public void onGetMovieName(String name) {
        tv.setText(name);
    }
}
