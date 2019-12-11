package com.test.banner.demo;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.test.banner.App;
import com.test.banner.R;
import com.test.banner.SampleAdapter;
import com.test.banner.loader.GlideImageLoader;
import com.youth.iherbbanner.Banner;
import com.youth.iherbbanner.listener.OnBannerListener;
import com.youth.iherbbanner.transformer.AccordionTransformer;
import com.youth.iherbbanner.transformer.BackgroundToForegroundTransformer;
import com.youth.iherbbanner.transformer.CubeInTransformer;
import com.youth.iherbbanner.transformer.CubeOutTransformer;
import com.youth.iherbbanner.transformer.DefaultTransformer;
import com.youth.iherbbanner.transformer.DepthPageTransformer;
import com.youth.iherbbanner.transformer.FlipHorizontalTransformer;
import com.youth.iherbbanner.transformer.FlipVerticalTransformer;
import com.youth.iherbbanner.transformer.ForegroundToBackgroundTransformer;
import com.youth.iherbbanner.transformer.RotateDownTransformer;
import com.youth.iherbbanner.transformer.RotateUpTransformer;
import com.youth.iherbbanner.transformer.ScaleInOutTransformer;
import com.youth.iherbbanner.transformer.StackTransformer;
import com.youth.iherbbanner.transformer.TabletTransformer;
import com.youth.iherbbanner.transformer.ZoomInTransformer;
import com.youth.iherbbanner.transformer.ZoomOutSlideTransformer;
import com.youth.iherbbanner.transformer.ZoomOutTranformer;

import java.util.ArrayList;
import java.util.List;

public class BannerAnimationActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, OnBannerListener {
    Banner banner;
    List<Class<? extends ViewPager.PageTransformer>> transformers=new ArrayList<>();
    public void initData(){
        transformers.add(DefaultTransformer.class);
        transformers.add(AccordionTransformer.class);
        transformers.add(BackgroundToForegroundTransformer.class);
        transformers.add(ForegroundToBackgroundTransformer.class);
        transformers.add(CubeInTransformer.class);//兼容问题，慎用
        transformers.add(CubeOutTransformer.class);
        transformers.add(DepthPageTransformer.class);
        transformers.add(FlipHorizontalTransformer.class);
        transformers.add(FlipVerticalTransformer.class);
        transformers.add(RotateDownTransformer.class);
        transformers.add(RotateUpTransformer.class);
        transformers.add(ScaleInOutTransformer.class);
        transformers.add(StackTransformer.class);
        transformers.add(TabletTransformer.class);
        transformers.add(ZoomInTransformer.class);
        transformers.add(ZoomOutTranformer.class);
        transformers.add(ZoomOutSlideTransformer.class);
    }
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner_animation);
        initData();
        banner = (Banner) findViewById(R.id.banner);
        ListView listView = (ListView) findViewById(R.id.list);
        String[] data = getResources().getStringArray(R.array.anim);
        listView.setAdapter(new SampleAdapter(this, data));
        listView.setOnItemClickListener(this);

        banner.setImages(App.images)
                .setImageLoader(new GlideImageLoader())
                .setOnBannerListener(this)
                .start();

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        banner.setBannerAnimation(transformers.get(position));
    }

    @Override
    public void OnBannerClick(int position) {
        Toast.makeText(getApplicationContext(),"你点击了："+position,Toast.LENGTH_SHORT).show();
    }
}
