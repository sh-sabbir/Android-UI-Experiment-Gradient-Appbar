package bd.com.codeian;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.res.ResourcesCompat;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.mikepenz.crossfadedrawerlayout.view.CrossfadeDrawerLayout;
import com.mikepenz.crossfader.Crossfader;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.MiniDrawer;
import com.mikepenz.materialdrawer.interfaces.ICrossfader;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;
import com.mikepenz.materialdrawer.util.DrawerUIUtils;
import com.mikepenz.materialize.util.UIUtils;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Button g1,g2,g3,g4,reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //must be called before setContentView(...)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        final AppBarLayout barLayout = (AppBarLayout) this.findViewById(R.id.app_bar);

        setSupportActionBar(toolbar);

        g1 = findViewById(R.id.button1);
        g2 = findViewById(R.id.button2);
        g3 = findViewById(R.id.button3);
        g4 = findViewById(R.id.button4);
        reset = findViewById(R.id.btnReset);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        //result.setActionBarDrawerToggle(toggle);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_nav_toggole_4);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barLayout.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.gradient_app_bar_back_1, null));
                getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_nav_toggole_4);
            }
        });

        g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barLayout.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.gradient_app_bar_back_2, null));
                getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_nav_toggole);
            }
        });

        g3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barLayout.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.gradient_app_bar_back_3, null));
                getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_nav_toggole_2);
            }
        });

        g4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barLayout.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.gradient_app_bar_back_4, null));
                getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_nav_toggole_3);
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barLayout.setBackground(new ColorDrawable(getResources().getColor(R.color.primary)));
                getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_nav_toggole_4);
            }
        });

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
