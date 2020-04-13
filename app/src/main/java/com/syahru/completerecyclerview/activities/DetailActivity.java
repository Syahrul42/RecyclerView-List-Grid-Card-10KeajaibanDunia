package com.syahru.completerecyclerview.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.syahru.completerecyclerview.R;
import com.syahru.completerecyclerview.models.Dunia;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_DUNIA = "extra_dunia";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.img_detail);
        TextView name = findViewById(R.id.tv_name_detail);
        TextView description = findViewById(R.id.tv_desc_detail);
        TextView country = findViewById(R.id.tv_country_detail);


        Dunia dunia = getIntent().getParcelableExtra(EXTRA_DUNIA);

        Glide.with(this).load(dunia.getPhoto()).into(imageView);
        name.setText(dunia.getName());
        description.setText(dunia.getDescription());
        country.setText(dunia.getTempat());
    }
}
