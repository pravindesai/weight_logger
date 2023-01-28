// Generated by Dagger (https://dagger.dev).
package com.gym.logger.weightlogger.ui.screen.sessionScreen;

import com.gym.logger.weightlogger.repository.SessionRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SessionViewModel_Factory implements Factory<SessionViewModel> {
  private final Provider<SessionRepository> sessionRepositoryProvider;

  public SessionViewModel_Factory(Provider<SessionRepository> sessionRepositoryProvider) {
    this.sessionRepositoryProvider = sessionRepositoryProvider;
  }

  @Override
  public SessionViewModel get() {
    return newInstance(sessionRepositoryProvider.get());
  }

  public static SessionViewModel_Factory create(
      Provider<SessionRepository> sessionRepositoryProvider) {
    return new SessionViewModel_Factory(sessionRepositoryProvider);
  }

  public static SessionViewModel newInstance(SessionRepository sessionRepository) {
    return new SessionViewModel(sessionRepository);
  }
}