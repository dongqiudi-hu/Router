package com.lzh.nonview.router.route;

import android.content.Context;
import android.net.Uri;

/**
 * Created by admin on 16/9/7.
 */
public class EmptyCallback implements RouteCallback {

    @Override
    public boolean interceptOpen(Uri uri, Context context, ActivityRouteBundleExtras extras) {
        return false;
    }

    @Override
    public void notFound(Uri uri, String clzName) {

    }

    @Override
    public void onOpenSuccess(Uri uri, String clzName) {

    }

    @Override
    public void onOpenFailed(Uri uri, Exception e) {

    }
}
