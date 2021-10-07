package com.awesomeapp;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;

import expo.modules.ReactActivityDelegateWrapper;

public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "AwesomeApp";
  }

  @Override
  protected ReactActivityDelegate createReactActivityDelegate() {
    return new ReactActivityDelegateWrapper(
      this, 
      new ReactActivityDelegate(this, getMainComponentName())
    );
  }
}
