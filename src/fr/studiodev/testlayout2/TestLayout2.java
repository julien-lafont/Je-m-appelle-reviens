package fr.studiodev.testlayout2;


import activites.Emprunts;
import activites.Historique;
import activites.Prets;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class TestLayout2 extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        TabHost host = getTabHost();
        
        host.addTab(host.newTabSpec("prets")
        		.setIndicator("Prêts", getResources().getDrawable(R.drawable.ic_tab_pret))
        		.setContent(new Intent(this, Prets.class)));
        
        host.addTab(host.newTabSpec("emprunts")
        		.setIndicator("Emprunts", getResources().getDrawable(R.drawable.ic_tab_emprunt))
        		.setContent(new Intent(this, Emprunts.class)));
        
        host.addTab(host.newTabSpec("historique")
        		.setIndicator("Historique", getResources().getDrawable(R.drawable.ic_tab_historique))
        		.setContent(new Intent(this, Historique.class)));
        
    
    }
}