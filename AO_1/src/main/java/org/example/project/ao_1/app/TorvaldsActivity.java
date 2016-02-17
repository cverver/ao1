package org.example.project.ao_1.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class TorvaldsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_torvalds);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_torvalds, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_open_wiki) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://en.wikipedia.org/wiki/Linus_Torvalds"));
            startActivity(i);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
