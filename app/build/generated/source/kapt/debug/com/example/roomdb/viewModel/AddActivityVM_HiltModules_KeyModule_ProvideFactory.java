// Generated by Dagger (https://dagger.dev).
package com.example.roomdb.viewModel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddActivityVM_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static AddActivityVM_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(AddActivityVM_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final AddActivityVM_HiltModules_KeyModule_ProvideFactory INSTANCE = new AddActivityVM_HiltModules_KeyModule_ProvideFactory();
  }
}
