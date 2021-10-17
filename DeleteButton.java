package viscositydb;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DeleteButton extends JButton implements ActionListener {

	JTextField year;
	JTextField make;
	JTextField model;
	JTextField visc;
	Database db;
	JOptionPane jp = new JOptionPane();
	
	DeleteButton(JTextField year, JTextField make, JTextField model, Database db) {
		
		
		this.year = year;
		this.make = make;
		this.model = model;
		this.db = db;
		
		setText("Delete");
		
		addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		try {
			Connection c = db.getMyConnection();			
			
			String syear = this.year.getText();
			int year = Integer.parseInt(syear);
			
			String make = this.make.getText();
			
			String model = this.model.getText();
						
			
			db.deleteValue(c, year, make, model);
			
			this.year.setText("");
			this.make.setText("");
			this.model.setText("");
			//jp.showMessageDialog(null, "Record Deleted");

						
		} catch (SQLException e1) {
			
			System.out.println(e1.getMessage());
			
			
			String error = e1.getMessage();
			jp.showMessageDialog(null, error);

		}
		
		catch (Exception ex) {
			
			String error = ex.getMessage();
			jp.showMessageDialog(null, error);

		}
		
	}

}
