
package com.gennadysx.rnrg;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNRadialGradientModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNRadialGradientModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNRadialGradient";
  }
}
