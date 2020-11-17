package com.example.apkarowery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView rowerszosowy, rowervintage;
    private ImageView rowergorski, rowermiejski;
    private ImageView tandem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        rowerszosowy = (ImageView) findViewById(R.id.rowerszosowy);
        rowervintage = (ImageView) findViewById(R.id.rowervintage);

        rowergorski = (ImageView) findViewById(R.id.rowergorski);
        rowermiejski = (ImageView) findViewById(R.id.rowermiejski);

        tandem = (ImageView) findViewById(R.id.tandem);

        rowerszosowy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class );
                intent.putExtra("category", "Rower szosowy");
                startActivity(intent);
            }
        });

        rowervintage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class );
                intent.putExtra("category", "Rower vintage");
                startActivity(intent);
            }
        });
        rowergorski.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class );
                intent.putExtra("category", "Rower górski");
                startActivity(intent);
            }
        });
        rowermiejski.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class );
                intent.putExtra("category", "Rower miejski");
                startActivity(intent);
            }
        });
        tandem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class );
                intent.putExtra("category", "Tandem");
                startActivity(intent);
            }
        });
    }
}
