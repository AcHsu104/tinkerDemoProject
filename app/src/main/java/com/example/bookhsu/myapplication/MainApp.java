//package com.example.bookhsu.myapplication;
//
//import android.app.Application;
//import android.os.Environment;
//import android.util.Log;
//import android.widget.Toast;
//
////import com.alipay.euler.andfix.patch.PatchManager;
//
//import com.tencent.tinker.lib.tinker.TinkerInstaller;
//
//import java.io.File;
//import java.io.IOException;
//
///**
// * Created by bookhsu on 2017/6/18.
// */
//
//public class MainApp extends Application {
//    private static final String APATCH_PATH = "/out.apatch";
//    private static final String TAG = "MainApp";
//    private static final String DIR = "apatch";//补丁文件夹
//    /**
//     * patch manager
//     */
////    private PatchManager mPatchManager;
//
//    @Override
//    public void onCreate() {
//        super.onCreate();
////        mPatchManager = new PatchManager(this);
////        mPatchManager.init("1.0");
////        Log.d(TAG, "inited.");
////
////        // load patch
////        mPatchManager.loadPatch();
////        try {
////            // .apatch file path
////            String patchFileString = Environment.getExternalStorageDirectory()
////                    .getAbsolutePath() + APATCH_PATH;
////            mPatchManager.addPatch(patchFileString);
////            Log.d(TAG, "apatch:" + patchFileString + " added.");
////
////            //复制且加载补丁成功后，删除下载的补丁
////            File f = new File(this.getFilesDir(), DIR + APATCH_PATH);
////            if (f.exists()) {
////                boolean result = new File(patchFileString).delete();
////                if (!result)
////                    Log.e(TAG, patchFileString + " delete fail");
////            }
////        } catch (IOException e) {
////            Log.e(TAG, "", e);
////        }
//
//        String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/tinkersample/patch_signed_7zip.apk";
//        File file = new File(path);
//        if (file.exists()){
//            Toast.makeText(this,"补丁存在", Toast.LENGTH_SHORT).show();
//            TinkerInstaller.onReceiveUpgradePatch(getApplicationContext(),path);
//        }else{
//            Toast.makeText(this,"补丁不存在", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//}
