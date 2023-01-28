// Generated by Dagger (https://dagger.dev).
package com.gym.logger.weightlogger;

import com.gym.logger.weightlogger.data.dao.ExerciseDao;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<ExerciseDao> exerciseDaoProvider;

  public MainActivity_MembersInjector(Provider<ExerciseDao> exerciseDaoProvider) {
    this.exerciseDaoProvider = exerciseDaoProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<ExerciseDao> exerciseDaoProvider) {
    return new MainActivity_MembersInjector(exerciseDaoProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectExerciseDao(instance, exerciseDaoProvider.get());
  }

  @InjectedFieldSignature("com.gym.logger.weightlogger.MainActivity.exerciseDao")
  public static void injectExerciseDao(MainActivity instance, ExerciseDao exerciseDao) {
    instance.exerciseDao = exerciseDao;
  }
}
