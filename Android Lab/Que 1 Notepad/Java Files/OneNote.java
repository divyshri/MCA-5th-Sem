package com.notepad;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
public class OneNote extends Activity {
	private static final String TAG = "notepad";
	private TextView noteTitle;
	private TextView createdAt;
	private TextView noteContent;
	private DBHelper dbhelper;
	private SQLiteDatabase db;
	private String title = "defaultTitle";
	private int id = 0;
	private String content = "defaultContent";
	private String date = "date";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.onenote);
		dbhelper = new DBHelper(getApplicationContext());
		noteTitle = (TextView) findViewById(R.id.noteTitle);
		noteContent = (TextView) findViewById(R.id.noteContent);
		createdAt = (TextView) findViewById(R.id.createdAt);
		Intent mIntent = getIntent();
		id = mIntent.getIntExtra("id", 0);
		db = dbhelper.getReadableDatabase();
		Cursor c = dbhelper.getNote(db, id);
		db.close();
		title = c.getString(0).toString();
		content = c.getString(1).toString();
		date = c.getString(2).toString();
		noteTitle.setText(title);
		noteContent.setText(content);
		createdAt.setText(date);
	}
}
