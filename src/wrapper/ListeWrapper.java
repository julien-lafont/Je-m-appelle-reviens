package wrapper;

import fr.studiodev.testlayout2.R;
import android.view.View;
import android.widget.ImageButton;

public class ListeWrapper {

	View base;
	ImageButton btnAjouter = null;
	
	public ListeWrapper(View view) {
		base = view;
	}
	
	public ImageButton getBtnAjouter() {
		if (btnAjouter==null){
			btnAjouter = (ImageButton)base.findViewById(R.id.btn_ajouter);
		}
		return btnAjouter;
	}
	
}
