/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabela;

import entidades.Toners;

/**
 *
 * @author Thales Leal
 */
public class ModeloTabelaToners extends TableModelAbstract<Toners> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    // Two arrays used for the table data
    private String[] columnNames = {"Nome", "Cor","Modelo"};
    private final int NOME = 0;
    private final int COR = 1;
    private final int MODELO = 2;
    public ModeloTabelaToners() {
        setColumnNames(columnNames);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Toners item = getItem(rowIndex);

        switch (columnIndex) {
            case NOME:
                return item.getNome();
            case COR:
                return item.getCor();
            case MODELO:
                return item.getModelo();
            default:
                // Não deve ocorrer, pois só existem 2 colunas
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case NOME:
                return String.class;
            case COR:
                return String.class;
            case MODELO:
                return String.class;
            default:
                // Não deve ocorrer, pois só existem 2 colunas
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
}
