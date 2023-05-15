package com.example.journeymate;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    Button button;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,Login.class);
                startActivities(intent);
            }
            private void startActivities(Intent intent) {
            }
        });

        button2=findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,Signup.class);
                startActivities(intent);
            }
            private void startActivities(Intent intent) {
            }
        });
    }



    public void showMenu(View v){
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this) ;
        popup.inflate(R.menu.popup_menu);
        popup.show();
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch(menuItem.getItemId()){
            case R.id.Search:
                Toast.makeText(this, "Search clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,Search.class);
                startActivities(new Intent[]{intent});
                return true;

            case R.id.RecommendedPlace:
                Toast.makeText(this, "Recommended Place clicked", Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this, Search.class);
                startActivities(new Intent[]{intent});
                return true;

            case R.id.FlightBooking:
                Toast.makeText(this, "Flight Booking clicked", Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this,flight_booking.class);
                startActivities(new Intent[]{intent});
                return true;

            case R.id.HotelBooking:
                Toast.makeText(this, "Hotel Booking clicked", Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this,activity_hotel_booking2.class);
                startActivities(new Intent[]{intent});
                return true;

            case R.id.Transport:
                Toast.makeText(this, "Transport clicked", Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this,transport.class);
                startActivities(new Intent[]{intent});
                return true;

            case R.id.Traveling:
                Toast.makeText(this, "Traveling clicked", Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this,travelling_activity.class);
                startActivities(new Intent[]{intent});
                return true;

            case R.id.Review:
                Toast.makeText(this, "Review clicked", Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this,review.class);
                startActivities(new Intent[]{intent});
                return true;

            default:
                return false;
        }
    }
}