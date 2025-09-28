package lk.javainstitute.appnotebook.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLiteHelper extends SQLiteOpenHelper {
    public SQLiteHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE note (\n" +
                "    id           INTEGER PRIMARY KEY AUTOINCREMENT\n" +
                "                         NOT NULL,\n" +
                "    title        TEXT    NOT NULL,\n" +
                "    content      TEXT    NOT NULL,\n" +
                "    date_created TEXT    NOT NULL\n" +
                ");\n");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
