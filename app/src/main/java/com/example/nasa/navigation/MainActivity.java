package com.example.nasa.navigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;

public class MainActivity extends AppCompatActivity {

     Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.toolbarMain);
        toolbar.setTitle("Title Bar");

        // Create the AccountHeader
        AccountHeader headerResult = new AccountHeaderBuilder()
                .withActivity(this)
                .withHeaderBackground(R.drawable.header)
                .addProfiles(
                        new ProfileDrawerItem().withName("Nikesh Subedi").withEmail("subedinikesh222@gmail.com").withIcon(getResources().getDrawable(R.drawable.profile))
                )
                .withOnAccountHeaderListener(new AccountHeader.OnAccountHeaderListener() {
                    @Override
                    public boolean onProfileChanged(View view, IProfile profile, boolean currentProfile) {
                        return false;
                    }
                })
                .build();

        //if you want to update the items at a later time it is recommended to keep it in a variable
        PrimaryDrawerItem item1 = new PrimaryDrawerItem().withIdentifier(1).withName("Home").withIcon(getResources().getDrawable(R.drawable.home1));
        PrimaryDrawerItem item2 = new PrimaryDrawerItem().withIdentifier(2).withName("Setting").withIcon(getResources().getDrawable(R.drawable.setting));
        PrimaryDrawerItem item3 = new PrimaryDrawerItem().withIdentifier(2).withName("Account").withIcon(getResources().getDrawable(R.drawable.account));
        PrimaryDrawerItem item4 = new PrimaryDrawerItem().withIdentifier(2).withName("Contact").withIcon(getResources().getDrawable(R.drawable.contact));
        PrimaryDrawerItem item5 = new PrimaryDrawerItem().withIdentifier(2).withName("Achievements").withIcon(getResources().getDrawable(R.drawable.achievements));
        PrimaryDrawerItem item6 = new PrimaryDrawerItem().withIdentifier(2).withName("location").withIcon(getResources().getDrawable(R.drawable.location));
        PrimaryDrawerItem item7 = new PrimaryDrawerItem().withIdentifier(2).withName("Log Out").withIcon(getResources().getDrawable(R.drawable.quit));
//create the drawer and remember the `Drawer` result object
        Drawer result = new DrawerBuilder()
                .withActivity(this)
                .withAccountHeader(headerResult)
                .withToolbar(toolbar)
                .addDrawerItems(
                        item1,item2,item3,item4,item5,item6,item7
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        // do something with the clicked item :D
                       switch(position){
                           case 1:break;
                           case 2:break;

                       }
                       return true;
                    }
                })
                .build();
    }
}
