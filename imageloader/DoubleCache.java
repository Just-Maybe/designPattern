package com.example.helloworld.androiddesignpattern.imageloader;

import android.graphics.Bitmap;

/**
 * Created by helloworld on 2017/5/25.
 */

public class DoubleCache implements ImageCache {
    MemoryCache mMemoryCache = new MemoryCache();
    DiskCache mDiskCache = new DiskCache();

    /**
     * 将图片缓存到sd卡和内存中
     *
     * @param url
     * @param bitmap
     */
    @Override
    public void put(String url, Bitmap bitmap) {
        mMemoryCache.put(url, bitmap);
        mDiskCache.put(url, bitmap);
    }

    /**
     * 先从内存缓存中获取图片，如果没有，再从Sd卡中获取
     *
     * @param url
     * @return
     */
    @Override
    public Bitmap get(String url) {
        Bitmap bitmap = mMemoryCache.get(url);
        if (bitmap == null) {
            bitmap = mDiskCache.get(url);
        }
        return bitmap;
    }
}
