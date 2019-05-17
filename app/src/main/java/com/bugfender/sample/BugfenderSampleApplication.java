package com.bugfender.sample;

import android.app.Application;
import com.bugfender.sdk.Bugfender;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

public class BugfenderSampleApplication extends Application {

  @Override public void onCreate() {
    super.onCreate();
    Fabric.with(this, new Crashlytics());

    // Initialize Bugfender
    Bugfender.init(this, "APPLICATION_TOKEN", BuildConfig.DEBUG); //TODO: replace with your app token here
    Bugfender.enableLogcatLogging();
    Bugfender.enableUIEventLogging(this);
  }
}
