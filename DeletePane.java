package viscositydb;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DeletePane extends JPanel {
	
	JTextField year = new JTextField(12);
	JTextField make = new JTextField(12);
	JTextField model = new JTextField(12);
	
	JLabel year_l = new JLabel("Year");
	
	JLabel make_l = new JLabel("Make");
	
	JLabel model_l = new JLabel("Model");
	
	GridBagLayout gb = new GridBagLayout();
	GridBagConstraints gc = new GridBagConstraints();
	

	DeletePane(MainFrame mf) {	

		DeleteButton button = new DeleteButton (year, make, model, mf.db);

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
		
		gc.gridx = 0;
		gc.gridy = 0;
		add(year_l,gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		add(make_l,gc);
		
		gc.gridx = 0;
		gc.gridy = 2;
		add(model_l,gc);
		
		
		gc.gridx = 1;
		gc.gridy = 4;
		add(button,gc);
	}


}
