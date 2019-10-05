package id.ac.poliban.dts.indra.latihan00;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //konten yang dihubungkan dengan koding  java kita

        setContentView(R.layout.activity_main);

        //menghubungkan view dengan object button
        //dalam source kode kita
        Button btFirst =findViewById(R.id.btFirst) ;
        Button btSecond =findViewById(R.id.btSecond) ;
        Button btThird =findViewById(R.id.btThird) ;
        Button btFour =findViewById(R.id.btFour) ;

        //interface onClickListener merupakan interface yang ada dikelas View
        //hanya berisi satu method onClick(View view)
        btFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hei anda telah menekan button pertama", Toast.LENGTH_SHORT).show();
            }
        });

        btSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hei anda telah menekan button Kedua", Toast.LENGTH_SHORT).show();
            }
        });
        btThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hei anda telah menekan button Ketiga", Toast.LENGTH_SHORT).show();
            }
        });

        btFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hei anda telah menekan button keempat", Toast.LENGTH_LONG ).show();
            }
        });


    }
}
