package com.gym.logger.weightlogger.data.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.gym.logger.weightlogger.data.AppTypeConverters;
import com.gym.logger.weightlogger.data.entity.Set;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SetDao_Impl implements SetDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Set> __insertionAdapterOfSet;

  private final EntityDeletionOrUpdateAdapter<Set> __deletionAdapterOfSet;

  public SetDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSet = new EntityInsertionAdapter<Set>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Set` (`setId`,`setName`,`createdDate`,`timeInMiles`,`exerciseId`,`weight`,`reps`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Set value) {
        stmt.bindLong(1, value.getSetId());
        if (value.getSetName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getSetName());
        }
        final Long _tmp = AppTypeConverters.INSTANCE.dateToTimestamp(value.getCreatedDate());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, _tmp);
        }
        stmt.bindLong(4, value.getTimeInMiles());
        stmt.bindLong(5, value.getExerciseId());
        stmt.bindDouble(6, value.getWeight());
        stmt.bindLong(7, value.getReps());
      }
    };
    this.__deletionAdapterOfSet = new EntityDeletionOrUpdateAdapter<Set>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Set` WHERE `setId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Set value) {
        stmt.bindLong(1, value.getSetId());
      }
    };
  }

  @Override
  public Object insertAll(final Set[] set, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSet.insert(set);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object delete(final Set set, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfSet.handle(set);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Flow<Set> findSetById(final int setId) {
    final String _sql = "SELECT * FROM `Set` WHERE setId == ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, setId);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Set"}, new Callable<Set>() {
      @Override
      public Set call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfSetId = CursorUtil.getColumnIndexOrThrow(_cursor, "setId");
          final int _cursorIndexOfSetName = CursorUtil.getColumnIndexOrThrow(_cursor, "setName");
          final int _cursorIndexOfCreatedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "createdDate");
          final int _cursorIndexOfTimeInMiles = CursorUtil.getColumnIndexOrThrow(_cursor, "timeInMiles");
          final int _cursorIndexOfExerciseId = CursorUtil.getColumnIndexOrThrow(_cursor, "exerciseId");
          final int _cursorIndexOfWeight = CursorUtil.getColumnIndexOrThrow(_cursor, "weight");
          final int _cursorIndexOfReps = CursorUtil.getColumnIndexOrThrow(_cursor, "reps");
          final Set _result;
          if(_cursor.moveToFirst()) {
            final int _tmpSetId;
            _tmpSetId = _cursor.getInt(_cursorIndexOfSetId);
            final String _tmpSetName;
            if (_cursor.isNull(_cursorIndexOfSetName)) {
              _tmpSetName = null;
            } else {
              _tmpSetName = _cursor.getString(_cursorIndexOfSetName);
            }
            final Date _tmpCreatedDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfCreatedDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfCreatedDate);
            }
            _tmpCreatedDate = AppTypeConverters.INSTANCE.fromTimestamp(_tmp);
            final long _tmpTimeInMiles;
            _tmpTimeInMiles = _cursor.getLong(_cursorIndexOfTimeInMiles);
            final int _tmpExerciseId;
            _tmpExerciseId = _cursor.getInt(_cursorIndexOfExerciseId);
            final float _tmpWeight;
            _tmpWeight = _cursor.getFloat(_cursorIndexOfWeight);
            final int _tmpReps;
            _tmpReps = _cursor.getInt(_cursorIndexOfReps);
            _result = new Set(_tmpSetId,_tmpSetName,_tmpCreatedDate,_tmpTimeInMiles,_tmpExerciseId,_tmpWeight,_tmpReps);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Set>> getAllSet() {
    final String _sql = "SELECT * FROM `set`";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"set"}, new Callable<List<Set>>() {
      @Override
      public List<Set> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfSetId = CursorUtil.getColumnIndexOrThrow(_cursor, "setId");
          final int _cursorIndexOfSetName = CursorUtil.getColumnIndexOrThrow(_cursor, "setName");
          final int _cursorIndexOfCreatedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "createdDate");
          final int _cursorIndexOfTimeInMiles = CursorUtil.getColumnIndexOrThrow(_cursor, "timeInMiles");
          final int _cursorIndexOfExerciseId = CursorUtil.getColumnIndexOrThrow(_cursor, "exerciseId");
          final int _cursorIndexOfWeight = CursorUtil.getColumnIndexOrThrow(_cursor, "weight");
          final int _cursorIndexOfReps = CursorUtil.getColumnIndexOrThrow(_cursor, "reps");
          final List<Set> _result = new ArrayList<Set>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Set _item;
            final int _tmpSetId;
            _tmpSetId = _cursor.getInt(_cursorIndexOfSetId);
            final String _tmpSetName;
            if (_cursor.isNull(_cursorIndexOfSetName)) {
              _tmpSetName = null;
            } else {
              _tmpSetName = _cursor.getString(_cursorIndexOfSetName);
            }
            final Date _tmpCreatedDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfCreatedDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfCreatedDate);
            }
            _tmpCreatedDate = AppTypeConverters.INSTANCE.fromTimestamp(_tmp);
            final long _tmpTimeInMiles;
            _tmpTimeInMiles = _cursor.getLong(_cursorIndexOfTimeInMiles);
            final int _tmpExerciseId;
            _tmpExerciseId = _cursor.getInt(_cursorIndexOfExerciseId);
            final float _tmpWeight;
            _tmpWeight = _cursor.getFloat(_cursorIndexOfWeight);
            final int _tmpReps;
            _tmpReps = _cursor.getInt(_cursorIndexOfReps);
            _item = new Set(_tmpSetId,_tmpSetName,_tmpCreatedDate,_tmpTimeInMiles,_tmpExerciseId,_tmpWeight,_tmpReps);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
