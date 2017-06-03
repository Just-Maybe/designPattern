package com.example.helloworld.androiddesignpattern.imageloader;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by helloworld on 2017/5/25.
 */

public final class CloseUtils {
    private CloseUtils() {

    }

    public static void closeQuietly(Closeable closeable) {
        if (null != closeable) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
