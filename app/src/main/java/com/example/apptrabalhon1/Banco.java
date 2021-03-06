package com.example.apptrabalhon1;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Banco extends SQLiteOpenHelper {

    private static final int VERSAO = 3;
    private static final String NOME = "AppFilmes";

    public Banco(Context context){
        super(context, NOME, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS filme ( " +
                "     id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT ," +
                "     nome TEXT NOT NULL ," +
                "     categoria TEXT NOT NULL ," +
                "     ano INTEGER  ) "  );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }
}
