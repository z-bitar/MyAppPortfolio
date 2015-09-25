package net.magic_packets.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {
    Button btnspotify, btnscores, btnlibrary, btnbuild, btnbacon, btncapstone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnspotify = (Button) findViewById(R.id.btn_spotify_streamer);
        btnscores = (Button) findViewById(R.id.btn_scores_app);
        btnlibrary = (Button) findViewById(R.id.btn_library_app);
        btnbuild = (Button) findViewById(R.id.btn_build_it_bigger);
        btnbacon = (Button) findViewById(R.id.btn_bacon_reader);
        btncapstone = (Button) findViewById(R.id.btn_capstone);

        btnspotify.setOnClickListener(this);
        btnscores.setOnClickListener(this);
        btnlibrary.setOnClickListener(this);
        btnbuild.setOnClickListener(this);
        btnbacon.setOnClickListener(this);
        btncapstone.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        // TODO Auto-generated method stub

        switch (view.getId()) {
            case R.id.btn_spotify_streamer:

                Toast.makeText(getApplicationContext(), R.string.spotify_streamer_toast, Toast.LENGTH_LONG).show();
                break;

            case R.id.btn_scores_app:
                Toast.makeText(getApplicationContext(), R.string.scores_app_toast, Toast.LENGTH_LONG).show();
                break;

            case R.id.btn_library_app:
                Toast.makeText(getApplicationContext(), R.string.library_app_toast, Toast.LENGTH_LONG).show();
                break;

            case R.id.btn_build_it_bigger:
                Toast.makeText(getApplicationContext(), R.string.build_it_bigger_toast, Toast.LENGTH_LONG).show();
                break;

            case R.id.btn_bacon_reader:
                Toast.makeText(getApplicationContext(), R.string.bacon_reader_toast, Toast.LENGTH_LONG).show();
                break;

            case R.id.btn_capstone:
                Toast.makeText(getApplicationContext(), R.string.capstone_toast, Toast.LENGTH_LONG).show();
                break;
        }
    }
}
