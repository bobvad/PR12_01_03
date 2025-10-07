package com.example.orderss_degtiannikov;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.TaskStackBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
    public void OnArrange(View view)
    {
        EditText etName = findViewById(R.id.etName);
        EditText etPhone = findViewById(R.id.etPhone);
        EditText etAdress = findViewById(R.id.etAddress);
        if(etName.getText().length() == 0) AlertDialog("Уведомление","Пожалуйста укажите Фамилию, Имя и Отчество.");
        else if(etPhone.getText().length() == 0) AlertDialog("Уведомление","Пожалуйста укажите номер телефона.");
        else if(etAdress.getText().length() == 0) AlertDialog("Уведомление","Пожалуйста укажите адрес доставки.");
        else
        {
            AlertDialog("Уведомление","Заказ успешно оформлен.");
        }
    }
    public void AlertDialog(String title,String message)
    {
        AlertDialog.Builder Builder = new AlertDialog.Builder(MainActivity.this);
        Builder.setTitle(title)
                .setMessage(message)
                .setCancelable(false)
                .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.cancel();
                    }
                });
        AlertDialog Alert = Builder.create();
        Alert.show();
    }
}