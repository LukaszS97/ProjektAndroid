package com.example.apkarowery.Sellers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.apkarowery.Admin.AdminNewOrdersActivity;
import com.example.apkarowery.Buyers.HomeActivity;
import com.example.apkarowery.Buyers.MainActivity;
import com.example.apkarowery.R;
import com.example.apkarowery.Sellers.SellerAddNewProductActivity;

public class SellerProductCategoryActivity extends AppCompatActivity {

    private ImageView rowerszosowy, rowervintage;
    private ImageView rowergorski, rowermiejski;

   // private Button LogoutBtn, CheckOrdersBtn, maintainProductsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_add_category);

//        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
//        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);
//        maintainProductsBtn = (Button) findViewById(R.id.maintain_btn);
//
//
//        maintainProductsBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SellerProductCategoryActivity.this, HomeActivity.class);
//                intent.putExtra("Admin","Admin");
//                startActivity(intent);
//            }
//        });
//
//
//
//        LogoutBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SellerProductCategoryActivity.this, MainActivity.class);
//                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                startActivity(intent);
//                finish();
//            }
//        });
//
//        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SellerProductCategoryActivity.this, AdminNewOrdersActivity.class);
//                startActivity(intent);
//            }
//        });


        rowerszosowy = (ImageView) findViewById(R.id.rowerszosowy);
        rowervintage = (ImageView) findViewById(R.id.rowervintage);

        rowergorski = (ImageView) findViewById(R.id.rowergorski);
        rowermiejski = (ImageView) findViewById(R.id.rowermiejski);

        rowerszosowy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class );
                intent.putExtra("category", "Rower szosowy");
                startActivity(intent);
            }
        });

        rowervintage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class );
                intent.putExtra("category", "Rower vintage");
                startActivity(intent);
            }
        });
        rowergorski.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class );
                intent.putExtra("category", "Rower górski");
                startActivity(intent);
            }
        });
        rowermiejski.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class );
                intent.putExtra("category", "Rower miejski");
                startActivity(intent);
            }
        });
    }
}
