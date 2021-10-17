package viscositydb;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JMenuBar;

public class ToolBar extends JMenuBar implements ActionListener{
	
	String [] options = {"Query", "Populate", "Delete Record"};
	
	ParentPane pp;
	
	JComboBox jcb = new JComboBox(options);
	
	
	ToolBar (ParentPane pp) {
		

		this.pp = pp;
		
		jcb.addActionListener(this);
		
		add(jcb);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(jcb.getSelectedIndex() == 0) {
			
			this.pp.cl.show(pp, "1");
		}
		
		else if (jcb.getSelectedIndex() == 1) {
			
			this.pp.cl.show(pp, "2");
		}
		
		else if (jcb.getSelectedIndex() == 2) {
			
			this.pp.cl.show(pp, "3");
		}
	}

}
