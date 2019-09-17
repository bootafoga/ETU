package com.example.etu;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class LessonsOfTheDaySQLiteHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "LESSONS"; // Имя базы данных
    private static final int DB_VERSION = 1; // Версия базы данных

    LessonsOfTheDaySQLiteHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE LESSONS (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "LESSONNAME TEXT, "
                + "CLASSROOM TEXT,"
                + "TEACHER TEXT,"
                + "TIME TEXT,"
                + "TYPE INTEGER,"
                + "FLAG TEXT); "
        );

        thisTerm(sqLiteDatabase);
    }

    private void thisTerm(SQLiteDatabase sqLiteDatabase) {

        //////////////////////////////MONDAY///////////////////////////

        ContentValues monday1_first = new ContentValues();
        monday1_first.put("LESSONNAME", "ОУПр");
        monday1_first.put("CLASSROOM", "3324");
        monday1_first.put("TEACHER", "Карпов Константин Анатольевич");
        monday1_first.put("TIME", "9.50 - 11.20");
        monday1_first.put("FLAG", "monday_first");
        monday1_first.put("TYPE", 0);
        sqLiteDatabase.insert("LESSONS", null, monday1_first);

        ContentValues monday1_second = new ContentValues();
        monday1_second.put("LESSONNAME", "ОУПр");
        monday1_second.put("CLASSROOM", "3324");
        monday1_second.put("TEACHER", "Карпов Константин Анатольевич");
        monday1_second.put("TIME", "9.50 - 11.20");
        monday1_second.put("FLAG", "monday_second");
        monday1_second.put("TYPE", 0);
        sqLiteDatabase.insert("LESSONS", null, monday1_second);

        /////////////////////////////////////////////////////////

        ContentValues monday2_first = new ContentValues();
        monday2_first.put("LESSONNAME", "Операционные системы");
        monday2_first.put("CLASSROOM", "1245");
        monday2_first.put("TEACHER", "Горячев Александр Вадимович");
        monday2_first.put("TIME", "11.40 - 13.15");
        monday2_first.put("FLAG", "monday_first");
        monday2_first.put("TYPE", 0);
        sqLiteDatabase.insert("LESSONS", null, monday2_first);

        ContentValues monday2_second = new ContentValues();
        monday2_second.put("LESSONNAME", "Операционные системы");
        monday2_second.put("CLASSROOM", "1245");
        monday2_second.put("TEACHER", "Горячев Александр Вадимович");
        monday2_second.put("TIME", "11.40 - 13.15");
        monday2_second.put("FLAG", "monday_second");
        monday2_second.put("TYPE", 0);
        sqLiteDatabase.insert("LESSONS", null, monday2_second);

        ////////////////////////////////////////////////////////
        ContentValues monday3_first = new ContentValues();
        monday3_first.put("LESSONNAME", "Методы оптимизации");
        monday3_first.put("CLASSROOM", "1156");
        monday3_first.put("TEACHER", "Каримов Артур Искандарович");
        monday3_first.put("TIME", "13.45 - 15.15");
        monday3_first.put("FLAG", "monday_first");
        monday3_first.put("TYPE", 1);
        sqLiteDatabase.insert("LESSONS", null, monday3_first);

        ContentValues monday3_second = new ContentValues();
        monday3_second.put("LESSONNAME", "Методы оптимизации");
        monday3_second.put("CLASSROOM", "1156");
        monday3_second.put("TEACHER", "Каримов Артур Искандарович");
        monday3_second.put("TIME", "13.45 - 15.15");
        monday3_second.put("FLAG", "monday_second");
        monday3_second.put("TYPE", 1);
        sqLiteDatabase.insert("LESSONS", null, monday3_second);

        //////////////////////////////////////////

        ContentValues monday4_first = new ContentValues();
        monday4_first.put("LESSONNAME", "Базы данных");
        monday4_first.put("CLASSROOM", "1155");
        monday4_first.put("TEACHER", "Каримов Тимур Искандарович");
        monday4_first.put("TIME", "15.35 - 17.05");
        monday4_first.put("FLAG", "monday_first");
        monday4_first.put("TYPE", 1);
        sqLiteDatabase.insert("LESSONS", null, monday4_first);

        ContentValues monday4_second = new ContentValues();
        monday4_second.put("LESSONNAME", "Базы данных");
        monday4_second.put("CLASSROOM", "1155");
        monday4_second.put("TEACHER", "Каримов Тимур Искандарович");
        monday4_second.put("TIME", "15.35 - 17.05");
        monday4_second.put("FLAG", "monday_second");
        monday4_second.put("TYPE", 1);
        sqLiteDatabase.insert("LESSONS", null, monday4_second);

        ////////////////////////////////////////////

        ContentValues tuesday_first = new ContentValues();
        tuesday_first.put("LESSONNAME", "ВОЕНКА");
        tuesday_first.put("CLASSROOM", "3к");
        tuesday_first.put("FLAG", "tuesday_first");
        tuesday_first.put("TYPE", 1);
        sqLiteDatabase.insert("LESSONS", null, tuesday_first);

        ContentValues tuesday_second = new ContentValues();
        tuesday_second.put("LESSONNAME", "ВОЕНКА");
        tuesday_second.put("CLASSROOM", "3к");
        tuesday_second.put("FLAG", "tuesday_second");
        tuesday_second.put("TYPE", 1);
        sqLiteDatabase.insert("LESSONS", null, tuesday_second);


        ////////////////////////////////////////// wed

        ContentValues wednesday1_first = new ContentValues();
        wednesday1_first.put("LESSONNAME", "Операционные системы");
        wednesday1_first.put("CLASSROOM", "1155");
        wednesday1_first.put("TEACHER", "Горячев Александр Вадимович");
        wednesday1_first.put("TIME", "11.40 - 13.15");
        wednesday1_first.put("FLAG", "wednesday_first");
        wednesday1_first.put("TYPE", 1);
        sqLiteDatabase.insert("LESSONS", null, wednesday1_first);

        ContentValues wednesday1_second = new ContentValues();
        wednesday1_second.put("LESSONNAME", "Метрология");
        wednesday1_second.put("CLASSROOM", "1118");
        wednesday1_second.put("TEACHER", "Минчев Никадим Викторович");
        wednesday1_second.put("TIME", "11.40 - 13.15");
        wednesday1_second.put("FLAG", "wednesday_second");
        wednesday1_second.put("TYPE", 2);
        sqLiteDatabase.insert("LESSONS", null, wednesday1_second);

        /////////////

        ContentValues wednesday2_first = new ContentValues();
        wednesday2_first.put("LESSONNAME", "ОУПр");
        wednesday2_first.put("CLASSROOM", "1101");
        wednesday2_first.put("TEACHER", "Карпов Константин Анатольевич");
        wednesday2_first.put("TIME", "13.45 - 15.15");
        wednesday2_first.put("FLAG", "wednesday_first");
        wednesday2_first.put("TYPE", 2);
        sqLiteDatabase.insert("LESSONS", null, wednesday2_first);

        ContentValues wednesday2_second = new ContentValues();
        wednesday2_second.put("LESSONNAME", "Операционные системы");
        wednesday2_second.put("CLASSROOM", "1155");
        wednesday2_second.put("TEACHER", "Горячев Александр Вадимович");
        wednesday2_second.put("TIME", "13.45 - 15.15");
        wednesday2_second.put("FLAG", "wednesday_second");
        wednesday2_second.put("TYPE", 3);
        sqLiteDatabase.insert("LESSONS", null, wednesday2_second);

        //////////////////////////////////////////////////////


        ContentValues wednesday3_first = new ContentValues();
        wednesday3_first.put("LESSONNAME", "ООП");
        wednesday3_first.put("CLASSROOM", "1245");
        wednesday3_first.put("TEACHER", "Новакова Наталия Евгеньевна");
        wednesday3_first.put("TIME", "15.35 - 17.05");
        wednesday3_first.put("FLAG", "wednesday_first");
        wednesday3_first.put("TYPE", 0);
        sqLiteDatabase.insert("LESSONS", null, wednesday3_first);

        ContentValues wednesday3_second = new ContentValues();
        wednesday3_second.put("LESSONNAME", "ООП");
        wednesday3_second.put("CLASSROOM", "1245");
        wednesday3_second.put("TEACHER", "Новакова Наталия Евгеньевна");
        wednesday3_second.put("TIME", "15.35 - 17.05");
        wednesday3_second.put("FLAG", "wednesday_second");
        wednesday3_second.put("TYPE", 0);
        sqLiteDatabase.insert("LESSONS", null, wednesday3_second);

        //////////////////////



        ContentValues wednesday4_first = new ContentValues();
        wednesday4_first.put("LESSONNAME", "ООП");
        wednesday4_first.put("CLASSROOM", "1146");
        wednesday4_first.put("TEACHER", "Новакова Наталия Евгеньевна");
        wednesday4_first.put("TIME", "17.25 - 18.55");
        wednesday4_first.put("FLAG", "wednesday_first");
        wednesday4_first.put("TYPE", 3);
        sqLiteDatabase.insert("LESSONS", null, wednesday4_first);

        ContentValues wednesday4_second = new ContentValues();
        wednesday4_second.put("LESSONNAME", "ООП");
        wednesday4_second.put("CLASSROOM", "1146");
        wednesday4_second.put("TEACHER", "Новакова Наталия Евгеньевна");
        wednesday4_second.put("TIME", "17.25 - 18.55");
        wednesday4_second.put("TYPE", 2);
        sqLiteDatabase.insert("LESSONS", null, wednesday4_second);



        //////////////////


        ContentValues thursday1_first = new ContentValues();
        thursday1_first.put("LESSONNAME", "Английский");
        thursday1_first.put("CLASSROOM", "3328");
        thursday1_first.put("TEACHER", "Моина Наталья Владимировна");
        thursday1_first.put("TIME", "9.50 - 11.20");
        thursday1_first.put("TYPE", 1);
        sqLiteDatabase.insert("LESSONS", null, thursday1_first);

        ContentValues thursday1_second = new ContentValues();
        thursday1_second.put("LESSONNAME", "Английский");
        thursday1_second.put("CLASSROOM", "3328");
        thursday1_second.put("TEACHER", "Моина Наталья Владимировна");
        thursday1_second.put("TIME", "9.50 - 11.20");
        thursday1_second.put("TYPE", 1);
        sqLiteDatabase.insert("LESSONS", null, thursday1_second);



        /////////////////

        //////////////////


        ContentValues thursday2_first = new ContentValues();
        thursday2_first.put("LESSONNAME", "Схемотехника");
        thursday2_first.put("CLASSROOM", "1154");
        thursday2_first.put("TEACHER", "Соколов Юрий Михайлович");
        thursday2_first.put("TIME", "11.40 - 13.15");
        thursday2_first.put("FLAG", "thursday_first");
        thursday2_first.put("TYPE", 3);
        sqLiteDatabase.insert("LESSONS", null, thursday2_first);

        ContentValues thursday2_second = new ContentValues();
        thursday2_second.put("LESSONNAME", "Схемотехника");
        thursday2_second.put("CLASSROOM", "1154");
        thursday2_second.put("TEACHER", "Михалков Владимир Алексеевич");
        thursday2_second.put("TIME", "11.40 - 13.15");
        thursday2_second.put("FLAG", "thursday_second");
        thursday2_second.put("TYPE", 2);
        sqLiteDatabase.insert("LESSONS", null, thursday2_second);



        /////////////////

        //////////////////


        ContentValues thursday3_first = new ContentValues();
        thursday3_first.put("LESSONNAME", "Базы данных");
        thursday3_first.put("CLASSROOM", "1245");
        thursday3_first.put("TEACHER", "Новакова Наталия Евгеньевна");
        thursday3_first.put("TIME", "13.45 - 15.15");
        thursday3_first.put("FLAG", "thursday_first");
        thursday3_first.put("TYPE", 0);
        sqLiteDatabase.insert("LESSONS", null, thursday1_first);

        ContentValues thursday3_second = new ContentValues();
        thursday3_second.put("LESSONNAME", "Базы данных");
        thursday3_second.put("CLASSROOM", "1245");
        thursday3_second.put("TEACHER", "Новакова Наталия Евгеньевна");
        thursday3_second.put("TIME", "13.45 - 15.15");
        thursday3_second.put("FLAG", "thursday_second");
        thursday3_second.put("TYPE", 0);
        sqLiteDatabase.insert("LESSONS", null, thursday3_second);



        /////////////////

        //////////////////


        ContentValues thursday4_first = new ContentValues();
        thursday4_first.put("LESSONNAME", "Метрология");
        thursday4_first.put("CLASSROOM", "1158");
        thursday4_first.put("TEACHER", "Антонюк Петр Евгеньевич");
        thursday4_first.put("TIME", "15.35 - 17.05");
        thursday4_first.put("FLAG", "thursday_first");
        thursday4_first.put("TYPE", 0);
        sqLiteDatabase.insert("LESSONS", null, thursday4_first);

        ContentValues thursday4_second = new ContentValues();
        thursday4_second.put("LESSONNAME", "Метрология");
        thursday4_second.put("CLASSROOM", "1158");
        thursday4_second.put("TEACHER", "Антонюк Петр Евгеньевич");
        thursday4_second.put("TIME", "15.35 - 17.05");
        thursday4_second.put("FLAG", "thursday_second");
        thursday4_second.put("TYPE", 0);
        sqLiteDatabase.insert("LESSONS", null, thursday4_second);



        /////////////////

        //////////////////


       /* ContentValues friday1_first = new ContentValues();
        friday1_first.put("LESSONNAME", "Метрология, лекция");
        friday1_first.put("CLASSROOM", "1158");
        friday1_first.put("TEACHER", "");
        friday1_first.put("TIME", "15.35 - 17.05");
        friday1_first.put("FLAG", "thursday_first");
        sqLiteDatabase.insert("LESSONS", null, friday1_first);*/

        ContentValues friday1_second = new ContentValues();
        friday1_second.put("LESSONNAME", "Схемотехника");
        friday1_second.put("CLASSROOM", "1244");
        friday1_second.put("TEACHER", "Соколов Юрий Михайлович");
        friday1_second.put("TIME", "9.50 - 11.20");
        friday1_second.put("FLAG", "friday_second");
        friday1_second.put("TYPE", 0);
        sqLiteDatabase.insert("LESSONS", null, friday1_second);



        /////////////////

        //////////////////


        ContentValues friday2_first = new ContentValues();
        friday2_first.put("LESSONNAME", "Схемотехника");
        friday2_first.put("CLASSROOM", "1244");
        friday2_first.put("TEACHER", "Соколов Юрий Михайлович");
        friday2_first.put("TIME", "11.40 - 13.15");
        friday2_first.put("FLAG", "friday_first");
        friday2_first.put("TYPE", 0);
        sqLiteDatabase.insert("LESSONS", null, friday2_first);

        ContentValues friday2_second = new ContentValues();
        friday2_second.put("LESSONNAME", "Схемотехника");
        friday2_second.put("CLASSROOM", "1244");
        friday2_second.put("TEACHER", "Соколов Юрий Михайлович");
        friday2_second.put("TIME", "11.40 - 13.15");
        friday2_second.put("FLAG", "friday_second");
        friday2_second.put("TYPE", 0);
        sqLiteDatabase.insert("LESSONS", null, friday2_second);



        /////////////////

        //////////////////


        ContentValues friday3_first = new ContentValues();
        friday3_first.put("LESSONNAME", "Методы оптимизации");
        friday3_first.put("CLASSROOM", "1245");
        friday3_first.put("TEACHER", "Каримов Артур Искандарович");
        friday3_first.put("TIME", "13.45 - 15.15");
        friday3_first.put("FLAG", "friday_first");
        friday3_first.put("TYPE", 0);
        sqLiteDatabase.insert("LESSONS", null, friday3_first);

        ContentValues friday3_second = new ContentValues();
        friday3_second.put("LESSONNAME", "Методы оптимизации");
        friday3_second.put("CLASSROOM", "1245");
        friday3_second.put("TEACHER", "Каримов Артур Искандарович");
        friday3_second.put("TIME", "13.45 - 15.15");
        friday3_second.put("FLAG", "friday_second");
        friday3_second.put("TYPE", 0);
        sqLiteDatabase.insert("LESSONS", null, friday3_second);



        /////////////////
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }

}
