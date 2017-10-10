package tuomomees.androiddatabasechat;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static String url = "87.92.76.173:22";

    // Labels table name
    public static final String DATABASE = "chatDatabase";
    public static final String TABLE = "ChatMessages";

    // Labels Table Columns names
    public static final String KEY_ID = "sender_id";
    public static final String KEY_msgtime = "msg_time";
    public static final String KEY_msg = "msg_string";

    // property help us to keep data
    public int sender_id;
    public String msg_time;
    public String msg_string;

    public int version = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonConnectClicked(View v)
    {
        //DataBaseHandler dataBaseHandler = new DataBaseHandler(this, DATABASE, null ,version );
        SQLiteDatabase db = SQLiteDatabase.openDatabase(url + DATABASE, null, SQLiteDatabase.OPEN_READONLY);
        //db.execSQL();
    }
}
