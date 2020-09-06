package com.example.assignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import Model.AdminOrders;

public class AdminNewOrdersActivity extends AppCompatActivity
{
    private RecyclerView orderList;
    private DatabaseReference orderRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_new_orders);

        orderRef = FirebaseDatabase.getInstance().getReference().child("Orders");

        orderList = findViewById(R.id.orders_list);
        orderList.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onStart()
    {
        super.onStart ();


        FirebaseRecyclerOptions<AdminOrders>options =
                new FirebaseRecyclerOptions.Builder<AdminOrders> ()
                .setQuery (orderRef, AdminOrders.class)
                .build ();

        FirebaseRecyclerAdapter<AdminOrders, AdminOrdersViewHolder>adapter=
                new FirebaseRecyclerAdapter<AdminOrders, AdminOrdersViewHolder> (options) {
                    @Override
                    protected void onBindViewHolder(AdminOrdersViewHolder holder, int i, AdminOrders model) {
                        holder.userName.setText ("Name :" + model.getName ()) ;
                        holder.userPhoneNumber.setText ("Phone :" + model.getPhone ()) ;
                        holder.userTotalPrice.setText ("Total Amount= RM " + model.getTotalAmount ()) ;
                        holder.userDateTime.setText ("Order at :" + model.getDate () + " " + model.getTime ()) ;
                        holder.userShippingAddress.setText ("Shipping Address :" + model.getAddress () + ", " + model.getCity ()) ;
                    }

                    @NonNull
                    @Override
                    public AdminOrdersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                        View view = LayoutInflater.from (parent.getContext ()).inflate (R.layout.orders_layout, parent, false);
                        return new AdminOrdersViewHolder (view);
                    }
                };

    }

    public static class AdminOrdersViewHolder extends RecyclerView.ViewHolder
    {
        public TextView userName, userPhoneNumber, userTotalPrice, userDateTime, userShippingAddress;
        public Button ShowOrderBtn;

        public AdminOrdersViewHolder(View itemview)
        {
            super(itemview);

            userName = itemview.findViewById (R.id.order_user_name);
            userPhoneNumber = itemview.findViewById (R.id.order_phone_number);
            userTotalPrice = itemview.findViewById (R.id.order_total_price);
            userDateTime = itemview.findViewById (R.id.order_date_time);
            userShippingAddress = itemview.findViewById (R.id.order_address_city);
            ShowOrderBtn = itemview.findViewById (R.id.show_all_products_btn);

        }
    }

}