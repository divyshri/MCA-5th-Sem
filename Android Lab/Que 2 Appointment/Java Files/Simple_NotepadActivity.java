package com.appointment;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class Forms extends Activity {

	private Context context = this;
	
	private EditText nameText;
	private EditText email;
	
	private EditText addrText;
	private EditText phoneText;
	private EditText DoctorName;
	private EditText DoctorSpeciality;
	private EditText DetailsDisease;
	
	private Button submitButton;
	
	private Passer mPasser = new Passer();
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);
       
          nameText = (EditText)findViewById(R.id.nameText);
		  email	= (EditText)findViewById(R.id.nameText);
		  addrText = (EditText)findViewById(R.id.nameText);
		  phoneText = (EditText)findViewById(R.id.nameText);
		  DoctorName =(EditText)findViewById(R.id.nameText);
		  DoctorSpeciality = (EditText)findViewById(R.id.nameText);
		  DetailsDisease =(EditText)findViewById(R.id.nameText);
	
        
        submitButton = (Button)findViewById(R.id.submitButton);
        
        submitButton.setOnClickListener(submitButtonListener);
        
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_forms, menu);
        return true;
    }
    
    public void onGenderButtonClicked(View view) {
        if(feButton.isPressed()){
            maButton.setEnabled(false);
            radioPressed = true;
        } else if (maButton.isPressed()){
            feButton.setEnabled(false);
            radioPressed = true;
        } else {
            radioPressed = false;
        }

    }
    private OnClickListener submitButtonListener = new OnClickListener()
    {
    	public void onClick(View v)
    	{   
    		String name = nameText.getText().toString();
    		String addr = addrText.getText().toString();
    		String fone = foneText.getText().toString();
    		String email = emailText.getText().toString();
    		String docName = DoctorName.getText().toString();
    		String docSpe = DoctorSpeciality.getText().toString();
    		String DisDetails = DetailsDisease.getText().toString();
    		
    			Intent i = new Intent(Forms.this, Post.class);
    		
    			mPasser.setName(name);
    			mPasser.setAddress(addr);
    			mPasser.setPhone(fone);
    			mPasser.setEmail(email);
    			mPasser.setdocName(docName);
    			mPasser.setdocSpe(docSpe);
    			mPasser.setDisDetails(DisDetails);
    			
    			i.putExtra("Forms", mPasser);
 
    			startActivity(i); 
    		
    	}
    };
    
    
}