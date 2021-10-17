package viscositydb;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PopulatePane extends JPanel {
	
	JTextField year = new JTextField(12);
	JTextField make = new JTextField(12);
	JTextField model = new JTextField(12);
	JTextField visc = new JTextField(12);
	
	JLabel year_l = new JLabel("Year");
	
	JLabel make_l = new JLabel("Make");
	
	JLabel model_l = new JLabel("Model");
	
	JLabel visc_l = new JLabel("Viscosity");		

	GridBagLayout gb = new GridBagLayout();
	GridBagConstraints gc = new GridBagConstraints();
	

	PopulatePane(MainFrame mf) {	
		
		PopulateButton button = new PopulateButton(year, make, model, visc, mf.db);

		setLayout(gb);
		
		gc.gridx = 1;
		gc.gridy = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.weighty = 0.005;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		
		add(year,gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		
		add(make,gc);
		
		gc.gridx = 1;
		gc.gridy = 2;
		add(model,gc);
		
		gc.gridx = 1;
		gc.gridy = 3;
		add(visc,gc);
		
		gc.gridx = 0;
		gc.gridy = 0;
		add(year_l,gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		add(make_l,gc);
		
		gc.gridx = 0;
		gc.gridy = 2;
		add(model_l,gc);
		
		gc.gridx = 0;
		gc.gridy = 3;
		add(visc_l,gc);
		
		gc.gridx = 1;
		gc.gridy = 4;
		add(button,gc);
	}


}
