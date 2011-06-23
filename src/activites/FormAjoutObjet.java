package activites;


import java.text.NumberFormat;
import java.util.Calendar;

import tools.DateUtil;
import wrapper.FormAjouterWrapper;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import fr.studiodev.testlayout2.R;

public class FormAjoutObjet extends Activity {

	FormAjouterWrapper wrapper;

    private int mYear;
    private int mMonth;
    private int mDay;
    NumberFormat jourMoisFormatteur;
    
	static final int DATE_DIALOG_ID = 0;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		View view = getLayoutInflater().inflate(R.layout.form_ajout_objet, null);
		setContentView(view);
		
		wrapper = new FormAjouterWrapper(view);
			
		wrapper.getBtnDate().setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showDialog(DATE_DIALOG_ID);
            }
        });
		
		// get the current date
        final Calendar c = Calendar.getInstance();
        mYear = c.get(Calendar.YEAR);
        mMonth = c.get(Calendar.MONTH);
        mDay = c.get(Calendar.DAY_OF_MONTH);
        
    }
		

	// updates the date in the TextView
    private void updateDisplay() {
        wrapper.getDateTexte().setText(
            new StringBuilder()
                    .append(DateUtil.getJourMoisFormatteur().format(mDay).toString()).append("/")
                    .append(DateUtil.getJourMoisFormatteur().format(mMonth+1).toString()).append("/")
                    .append(mYear)
        );
    }
    
    private DatePickerDialog.OnDateSetListener mDateSetListener =
            new DatePickerDialog.OnDateSetListener() {

                public void onDateSet(DatePicker view, int year, 
                                      int monthOfYear, int dayOfMonth) {
                    mYear = year;
                    mMonth = monthOfYear;
                    mDay = dayOfMonth;
                    updateDisplay();
                }

            };
            
    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
        case DATE_DIALOG_ID:
            return new DatePickerDialog(this,
                        mDateSetListener,
                        mYear, mMonth, mDay);
        }
        return null;
    }
    
}
