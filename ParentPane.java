package viscositydb;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class ParentPane extends JPanel {
	
	CardLayout cl = new CardLayout();
	SearchPane searchPane;
	PopulatePane popPane;
	DeletePane dp;
		
	ParentPane(SearchPane searchP, PopulatePane popP, DeletePane dp)  {
		
		this.searchPane = searchP;
		this.popPane = popP;
		this.dp = dp;
		setLayout(cl);
		
		add(searchP, "1");
		add(popP, "2");
		add(dp, "3");
		
	}

}
