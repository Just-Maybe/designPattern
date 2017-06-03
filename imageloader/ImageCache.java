package com.example.helloworld.androiddesignpattern.imageloader;

import android.graphics.Bitmap;

/**
 * Created by helloworld on 2017/5/25.
 */

public interface ImageCache {
    void put(String url, Bitmap bitmap);
    Bitmap get(String url);
}
