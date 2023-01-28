// Generated by Dagger (https://dagger.dev).
package com.gym.logger.weightlogger.repository;

import com.gym.logger.weightlogger.data.dao.SessionDao;
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
public final class SessionRepository_Factory implements Factory<SessionRepository> {
  private final Provider<SessionDao> sessionDaoProvider;

  public SessionRepository_Factory(Provider<SessionDao> sessionDaoProvider) {
    this.sessionDaoProvider = sessionDaoProvider;
  }

  @Override
  public SessionRepository get() {
    return newInstance(sessionDaoProvider.get());
  }

  public static SessionRepository_Factory create(Provider<SessionDao> sessionDaoProvider) {
    return new SessionRepository_Factory(sessionDaoProvider);
  }

  public static SessionRepository newInstance(SessionDao sessionDao) {
    return new SessionRepository(sessionDao);
  }
}
