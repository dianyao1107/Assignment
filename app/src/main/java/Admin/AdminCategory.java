package Admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment.HomeActivity;
import com.example.assignment.MainActivity;
import com.example.assignment.R;

public class AdminCategory extends AppCompatActivity {
    private ImageView tShirts, sportsTShirts, femaleDresses, sweathers;
    private ImageView glasses, hatsCaps, walletsBagsPurses, shoes;
    private ImageView headPhonesHandFree, Laptops, watches, mobilePhones;

    private Button LogoutBtn,CheckOrdersBtn,maintainProductBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);
        maintainProductBtn = (Button) findViewById(R.id.maintain_btn);

        maintainProductBtn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategory.this, HomeActivity.class);
                intent.putExtra ("Admin","Admin");
                startActivity(intent);
                finish();
            }
        });

        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategory.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });

        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategory.this, AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });


        tShirts = (ImageView) findViewById(R.id.t_shirts);
        sportsTShirts = (ImageView) findViewById(R.id.sports_t_shirts);
        femaleDresses = (ImageView) findViewById(R.id.female_dresses);
        sweathers = (ImageView) findViewById(R.id.sweathers);

        glasses = (ImageView) findViewById(R.id.glasses);
        hatsCaps = (ImageView) findViewById(R.id.hats_caps);
        walletsBagsPurses = (ImageView) findViewById(R.id.purses_bags_wallets);
        shoes = (ImageView) findViewById(R.id.shoes);

        headPhonesHandFree = (ImageView) findViewById(R.id.headphones_handfree);
        Laptops = (ImageView) findViewById(R.id.laptop_pc);
        watches = (ImageView) findViewById(R.id.watches);
        mobilePhones = (ImageView) findViewById(R.id.mobilephones);


        tShirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category", "tShirts");
                startActivity(intent);
            }
        });

        sportsTShirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category", "Sports tShirts");
                startActivity(intent);
            }
        });

        femaleDresses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category", "Female Dresses");
                startActivity(intent);
            }
        });

        sweathers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category", "Sweathers");
                startActivity(intent);
            }
        });

        glasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category", "Glasses");
                startActivity(intent);
            }
        });

        walletsBagsPurses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category", "Wallets Bags Purses");
                startActivity(intent);
            }
        });

        hatsCaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category", "Hats Caps");
                startActivity(intent);
            }
        });

        shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category", "Shoes");
                startActivity(intent);
            }
        });

        headPhonesHandFree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category", "HeadPhones HandFree");
                startActivity(intent);
            }
        });

        Laptops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category", "Laptops");
                startActivity(intent);
            }
        });

        watches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category", "Watches");
                startActivity(intent);
            }
        });

        mobilePhones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category", "Mobile Phones");
                startActivity(intent);
            }
        });
    }

}