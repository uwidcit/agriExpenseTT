package uwi.dcit.AgriExpenseTT;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.nineoldandroids.view.ViewHelper;

public class WelcomeScreen extends AppCompatActivity {

    private final String TAG_NAME = "WelcomeScreen";
    private final int TOTAL_PAGES = 4;

    private Button btnSkip, btnDone;
    private ImageButton btnNext;

    private ViewPager pager;
    private PagerAdapter pagerAdapter;

    boolean isOpaque = true;

    LinearLayout circles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);


        pagerInit();
        buttonInit();
    }

    private void pagerInit() {
        pager = (ViewPager) findViewById(R.id.pager);
        pagerAdapter = new ScreenSlideAdapter(getSupportFragmentManager());
        pager.setAdapter(pagerAdapter);
        pager.setPageTransformer(true, new CrossfadePageTransformer());
        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (position == TOTAL_PAGES - 2 && positionOffset > 0) {
                    if (isOpaque) {
                        pager.setBackgroundColor(Color.TRANSPARENT);
                        isOpaque = false;
                    }
                } else {
                    if (!isOpaque) {
                        pager.setBackgroundColor(getResources().getColor(R.color.primary_material_light));
                        isOpaque = true;
                    }
                }
            }

            @Override
            public void onPageSelected(int position) {
                setIndicator(position);
                if (position == TOTAL_PAGES - 2) {
                    btnSkip.setVisibility(View.GONE);
                    btnNext.setVisibility(View.GONE);
                    btnDone.setVisibility(View.VISIBLE);
                } else if (position < TOTAL_PAGES - 2) {
                    btnSkip.setVisibility(View.VISIBLE);
                    btnNext.setVisibility(View.VISIBLE);
                    btnDone.setVisibility(View.GONE);
                } else if (position == TOTAL_PAGES - 1) {
                    endTutorial();
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        buildCircles();

    }

    private void buttonInit() {
        btnSkip = Button.class.cast(findViewById(R.id.btn_skip));
        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                endTutorial();
            }
        });

        btnDone = Button.class.cast(findViewById(R.id.done));
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                endTutorial();
            }
        });

        btnNext = ImageButton.class.cast(findViewById(R.id.btn_next));
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(pager.getCurrentItem() + 1, true);
            }
        });
    }

    private void buildCircles() {
        circles = LinearLayout.class.cast(findViewById(R.id.circles));

        float scale = getResources().getDisplayMetrics().density;
        int padding = (int) (5 * scale + 0.5f);

        for (int i = 0; i < TOTAL_PAGES - 1; i++) {
            ImageView circle = new ImageView(this);
            circle.setImageResource(R.drawable.ic_checkbox_blank_circle_white_18dp);
            circle.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            circle.setAdjustViewBounds(true);
            circle.setPadding(padding, 0, padding, 0);
            circles.addView(circle);
        }

        setIndicator(0);
    }

    private void setIndicator(int index) {
        if (index < TOTAL_PAGES) {
            for (int i = 0; i < TOTAL_PAGES - 1; i++) {
                ImageView circle = (ImageView) circles.getChildAt(i);
                if (i == index) {

                    circle.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.text_selected));
                } else {
                    circle.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.transparent_bg));
                }
            }
        }
    }

    public void endTutorial() {
        Log.i(TAG_NAME, "End Tutorial Button Selected");
        finish();
    }

    public void moveNext() {
        Log.i(TAG_NAME, "Move Next Button Selected");
    }

    class ScreenSlideAdapter extends FragmentStatePagerAdapter {

        public ScreenSlideAdapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            WelcomeScreenFragment welcomeScreenFragment = null;
            switch (position) {
                case 0:
                    welcomeScreenFragment = WelcomeScreenFragment.newInstance(R.layout.fragment_welcome_screen1);
                    break;
                case 1:
                    welcomeScreenFragment = WelcomeScreenFragment.newInstance(R.layout.fragment_welcome_screen2);
                    break;
                case 2:
                    welcomeScreenFragment = WelcomeScreenFragment.newInstance(R.layout.fragment_welcome_screen3);
                    break;
                case 3:
                    welcomeScreenFragment = WelcomeScreenFragment.newInstance(R.layout.fragment_welcome_screen4);
                    break;
            }

            return welcomeScreenFragment;
        }

        @Override
        public int getCount() {
            return TOTAL_PAGES;
        }
    }

    public class CrossfadePageTransformer implements ViewPager.PageTransformer {

        @Override
        public void transformPage(View page, float position) {
            int pageWidth = page.getWidth();

            View backgroundView = page.findViewById(R.id.welcome_fragment);
            View text_head = page.findViewById(R.id.screen_heading);
            View text_content = page.findViewById(R.id.screen_desc);

            if (0 <= position && position < 1) {
                ViewHelper.setTranslationX(page, pageWidth * -position);
            }
            if (-1 < position && position < 0) {
                ViewHelper.setTranslationX(page, pageWidth * -position);
            }

            if (position <= -1.0f || position >= 1.0f) {

            } else if (position == 0.0f) {
            } else {
                if (backgroundView != null) {
                    ViewHelper.setAlpha(backgroundView, 1.0f - Math.abs(position));

                }

                if (text_head != null) {
                    ViewHelper.setTranslationX(text_head, pageWidth * position);
                    ViewHelper.setAlpha(text_head, 1.0f - Math.abs(position));
                }

                if (text_content != null) {
                    ViewHelper.setTranslationX(text_content, pageWidth * position);
                    ViewHelper.setAlpha(text_content, 1.0f - Math.abs(position));
                }
            }
        }
    }
}
