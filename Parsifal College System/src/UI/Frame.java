package UI;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTable;

public class Frame extends JFrame {
	private final JTable table;
	public Frame() {
		
		table = new JTable();
		getContentPane().add(table.getTableHeader(), BorderLayout.NORTH);
		getContentPane().add(table, BorderLayout.CENTER);
	}

}
