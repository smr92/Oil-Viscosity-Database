# Oil-Viscosity-Database
A program that creates a small database with cars' year, make, model and viscosity for oil changes.

The purpose of this program is for the user to query the recommended oil viscosity for a car based on its year, make and model. Moreover, this program uses the JDBC API and basic SQL commands.

When the program is run for the first time, it will create a small table of cars with the following rows:

	    2016, 'Ford', 'Fiesta', '5W-20;
			
			2012, 'Honda', 'Accord', '0W-20'
			
			2010, 'Ford', 'Escape', '5W-20'
			
			2016, 'Ford', 'Fiesta', '5W-20'
			
			2018, 'Jeep', 'Cherokee', '0W-20'
 
There will be a simple GUI with a JComboBox at the toolbar, from which the user may select three modes: Query, populate record or delete record.

Query Mode
In query mode, the user may enter a car's year, make and model, and upon pushing the button below, an undeitable text field will display the recommended viscosity, provided that the record exists. (N.B: As of this version, the user's entries are case sensitive).

Populate Mode
In populate mode, the user may enter a car's year, make, model and viscosity to create a new row in the table. This record will also be queryable upon valid entry.

Delete Mode
In delete mode, the user, as in query mode, will enter a car's year, make and model. If the record exists, it will delete.
