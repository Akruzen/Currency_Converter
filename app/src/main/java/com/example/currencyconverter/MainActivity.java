package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view)
    {
        Log.i("Info", "Button Pressed!");
        EditText editText = (EditText) findViewById(R.id.editText);
        String amountInUSD = editText.getText().toString();
        double amountInUSDDouble = Double.parseDouble(amountInUSD);
        Double amountInINRDouble = amountInUSDDouble*70.74;
        String amountInINRString = String.format("%.2f", amountInINRDouble);
        Toast.makeText(this, (amountInUSD + " US Dollar(s) is/are " + amountInINRString +
                " Rupees."), Toast.LENGTH_LONG).show();
        Log.i("Amount in Rupees", amountInINRString);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}