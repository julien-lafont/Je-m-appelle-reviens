package wrapper;

import fr.studiodev.testlayout2.R;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class FormAjouterWrapper {

	View base;
	
	private TextView dateTexte = null;
    private Button btnDate = null;

    static final int DATE_DIALOG_ID = 0;
	
	public FormAjouterWrapper(View base) {
		this.base=base;
	}
	
	public TextView getDateTexte() {
		if (dateTexte==null){
			dateTexte = (TextView)base.findViewById(R.id.dateTexte);
		}
		return dateTexte;
	}
	
	public Button getBtnDate() {
		if (btnDate==null){
			btnDate = (Button)base.findViewById(R.id.btnDate);
		}
		return btnDate;
	}
	
	
}
