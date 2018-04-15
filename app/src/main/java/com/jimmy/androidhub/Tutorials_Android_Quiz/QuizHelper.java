package com.jimmy.androidhub.Tutorials_Android_Quiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jaimin_Patel on 2/21/2018.
 */

public class QuizHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "mathsone";
    // tasks table name
    private static final String TABLE_QUEST = "quest";
    // tasks Table Columns names
    private static final String KEY_ID = "qid";
    private static final String KEY_QUES = "question";
    private static final String KEY_ANSWER = "answer"; // correct option
    private static final String KEY_OPTA = "opta"; // option a
    private static final String KEY_OPTB = "optb"; // option b
    private static final String KEY_OPTC = "optc"; // option c
    private SQLiteDatabase dbase;
    public QuizHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase = db;
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER + " TEXT, " + KEY_OPTA + " TEXT, "
                + KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT)";
        db.execSQL(sql);
        addQuestion();
// db.close();
    }
    private void addQuestion() {
        Question q1 = new Question("What is ADB in Android?", "Android Debug Bridge", "Android Developer Base", "Android Development Base", "Android Debug Bridge");
        this.addQuestion(q1);
        Question q2 = new Question("How to Kill an Activity in Android?", "kill()", "finish()", "stop()", "finish()");
        this.addQuestion(q2);
        Question q3 = new Question("On which thread services work in Android?", "Main Thread", "Own Thread", "Worker Thread", "Main Thread");
        this.addQuestion(q3);
        Question q4 = new Question("What is Log Message in Android?", "Same as printf()", "Debug a program", "same as Toast()", "Debug a program");
        this.addQuestion(q4);
        Question q5 = new Question("How to pass the data between activities in Android?", "Intent", "Content Provider", "Broadcast Receiver", "Intent");
        this.addQuestion(q5);
        Question q6 = new Question("set the gravity of the contentof the view its used on", "android:layout_gravity", "android:weight", "android:gravity", "android:gravity");
        this.addQuestion(q6);
        Question q7 = new Question("Who is designed android logo?", "AndyRubin", "LarryPage", "IrinaBlock", "IrinaBlock");
        this.addQuestion(q7);
        Question q8 = new Question("What is GCM in Android?", "Google Messgae Pack", "Google Cloud Messgeing", "Geo Cloud Pack", "Google Cloud Messgeing");
        this.addQuestion(q8);
        Question q9 = new Question("?", "6", "7", "5", "6");
        this.addQuestion(q9);
//        Question q10 = new Question("7-5 = ?", "3", "2", "6", "2");
//        this.addQuestion(q10);
//        Question q11 = new Question("7-2 = ?", "7", "6", "5", "5");
//        this.addQuestion(q11);
//        Question q12 = new Question("3+5 = ?", "8", "7", "5", "8");
//        this.addQuestion(q12);
//        Question q13 = new Question("0+6 = ?", "7", "6", "5", "6");
//        this.addQuestion(q13);
//        Question q14 = new Question("12-10 = ?", "1", "2", "3", "2");
//        this.addQuestion(q14);
//        Question q15 = new Question("12+2 = ?", "14", "15", "16", "14");
//        this.addQuestion(q15);
//        Question q16 = new Question("2-1 = ?", "2", "1", "0", "1");
//        this.addQuestion(q16);
//        Question q17 = new Question("6-6 = ?", "6", "12", "0", "0");
//        this.addQuestion(q17);
//        Question q18 = new Question("5-1 = ?", "4", "3", "2", "4");
//        this.addQuestion(q18);
//        Question q19 = new Question("4+2 = ?", "6", "7", "5", "6");
//        this.addQuestion(q19);
//        Question q20 = new Question("5+1 = ?", "6", "7", "5", "6");
//        this.addQuestion(q20);

// END
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
// Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
// Create tables again
        onCreate(db);
    }
    // Adding new question
    public void addQuestion(Question quest) {
// SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
// Inserting Row
        dbase.insert(TABLE_QUEST, null, values);
    }
    public List<Question> getAllQuestions() {
        List<Question> quesList = new ArrayList<Question>();
// Select All Query
        String selectQuery = "SELECT * FROM " + TABLE_QUEST;
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
// looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPTA(cursor.getString(3));
                quest.setOPTB(cursor.getString(4));
                quest.setOPTC(cursor.getString(5));
                quesList.add(quest);
            } while (cursor.moveToNext());
        }
// return quest list
        return quesList;
    }
}