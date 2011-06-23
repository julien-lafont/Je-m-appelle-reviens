package fr.studiodev.testlayout2;

import java.util.zip.Inflater;

import wrapper.ListeWrapper;
import activites.FormAjoutObjet;
import android.app.Application;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class ListeGenerique extends ListActivity implements OnClickListener {
	
	private final String LOG = "ListeGenerique";
	
	ListeWrapper wrapper;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		View view = getLayoutInflater().inflate(R.layout.layout_liste, null);
		setContentView(view);
		
		wrapper = new ListeWrapper(view);
		wrapper.getBtnAjouter().setOnClickListener(this);
			
	}
	

	public void onClick(View v) {
		
		switch(v.getId()) {
			case R.id.btn_ajouter:
				
				Toast t = Toast.makeText(getApplicationContext(), "Btn Ajouter", Toast.LENGTH_SHORT);
				t.show();
				
				startActivity(new Intent(this, FormAjoutObjet.class));
				
			break;
			default:
				Toast t2 = Toast.makeText(getApplicationContext(), "Btn autre", Toast.LENGTH_SHORT);
				t2.show();
			break;
		}
	}
	
	
}
