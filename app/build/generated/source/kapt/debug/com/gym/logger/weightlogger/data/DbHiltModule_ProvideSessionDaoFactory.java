// Generated by Dagger (https://dagger.dev).
package com.gym.logger.weightlogger.data;

import com.gym.logger.weightlogger.data.dao.SessionDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DbHiltModule_ProvideSessionDaoFactory implements Factory<SessionDao> {
  private final Provider<AppDB> dbProvider;

  public DbHiltModule_ProvideSessionDaoFactory(Provider<AppDB> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public SessionDao get() {
    return provideSessionDao(dbProvider.get());
  }

  public static DbHiltModule_ProvideSessionDaoFactory create(Provider<AppDB> dbProvider) {
    return new DbHiltModule_ProvideSessionDaoFactory(dbProvider);
  }

  public static SessionDao provideSessionDao(AppDB db) {
    return Preconditions.checkNotNullFromProvides(DbHiltModule.INSTANCE.provideSessionDao(db));
  }
}
