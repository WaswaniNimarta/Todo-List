// Generated by Dagger (https://dagger.dev).
package com.example.roomdb.viewModel;

import com.example.roomdb.repository.ToDoListRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainActivityVM_Factory implements Factory<MainActivityVM> {
  private final Provider<ToDoListRepository> repositoryProvider;

  public MainActivityVM_Factory(Provider<ToDoListRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public MainActivityVM get() {
    return newInstance(repositoryProvider.get());
  }

  public static MainActivityVM_Factory create(Provider<ToDoListRepository> repositoryProvider) {
    return new MainActivityVM_Factory(repositoryProvider);
  }

  public static MainActivityVM newInstance(ToDoListRepository repository) {
    return new MainActivityVM(repository);
  }
}