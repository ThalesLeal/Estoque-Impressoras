package Tabela;



import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public abstract class TableModelAbstract<T> extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<T> items;
	private String[] columnNames;

	public TableModelAbstract() {
		setItems(new ArrayList<T>());
	}

	@Override
	public int getRowCount() {
		return items.size();
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public String getColumnName(int column) {
		return columnNames[column];
	}

	/**
	 * @return the items
	 */
	public List<T> getItems() {
		return items;
	}

	/**
	 * @param items
	 *            the items to set
	 */
	public void setItems(List<T> items) {
		this.items = items;
	}

	/**
	 * @return the columnNames
	 */
	public String[] getColumnNames() {
		return columnNames;
	}

	/**
	 * @param columnNames
	 *            the columnNames to set
	 */
	public void setColumnNames(String[] columnNames) {
		this.columnNames = columnNames;
	}

	// Retorna o Item referente a linha especificada
	public T getItem(int index) {
		return items.get(index);
	}

	// Adiciona o Item especificado ao modelo
	public void addItem(T item) {
		// Adiciona o registro.
		items.add(item);

		// Pega a quantidade de registros e subtrai 1 para
		// achar o �ltimo �ndice. A subtra��o � necess�ria
		// porque os �ndices come�am em zero.
		int ultimoIndice = getRowCount() - 1;

		// Notifica a mudan�a.
		fireTableRowsInserted(ultimoIndice, ultimoIndice);
	}

	// Remove todos os registros.
	public void limpar() {
		// Remove todos os elementos da lista de s�cios.
		items.clear();

		// Notifica a mudan�a.
		fireTableDataChanged();
	}

	/*************************************************************************/
	public void setDataModel(int index, T item) {

		System.out.println("updateModel " + getClass().getName() + " " + index);

		removerItem(index);

		addItem(index, item);
	}

	/*************************************************************************/
	private void addItem(int index, T item) {
		// Adiciona o registro.
		items.add(index, item);

		// Pega a quantidade de registros e subtrai 1 para
		// achar o �ltimo �ndice. A subtra��o � necess�ria
		// porque os �ndices come�am em zero.
		int ultimoIndice = getRowCount() - 1;

		// Notifica a mudan�a.
		fireTableRowsInserted(ultimoIndice, ultimoIndice);
	}

	/*************************************************************************/
	private void removerItem(int index) {
		// Remove o registro.
		items.remove(index);

		// Notifica a mudan�a.
		fireTableRowsDeleted(index, index);
	}
	/*************************************************************************/

}
