package com.example.viewpagerwithtabs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    private TabLayout tablayout;
    private ViewPager2 viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();
        setPagerAdapter();
    }

    private void initviews() {
        tablayout=findViewById(R.id.tab);
        viewPager=findViewById(R.id.viewpager);
    }

    private void setPagerAdapter() {
        PagerAdapter pagerAdaptor = new PagerAdapter(getSupportFragmentManager(),getLifecycle());
        viewPager.setAdapter(pagerAdaptor);
        new TabLayoutMediator(tablayout, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab( TabLayout.Tab tab, int position) {
                if(position==0){
                    tab.setText("Names");
                }else  if(position==1){

                    tab.setText("Places");
                }else{
                    if(position==2)
                        tab.setText("Tourisit Places");
                }

            }
        }).attach();
    }
}