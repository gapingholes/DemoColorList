package sg.edu.rp.c346.id21010650.demodynamiclistviewcolourlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editColor;
    EditText editPosition;
    Button buttonAddColor;
    ListView listViewColor;
    ArrayList<String> colorList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editColor = findViewById(R.id.editColor);
        editPosition = findViewById(R.id.editPosition);
        buttonAddColor = findViewById(R.id.buttonAddColor);
        listViewColor = findViewById(R.id.listViewColor);


        colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Orange");
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, colorList);
        listViewColor.setAdapter(adapter);



     buttonAddColor.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick (View v) {
             String color = editColor.getText().toString();
             int pos = Integer.parseInt(editPosition.getText().toString());
             colorList.add(pos, color);
             adapter.notifyDataSetChanged();

             listViewColor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                 @Override
                 public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                     Toast.makeText(getApplicationContext()," ",Toast.LENGTH_SHORT).show();
                 }
         })
     ;};
    })
;};}