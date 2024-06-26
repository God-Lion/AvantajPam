package ht.AvantajPam.app;

import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

import ht.AvantajPam.app.Adapter.SlideAdapter;

public class HomeActivity extends AppCompatActivity {
    private ViewPager2 viewPager;
    private Handler handler = new Handler();
    private Runnable runnable;
    private int currentPage = 0;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        viewPager = findViewById(R.id.viewPager);

        List<Integer> imageList = new ArrayList<>();
        imageList.add(R.drawable.avantajpam);
        imageList.add(R.drawable.backheader);
//        imageList.add(R.drawable.image1);
//        imageList.add(R.drawable.image2);
//        imageList.add(R.drawable.image3);
        // Add more images as needed

        SlideAdapter adapter = new SlideAdapter(imageList);
        viewPager.setAdapter(adapter);

        runnable = new Runnable() {
            @Override
            public void run() {
                if (currentPage == adapter.getItemCount()) {
                    currentPage = 0;
                }
                viewPager.setCurrentItem(currentPage++, true);
                handler.postDelayed(this, 3000); // Slide duration of 3 seconds
            }
        };
        handler.postDelayed(runnable, 3000);


    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(runnable);
    }
}