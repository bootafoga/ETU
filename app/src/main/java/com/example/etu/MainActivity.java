package com.example.etu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private static final byte countOfDays = 6;
    private boolean firstWeek;
    private byte numOfDay;
    private SectionsPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(pagerAdapter);

        setWeek();
        pager.setCurrentItem(numOfDay);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setTabTextColors(
                getResources().getColor(R.color.unselected_text_color),
                getResources().getColor(R.color.selected_text_color)
        );
        tabLayout.setupWithViewPager(pager);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.selected_text_color));
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.switcher1:
                firstWeek = true;
                pagerAdapter.updateData();
                setDate();
                return true;
            case R.id.switcher2:
                firstWeek = false;
                pagerAdapter.updateData();
                setDate();
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void setWeek() {
        Calendar calendar = Calendar.getInstance();
        int week = calendar.get(Calendar.WEEK_OF_YEAR);
        if (week % 2 == 0) firstWeek = true;
        else firstWeek = false;
        numOfDay = (byte) calendar.get(Calendar.DAY_OF_WEEK);
        if (numOfDay == 1) numOfDay = 0;
        else {
            numOfDay -= 2;
        }
        setDate();
    }

    private void setDate(){
        TextView currentDate = findViewById(R.id.current_date);
        String date = "Сегодня "+ new SimpleDateFormat(" dd.MM", Locale.US).format(new Date()) +
                " (Выбрана " + (firstWeek ? "первая" : "вторая")
                + " неделя)";
        currentDate.setText(date);
    }

    private class SectionsPagerAdapter extends FragmentStatePagerAdapter {
        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public void updateData(){
            notifyDataSetChanged();
        }

        @Override
        public int getItemPosition(Object object) {
            return POSITION_NONE;
        }

        @Override
        public int getCount() {
            return countOfDays;
        }

        @Override
        public Fragment getItem(int position) {
            OneDayFragment frag = new OneDayFragment();
            if (firstWeek) {
                switch (position) {
                    case 0:
                        frag.setDay("monday_first");
                        return frag;
                    case 1:
                        frag.setDay("tuesday_first");
                        return frag;
                    case 2:
                        frag.setDay("wednesday_first");
                        return frag;
                    case 3:
                        frag.setDay("thursday_first");
                        return frag;
                    case 4:
                        frag.setDay("friday_first");
                        return frag;
                    case 5:
                        frag.setDay("saturday_first");
                        return frag;
                }
                return null;
            } else {
                switch (position) {
                    case 0:
                        frag.setDay("monday_second");
                        return frag;
                    case 1:
                        frag.setDay("tuesday_second");
                        return frag;
                    case 2:
                        frag.setDay("wednesday_second");
                        return frag;
                    case 3:
                        frag.setDay("thursday_second");
                        return frag;
                    case 4:
                        frag.setDay("friday_second");
                        return frag;
                    case 5:
                        frag.setDay("saturday_second");
                        return frag;
                }
                return null;
            }
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return getResources().getText(R.string.mon);
                case 1:
                    return getResources().getText(R.string.tue);
                case 2:
                    return getResources().getText(R.string.wed);
                case 3:
                    return getResources().getText(R.string.thr);
                case 4:
                    return getResources().getText(R.string.fri);
                case 5:
                    return getResources().getText(R.string.sat);
            }
            return null;

        }
    }
}
