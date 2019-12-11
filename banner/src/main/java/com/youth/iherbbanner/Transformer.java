package com.youth.iherbbanner;

import android.support.v4.view.ViewPager.PageTransformer;

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

public class Transformer {
    public static Class<? extends PageTransformer> Default = DefaultTransformer.class;
    public static Class<? extends PageTransformer> Accordion = AccordionTransformer.class;
    public static Class<? extends PageTransformer> BackgroundToForeground = BackgroundToForegroundTransformer.class;
    public static Class<? extends PageTransformer> ForegroundToBackground = ForegroundToBackgroundTransformer.class;
    public static Class<? extends PageTransformer> CubeIn = CubeInTransformer.class;
    public static Class<? extends PageTransformer> CubeOut = CubeOutTransformer.class;
    public static Class<? extends PageTransformer> DepthPage = DepthPageTransformer.class;
    public static Class<? extends PageTransformer> FlipHorizontal = FlipHorizontalTransformer.class;
    public static Class<? extends PageTransformer> FlipVertical = FlipVerticalTransformer.class;
    public static Class<? extends PageTransformer> RotateDown = RotateDownTransformer.class;
    public static Class<? extends PageTransformer> RotateUp = RotateUpTransformer.class;
    public static Class<? extends PageTransformer> ScaleInOut = ScaleInOutTransformer.class;
    public static Class<? extends PageTransformer> Stack = StackTransformer.class;
    public static Class<? extends PageTransformer> Tablet = TabletTransformer.class;
    public static Class<? extends PageTransformer> ZoomIn = ZoomInTransformer.class;
    public static Class<? extends PageTransformer> ZoomOut = ZoomOutTranformer.class;
    public static Class<? extends PageTransformer> ZoomOutSlide = ZoomOutSlideTransformer.class;
}
