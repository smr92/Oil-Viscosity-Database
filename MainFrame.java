package viscositydb;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class MainFrame extends JFrame {
	
	Database db = new Database();
	
	SearchPane sp = new SearchPane(this);
	
	PopulatePane pp = new PopulatePane(this);
	
	DeletePane dp = new DeletePane(this);

	
	ParentPane pane = new ParentPane(sp, pp, dp);
	
	BorderLayout bl = new BorderLayout();
	
	ToolBar toolBar = new ToolBar(pane);

		
	MainFrame () {
		
		setTitle("Visc. DB");
		setVisible(true);
	    setResizable(false);
		setSize(300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(pane, BorderLayout.CENTER);
		add(toolBar, BorderLayout.NORTH);
	}

}
