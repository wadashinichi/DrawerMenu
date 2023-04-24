package com.example.drawermenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Button
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationBarMenu
import com.google.android.material.navigation.NavigationView
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    lateinit var drawerLayout: DrawerLayout
    lateinit var navigationView: NavigationView
    lateinit var toolBar: Toolbar
    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawer_layout)
        navigationView = findViewById(R.id.navigationView)
        actionBarDrawerToggle =
            ActionBarDrawerToggle(this, drawerLayout, R.string.menu_Open, R.string.close_menu)
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()

        var tmpt = getSupportActionBar()
        if (tmpt != null) {
            tmpt.setDisplayHomeAsUpEnabled(true)
        }
//        navigationView.setNavigationItemSelectedListener(NavigationView.OnNavigationItemSelectedListener() {
//            override fun onNavigationItemSelected(item: MenuItem): Boolean {
//                when (item.itemId) {
//                    R.id.nav_home -> {
//                        Log.i("MENU_DRAVER_TAG", "Home item is clicked")
//                        drawerLayout.closeDrawer(GravityCompat.START)
//                    }
//                    R.id.nav_search -> {
//                        Log.i("MENU_DRAVER_TAG", "Search item is clicked")
//                        drawerLayout.closeDrawer(GravityCompat.START)
//                    }
//                    R.id.nav_users -> {
//                        Log.i("MENU_DRAVER_TAG", "User item is clicked")
//                        drawerLayout.closeDrawer(GravityCompat.START)
//                    }
//                    R.id.nav_profile -> {
//                        Log.i("MENU_DRAVER_TAG", "Profiles item is clicked")
//                        drawerLayout.closeDrawer(GravityCompat.START)
//                    }
//                    R.id.nav_settings -> {
//                        Log.i("MENU_DRAVER_TAG", "Settings item is clicked")
//                        drawerLayout.closeDrawer(GravityCompat.START)
//                    }
//                    R.id.nav_share -> {
//                        Log.i("MENU_DRAVER_TAG", "Share item is clicked")
//                        drawerLayout.closeDrawer(GravityCompat.START)
//                    }
//                    R.id.nav_donate -> {
//                        Log.i("MENU_DRAVER_TAG", "Donate item is clicked")
//                        drawerLayout.closeDrawer(GravityCompat.START)
//                    }
//                    R.id.nav_logout -> {
//                        Log.i("MENU_DRAVER_TAG", "Logout item is clicked")
//                        drawerLayout.closeDrawer(GravityCompat.START)
//                    }
//                }
//                return true
//            }
//        })
        navigationView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_home -> {
                    Log.i("MENU_DRAVER_TAG", "Home item is clicked")
                    drawerLayout.closeDrawer(GravityCompat.START)
                    true
                }
                    R.id.nav_search -> {
                        Log.i("MENU_DRAVER_TAG", "Search item is clicked")
                        drawerLayout.closeDrawer(GravityCompat.START)
                        true
                    }
                    R.id.nav_users -> {
                        Log.i("MENU_DRAVER_TAG", "User item is clicked")
                        drawerLayout.closeDrawer(GravityCompat.START)
                        true
                    }
                    R.id.nav_profile -> {
                        Log.i("MENU_DRAVER_TAG", "Profiles item is clicked")
                        drawerLayout.closeDrawer(GravityCompat.START)
                        true
                    }
                    R.id.nav_settings -> {
                        Log.i("MENU_DRAVER_TAG", "Settings item is clicked")
                        drawerLayout.closeDrawer(GravityCompat.START)
                        true
                    }
                    R.id.nav_share -> {
                        Log.i("MENU_DRAVER_TAG", "Share item is clicked")
                        drawerLayout.closeDrawer(GravityCompat.START)
                        true
                    }
                    R.id.nav_donate -> {
                        Log.i("MENU_DRAVER_TAG", "Donate item is clicked")
                        drawerLayout.closeDrawer(GravityCompat.START)
                        true
                    }
                    R.id.nav_logout -> {
                        Log.i("MENU_DRAVER_TAG", "Logout item is clicked")
                        drawerLayout.closeDrawer(GravityCompat.START)
                        true
                    }
                else -> false
            }
        }
    }
}


