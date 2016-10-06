package com.example.fabien.myvehicle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyVehicleActivity";
    private EditText editTextMake;
    private EditText editTextYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {

        //(EditText) is an explicit type cast (type conversion).
        // This is required as the return type of findViewById is View, which is the superclass of most UI elements in Android.
        editTextMake = (EditText) findViewById(R.id.inputMake);
        editTextYear = (EditText) findViewById(R.id.inputYear);
        String make = editTextMake.getText().toString();
        String strYear = editTextYear.getText().toString();
        //The getText().toString() will return a String.
        // A simple getText() won't work as the return type for the method is Editable.

        Vehicle vehicle;
        if (strYear.matches("")) {
            vehicle = new Vehicle(make);
        } else {
            int intYear = Integer.parseInt(strYear);
            vehicle = new Vehicle(make, intYear);
        }
        //Toast in Android is a small pop-up message.
        // The signature for the method we used is public static Toast makeText (Context context, CharSequence text, int duration).
        // Click here for details of this method.
        Toast.makeText(getApplicationContext(), vehicle.getMessage(), Toast.LENGTH_SHORT).show();
        Log.d(TAG, "User clicked " + Vehicle.counter + " times.");
        Log.d(TAG, "User message is \"" + vehicle + "\".");
        Log.d(TAG, "onButtonClick() called with: view = [" + view + "]");
    }

}
