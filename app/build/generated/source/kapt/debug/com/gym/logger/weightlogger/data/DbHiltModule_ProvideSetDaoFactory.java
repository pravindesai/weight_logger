// Generated by Dagger (https://dagger.dev).
package com.gym.logger.weightlogger.data;

import com.gym.logger.weightlogger.data.dao.SetDao;
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
public final class DbHiltModule_ProvideSetDaoFactory implements Factory<SetDao> {
  private final Provider<AppDB> dbProvider;

  public DbHiltModule_ProvideSetDaoFactory(Provider<AppDB> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public SetDao get() {
    return provideSetDao(dbProvider.get());
  }

  public static DbHiltModule_ProvideSetDaoFactory create(Provider<AppDB> dbProvider) {
    return new DbHiltModule_ProvideSetDaoFactory(dbProvider);
  }

  public static SetDao provideSetDao(AppDB db) {
    return Preconditions.checkNotNullFromProvides(DbHiltModule.INSTANCE.provideSetDao(db));
  }
}