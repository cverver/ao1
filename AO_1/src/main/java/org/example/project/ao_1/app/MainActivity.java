package org.example.project.ao_1.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView rms_image;
    private ImageView lbt_image;
    private ImageView dmr_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rms_image = (ImageView) findViewById(R.id.rms_image);
        lbt_image = (ImageView) findViewById(R.id.lbt_image);
        dmr_image = (ImageView) findViewById(R.id.dmr_image);
    }

    public void onImageClick(View v) {
        ImageView iv = (ImageView) v;
        int height = iv.getLayoutParams().height;
        disableImageMagnification(rms_image);
        disableImageMagnification(lbt_image);
        disableImageMagnification(dmr_image);
        if (height == 200) {
            enableImageMagnification(iv);
        }
    }

    public void enableImageMagnification(ImageView iv) {
        LayoutParams lp = iv.getLayoutParams();
        lp.height = 600;
        lp.width = 600;
        iv.setLayoutParams(lp);
    }

    public void disableImageMagnification(ImageView iv) {
        LayoutParams lp = iv.getLayoutParams();
        lp.height = 200;
        lp.width = 200;
        iv.setLayoutParams(lp);
    }

    public void onStallmanClick(View v) {
        Intent i = new Intent(MainActivity.this, StallmanActivity.class);
        MainActivity.this.startActivity(i);
    }

    public void onTorvaldsClick(View v) {
        Intent i = new Intent(MainActivity.this, TorvaldsActivity.class);
        MainActivity.this.startActivity(i);
    }

    public void onRitchieClick(View v) {
        Intent i = new Intent(MainActivity.this, RitchieActivity.class);
        MainActivity.this.startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_open_github) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/cverver/ao1"));
            startActivity(i);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
