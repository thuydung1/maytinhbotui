package Bai8.com.vn;

import android.R.integer;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btntru= (Button)findViewById(R.id.btntru);
        Button btnnhan= (Button)findViewById(R.id.btnnhan);
        Button btnchia= (Button)findViewById(R.id.btnchia);
        
        
        btnnhan.setOnClickListener(this);
        btnchia.setOnClickListener(this);
        
    	btntru.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				EditText editsoa =(EditText)findViewById(R.id.editsoa);
			      int a = Integer.parseInt(editsoa.getText()+"");
			      EditText editsob =(EditText)findViewById(R.id.editsob);
			      int b = Integer.parseInt(editsob.getText()+"");
			      TextView textviewkq =(TextView)findViewById(R.id.textviewkq);
			      textviewkq.setText((a-b)+" ");
			}
		});
    	
    }
    
    Button btncong, btntru, btnnhan,btnchia, btnUCLN;
    EditText editText1, editText2 ;
    TextView textviewkq ;
   
    public void tong2so(View vi)
    {
      EditText editsoa =(EditText)findViewById(R.id.editsoa);
      int a = Integer.parseInt(editsoa.getText()+"");
      
      EditText editsob =(EditText)findViewById(R.id.editsob);
      int b = Integer.parseInt(editsob.getText()+"");
      TextView textviewkq =(TextView)findViewById(R.id.textviewkq);
      textviewkq.setText((a+b)+" ");
    }
    
	@Override
	public void onClick(View arg0) {
		switch(arg0.getId()){
		case R.id.btnnhan:
			{EditText editsoa =(EditText)findViewById(R.id.editsoa);
		      int a = Integer.parseInt(editsoa.getText()+"");
		      EditText editsob =(EditText)findViewById(R.id.editsob);
		      int b = Integer.parseInt(editsob.getText()+"");
		      TextView textviewkq =(TextView)findViewById(R.id.textviewkq);
		      textviewkq.setText((a*b)+" ");}
		      break; 
		case R.id.btnchia:
		{
			EditText editsoa =(EditText)findViewById(R.id.editsoa);
		      int a = Integer.parseInt(editsoa.getText()+"");
		      EditText editsob =(EditText)findViewById(R.id.editsob);
		      int b = Integer.parseInt(editsob.getText()+"");
		      TextView textviewkq =(TextView)findViewById(R.id.textviewkq);
		      textviewkq.setText((a/b)+" ");}
				break;
		}
		
		// TODO Auto-generated method stub	  
	}
	public void clickthoat(View thoat)
	{
		finish();
	}
	
}
