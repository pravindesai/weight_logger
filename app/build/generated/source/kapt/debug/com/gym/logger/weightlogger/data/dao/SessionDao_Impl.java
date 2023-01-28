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
import com.gym.logger.weightlogger.data.entity.Session;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
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
public final class SessionDao_Impl implements SessionDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Session> __insertionAdapterOfSession;

  private final EntityDeletionOrUpdateAdapter<Session> __deletionAdapterOfSession;

  public SessionDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSession = new EntityInsertionAdapter<Session>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Session` (`sessionId`,`sessionName`,`dateCreated`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Session value) {
        if (value.getSessionId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getSessionId());
        }
        if (value.getSessionName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getSessionName());
        }
        final Long _tmp = AppTypeConverters.INSTANCE.dateToTimestamp(value.getDateCreated());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, _tmp);
        }
      }
    };
    this.__deletionAdapterOfSession = new EntityDeletionOrUpdateAdapter<Session>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Session` WHERE `sessionId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Session value) {
        if (value.getSessionId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getSessionId());
        }
      }
    };
  }

  @Override
  public Object insertAll(final Session[] session, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSession.insert(session);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final Session session, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfSession.handle(session);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<Session> findSessionById(final int sessionId) {
    final String _sql = "SELECT * FROM Session WHERE sessionId == ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, sessionId);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Session"}, new Callable<Session>() {
      @Override
      public Session call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfSessionId = CursorUtil.getColumnIndexOrThrow(_cursor, "sessionId");
          final int _cursorIndexOfSessionName = CursorUtil.getColumnIndexOrThrow(_cursor, "sessionName");
          final int _cursorIndexOfDateCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateCreated");
          final Session _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmpSessionId;
            if (_cursor.isNull(_cursorIndexOfSessionId)) {
              _tmpSessionId = null;
            } else {
              _tmpSessionId = _cursor.getInt(_cursorIndexOfSessionId);
            }
            final String _tmpSessionName;
            if (_cursor.isNull(_cursorIndexOfSessionName)) {
              _tmpSessionName = null;
            } else {
              _tmpSessionName = _cursor.getString(_cursorIndexOfSessionName);
            }
            final Date _tmpDateCreated;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDateCreated)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDateCreated);
            }
            _tmpDateCreated = AppTypeConverters.INSTANCE.fromTimestamp(_tmp);
            _result = new Session(_tmpSessionId,_tmpSessionName,_tmpDateCreated);
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
  public Flow<List<Session>> getAllSession() {
    final String _sql = "SELECT * FROM Session";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Session"}, new Callable<List<Session>>() {
      @Override
      public List<Session> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfSessionId = CursorUtil.getColumnIndexOrThrow(_cursor, "sessionId");
          final int _cursorIndexOfSessionName = CursorUtil.getColumnIndexOrThrow(_cursor, "sessionName");
          final int _cursorIndexOfDateCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateCreated");
          final List<Session> _result = new ArrayList<Session>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Session _item;
            final Integer _tmpSessionId;
            if (_cursor.isNull(_cursorIndexOfSessionId)) {
              _tmpSessionId = null;
            } else {
              _tmpSessionId = _cursor.getInt(_cursorIndexOfSessionId);
            }
            final String _tmpSessionName;
            if (_cursor.isNull(_cursorIndexOfSessionName)) {
              _tmpSessionName = null;
            } else {
              _tmpSessionName = _cursor.getString(_cursorIndexOfSessionName);
            }
            final Date _tmpDateCreated;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDateCreated)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDateCreated);
            }
            _tmpDateCreated = AppTypeConverters.INSTANCE.fromTimestamp(_tmp);
            _item = new Session(_tmpSessionId,_tmpSessionName,_tmpDateCreated);
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
