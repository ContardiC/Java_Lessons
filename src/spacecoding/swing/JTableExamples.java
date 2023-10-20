package spacecoding.swing;// Packages to import
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableExamples {
	// frame
	JFrame f;
	// Table
	JTable j;

	// Constructor
	JTableExamples()
	{
		// Frame initialization
		f = new JFrame();

		// Frame Title
		f.setTitle("JTable Example");

		// Data to be displayed in the JTable
		String[][] data = {
			{ "Giovanni Mela", "1", "CEO" },
			{ "Mario Rossi", "2", "IT" }
		};

		// Column Names
		String[] columnNames = { "Name", "ID", "Department" };

		// Initializing the JTable
		j = new JTable(data, columnNames);
		j.setBounds(30, 40, 200, 300);

		// adding it to JScrollPane
		JScrollPane sp = new JScrollPane(j);
		f.add(sp);
		// Frame Size
		f.setSize(500, 200);
		// Frame Visible = true
		f.setVisible(true);
	}

	// Driver method
	public static void main(String[] args)
	{
		new JTableExamples();
	}
}

