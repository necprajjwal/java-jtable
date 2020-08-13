package com;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel {

	private static final long serialVersionUID = 5071306820857374637L;

	protected static Object[][] rowData = null;
	protected static String[] columnNames = null;

	public static Object[][] getRowData() {
		return rowData;
	}

	public static void setRowData(Object[][] rowData) {
		TableModel.rowData = rowData;
	}

	public String[] getColumnNames() {
		return columnNames;
	}

	public static void setColumnNames(String... columnNames) {
		TableModel.columnNames = columnNames;
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public String getColumnName(int column) {
		return columnNames[column];
	}

	public int getRowCount() {
		return rowData.length;
	}

	public Object getValueAt(int row, int column) {
		return rowData[row][column];
	}

	@Override
	public Class<?> getColumnClass(int column) {
		return column == 0 ? Boolean.class : String.class;
	}

	@Override
	public void setValueAt(Object value, int row, int column) {
		rowData[row][column] = value;
	}

	@Override
	public boolean isCellEditable(int row, int column) {
		// Only make the first column editable
		return column == 0;
	}

}
