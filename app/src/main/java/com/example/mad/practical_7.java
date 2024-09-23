package com.example.mad;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class practical_7 extends AppCompatActivity {

    ListView list;
    String names[] = {
            "Maulik Hiteshkumar Thumar",
            "Smit Khageshkumar Patel",
            "Prajapati Savan Ashokbhai",
            "Prajapati Dhruv Rajnikantbhai",
            "Divy Maheshbhai Patel",
            "Maulik Hiteshkumar Thumar",
            "Smit Khageshkumar Patel",
            "Prajapati Savan Ashokbhai",
            "Prajapati Dhruv Rajnikantbhai",
            "Divy Maheshbhai Patel",
    };

    String enroll_no[] = {
            "226400316221",
            "226400316147",
            "226400316176",
            "226400316169",
            "226230316113",
            "226400316221",
            "226400316147",
            "226400316176",
            "226400316169",
            "226230316113",
    };

    int profile_photos[] ={
            R.drawable.maulik,
            R.drawable.smit,
            R.drawable.savan,
            R.drawable.dhruv,
            R.drawable.divy,
            R.drawable.maulik,
            R.drawable.smit,
            R.drawable.savan,
            R.drawable.dhruv,
            R.drawable.divy,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.practical7);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        list = findViewById(R.id.list);

        practical_7_CustomAdapter adp = new practical_7_CustomAdapter(this,names,profile_photos,enroll_no);

        list.setAdapter(adp);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), names[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}