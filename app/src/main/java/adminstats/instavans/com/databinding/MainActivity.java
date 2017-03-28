package adminstats.instavans.com.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import adminstats.instavans.com.databinding.databinding.ActivityMainBinding;
import io.github.rakshakhegde.lastpageradapter.LastPagerAdapter;

public class MainActivity extends AppCompatActivity {

    ViewPager viewp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        DataModel model = new DataModel();
        binding.setModel(model);
        model.text.set("yfgytfg");

        new LastPagerAdapter(BR.nnn)
                .add(R.layout.page_one, "Title One",model)
                .add(R.layout.page_two, "Title Two",model)
                .into(binding.vp);

        binding.tabLayoutGeneric.setupWithViewPager(binding.vp);



    }

}
