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
import com.gym.logger.weightlogger.data.entity.Exercise;
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
public final class ExerciseDao_Impl implements ExerciseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Exercise> __insertionAdapterOfExercise;

  private final EntityDeletionOrUpdateAdapter<Exercise> __deletionAdapterOfExercise;

  public ExerciseDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfExercise = new EntityInsertionAdapter<Exercise>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Exercise` (`exerciseId`,`exerciseName`,`date`,`sessionId`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Exercise value) {
        stmt.bindLong(1, value.getExerciseId());
        if (value.getExerciseName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getExerciseName());
        }
        final Long _tmp = AppTypeConverters.INSTANCE.dateToTimestamp(value.getDate());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, _tmp);
        }
        stmt.bindLong(4, value.getSessionId());
      }
    };
    this.__deletionAdapterOfExercise = new EntityDeletionOrUpdateAdapter<Exercise>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Exercise` WHERE `exerciseId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Exercise value) {
        stmt.bindLong(1, value.getExerciseId());
      }
    };
  }

  @Override
  public Object insertAll(final Exercise[] exercise, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfExercise.insert(exercise);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object delete(final Exercise exercise, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfExercise.handle(exercise);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Flow<Exercise> findExerciseById(final int exerciseId) {
    final String _sql = "SELECT * FROM Exercise WHERE exerciseId == ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, exerciseId);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Exercise"}, new Callable<Exercise>() {
      @Override
      public Exercise call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfExerciseId = CursorUtil.getColumnIndexOrThrow(_cursor, "exerciseId");
          final int _cursorIndexOfExerciseName = CursorUtil.getColumnIndexOrThrow(_cursor, "exerciseName");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfSessionId = CursorUtil.getColumnIndexOrThrow(_cursor, "sessionId");
          final Exercise _result;
          if(_cursor.moveToFirst()) {
            final int _tmpExerciseId;
            _tmpExerciseId = _cursor.getInt(_cursorIndexOfExerciseId);
            final String _tmpExerciseName;
            if (_cursor.isNull(_cursorIndexOfExerciseName)) {
              _tmpExerciseName = null;
            } else {
              _tmpExerciseName = _cursor.getString(_cursorIndexOfExerciseName);
            }
            final Date _tmpDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = AppTypeConverters.INSTANCE.fromTimestamp(_tmp);
            final int _tmpSessionId;
            _tmpSessionId = _cursor.getInt(_cursorIndexOfSessionId);
            _result = new Exercise(_tmpExerciseId,_tmpExerciseName,_tmpDate,_tmpSessionId);
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
  public Flow<List<Exercise>> getAllExercises() {
    final String _sql = "SELECT * FROM Exercise";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Exercise"}, new Callable<List<Exercise>>() {
      @Override
      public List<Exercise> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfExerciseId = CursorUtil.getColumnIndexOrThrow(_cursor, "exerciseId");
          final int _cursorIndexOfExerciseName = CursorUtil.getColumnIndexOrThrow(_cursor, "exerciseName");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfSessionId = CursorUtil.getColumnIndexOrThrow(_cursor, "sessionId");
          final List<Exercise> _result = new ArrayList<Exercise>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Exercise _item;
            final int _tmpExerciseId;
            _tmpExerciseId = _cursor.getInt(_cursorIndexOfExerciseId);
            final String _tmpExerciseName;
            if (_cursor.isNull(_cursorIndexOfExerciseName)) {
              _tmpExerciseName = null;
            } else {
              _tmpExerciseName = _cursor.getString(_cursorIndexOfExerciseName);
            }
            final Date _tmpDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = AppTypeConverters.INSTANCE.fromTimestamp(_tmp);
            final int _tmpSessionId;
            _tmpSessionId = _cursor.getInt(_cursorIndexOfSessionId);
            _item = new Exercise(_tmpExerciseId,_tmpExerciseName,_tmpDate,_tmpSessionId);
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
