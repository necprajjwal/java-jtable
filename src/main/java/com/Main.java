package com;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Main {
	public static void main(String a[]) {
		// create the j-frame
		JFrame frame = new JFrame("Correlation");
		frame.setSize(800, 600);
		frame.setLocation(300, 100);
		// create the j-panel
		JPanel panel = new JPanel();
		panel.setBounds(200, 200, 100, 100);
		// create action buttons
		JButton ok = new JButton("OK");
		JButton cancel = new JButton("Cancel");
		// add buttons into JPanel
		panel.add(ok);
		panel.add(cancel);
		// add panel into JFrame
		frame.add(panel, BorderLayout.SOUTH);
		// create the correlation table
		TableModel.setColumnNames("Select parameters to correlate", "Parameter", "value 1", "value 2");
		Object[][] rowData = {{Boolean.FALSE, "Dummy2", "Dummy2 value1", "Dummy value2"}, {Boolean.FALSE, "Dummy2", "Dummy2 value1", "Dummy2 value2"}};
		TableModel.setRowData(rowData);
		TableModel model = new TableModel();
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);
		JTable jTable = new JTable(model);
		jTable.setDefaultRenderer(String.class, centerRenderer);
		jTable.getSelectionModel();
		jTable.getTableHeader().setReorderingAllowed(false);
		JScrollPane sp = new JScrollPane(jTable);
		frame.add(sp, BorderLayout.CENTER);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// OK event of JFrame
		ok.addActionListener(event -> {
			frame.dispose();
		});
		// Cancel event of JFrame
		cancel.addActionListener(actionListener -> frame.dispose());
	}
}
