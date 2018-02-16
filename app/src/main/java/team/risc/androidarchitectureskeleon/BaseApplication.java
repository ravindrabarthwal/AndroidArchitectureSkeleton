package team.risc.androidarchitectureskeleon;

import android.app.Application;
import timber.log.Timber;

/**
 * @author Ravindra Barthwal
 */

public class BaseApplication extends Application {

  @Override
  public void onCreate(){
    super.onCreate();
    if(BuildConfig.DEBUG){
      Timber.plant(new Timber.DebugTree());
    }
  }
}
