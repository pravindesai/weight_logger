package com.gym.logger.weightlogger.data;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.gym.logger.weightlogger.data.dao.ExerciseDao;
import com.gym.logger.weightlogger.data.dao.ExerciseDao_Impl;
import com.gym.logger.weightlogger.data.dao.SessionDao;
import com.gym.logger.weightlogger.data.dao.SessionDao_Impl;
import com.gym.logger.weightlogger.data.dao.SetDao;
import com.gym.logger.weightlogger.data.dao.SetDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDB_Impl extends AppDB {
  private volatile ExerciseDao _exerciseDao;

  private volatile SessionDao _sessionDao;

  private volatile SetDao _setDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Session` (`sessionId` INTEGER PRIMARY KEY AUTOINCREMENT, `sessionName` TEXT, `dateCreated` INTEGER)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Exercise` (`exerciseId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `exerciseName` TEXT NOT NULL, `date` INTEGER NOT NULL, `sessionId` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Set` (`setId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `setName` TEXT NOT NULL, `createdDate` INTEGER NOT NULL, `timeInMiles` INTEGER NOT NULL, `exerciseId` INTEGER NOT NULL, `weight` REAL NOT NULL, `reps` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6c99dac461423d26ac19bad743391cc8')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Session`");
        _db.execSQL("DROP TABLE IF EXISTS `Exercise`");
        _db.execSQL("DROP TABLE IF EXISTS `Set`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsSession = new HashMap<String, TableInfo.Column>(3);
        _columnsSession.put("sessionId", new TableInfo.Column("sessionId", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSession.put("sessionName", new TableInfo.Column("sessionName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSession.put("dateCreated", new TableInfo.Column("dateCreated", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSession = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSession = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSession = new TableInfo("Session", _columnsSession, _foreignKeysSession, _indicesSession);
        final TableInfo _existingSession = TableInfo.read(_db, "Session");
        if (! _infoSession.equals(_existingSession)) {
          return new RoomOpenHelper.ValidationResult(false, "Session(com.gym.logger.weightlogger.data.entity.Session).\n"
                  + " Expected:\n" + _infoSession + "\n"
                  + " Found:\n" + _existingSession);
        }
        final HashMap<String, TableInfo.Column> _columnsExercise = new HashMap<String, TableInfo.Column>(4);
        _columnsExercise.put("exerciseId", new TableInfo.Column("exerciseId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExercise.put("exerciseName", new TableInfo.Column("exerciseName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExercise.put("date", new TableInfo.Column("date", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsExercise.put("sessionId", new TableInfo.Column("sessionId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysExercise = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesExercise = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoExercise = new TableInfo("Exercise", _columnsExercise, _foreignKeysExercise, _indicesExercise);
        final TableInfo _existingExercise = TableInfo.read(_db, "Exercise");
        if (! _infoExercise.equals(_existingExercise)) {
          return new RoomOpenHelper.ValidationResult(false, "Exercise(com.gym.logger.weightlogger.data.entity.Exercise).\n"
                  + " Expected:\n" + _infoExercise + "\n"
                  + " Found:\n" + _existingExercise);
        }
        final HashMap<String, TableInfo.Column> _columnsSet = new HashMap<String, TableInfo.Column>(7);
        _columnsSet.put("setId", new TableInfo.Column("setId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSet.put("setName", new TableInfo.Column("setName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSet.put("createdDate", new TableInfo.Column("createdDate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSet.put("timeInMiles", new TableInfo.Column("timeInMiles", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSet.put("exerciseId", new TableInfo.Column("exerciseId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSet.put("weight", new TableInfo.Column("weight", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSet.put("reps", new TableInfo.Column("reps", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSet = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSet = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSet = new TableInfo("Set", _columnsSet, _foreignKeysSet, _indicesSet);
        final TableInfo _existingSet = TableInfo.read(_db, "Set");
        if (! _infoSet.equals(_existingSet)) {
          return new RoomOpenHelper.ValidationResult(false, "Set(com.gym.logger.weightlogger.data.entity.Set).\n"
                  + " Expected:\n" + _infoSet + "\n"
                  + " Found:\n" + _existingSet);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "6c99dac461423d26ac19bad743391cc8", "e9dccee13ca05bf1c1f1b4c3a4c6eeb5");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Session","Exercise","Set");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Session`");
      _db.execSQL("DELETE FROM `Exercise`");
      _db.execSQL("DELETE FROM `Set`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(ExerciseDao.class, ExerciseDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(SessionDao.class, SessionDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(SetDao.class, SetDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public ExerciseDao exerciseDao() {
    if (_exerciseDao != null) {
      return _exerciseDao;
    } else {
      synchronized(this) {
        if(_exerciseDao == null) {
          _exerciseDao = new ExerciseDao_Impl(this);
        }
        return _exerciseDao;
      }
    }
  }

  @Override
  public SessionDao sessionDao() {
    if (_sessionDao != null) {
      return _sessionDao;
    } else {
      synchronized(this) {
        if(_sessionDao == null) {
          _sessionDao = new SessionDao_Impl(this);
        }
        return _sessionDao;
      }
    }
  }

  @Override
  public SetDao setDao() {
    if (_setDao != null) {
      return _setDao;
    } else {
      synchronized(this) {
        if(_setDao == null) {
          _setDao = new SetDao_Impl(this);
        }
        return _setDao;
      }
    }
  }
}
