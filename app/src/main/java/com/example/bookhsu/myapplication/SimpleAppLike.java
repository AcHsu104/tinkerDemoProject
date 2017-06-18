package com.example.bookhsu.myapplication;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.support.multidex.MultiDex;
import android.widget.Toast;

import com.tencent.tinker.anno.DefaultLifeCycle;
import com.tencent.tinker.lib.tinker.TinkerInstaller;
import com.tencent.tinker.loader.app.DefaultApplicationLike;
import com.tencent.tinker.loader.shareutil.ShareConstants;

import java.io.File;

/*
 * FileName: SimpleApp
 * Author  : it-009
 * Date    : 16-10-26
 * Desc    :
 */

@DefaultLifeCycle(
        application = "com.example.bookhsu.myapplication.MainApp",
        flags = ShareConstants.TINKER_ENABLE_ALL,
        loadVerifyFlag = false
)
public class SimpleAppLike extends DefaultApplicationLike {

    public SimpleAppLike(Application application, int tinkerFlags, boolean tinkerLoadVerifyFlag,
                         long applicationStartElapsedTime, long applicationStartMillisTime,
                         Intent tinkerResultIntent, Resources[] resources, ClassLoader[] classLoader,
                         AssetManager[] assetManager) {
        super(application, tinkerFlags, tinkerLoadVerifyFlag,
                applicationStartElapsedTime, applicationStartMillisTime,
                tinkerResultIntent, resources, classLoader, assetManager);

    }

    @Override
    public void onBaseContextAttached(Context base) {
        super.onBaseContextAttached(base);
        MultiDex.install(base);
        TinkerInstaller.install(this);


        String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/tinkersample/patch_signed_7zip.apk";
        File file = new File(path);
        if (file.exists()){
            Toast.makeText(base,"补丁存在", Toast.LENGTH_SHORT).show();
            TinkerInstaller.onReceiveUpgradePatch(base.getApplicationContext(),path);
        }else{
            Toast.makeText(base,"补丁不存在", Toast.LENGTH_SHORT).show();
        }
    }

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    public void registerActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks callback) {
        getApplication().registerActivityLifecycleCallbacks(callback);
    }


}