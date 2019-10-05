package id.ac.poliban.mi.sultan.tugasformktm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etNama = findViewById(R.id.etNama);
        EditText etNim = findViewById(R.id.etNim);
        EditText etProdi = findViewById(R.id.etProdi);
        EditText etAlamat = findViewById(R.id.etAlamat);
        Button btClear = findViewById(R.id.btClear);
        Button btLogin = findViewById(R.id.btLogin);

        btClear.setOnClickListener(v -> {
            //mengosongkan edti text
            etNama.setText("");
            etNim.setText("");
            etProdi.setText("");
            etAlamat.setText("");
        //meletakkan kursor di etUserName
        etNama.requestFocus();
    });

        btLogin.setOnClickListener(v -> {
        //mengosongkan EditText
        etNama.setText("");
        etNim.setText("");
        etProdi.setText("");
        etAlamat.setText("");
        etNama.requestFocus();
        Toast.makeText(this, "You Have Logged", Toast.LENGTH_SHORT).show();

    });
    }
}
