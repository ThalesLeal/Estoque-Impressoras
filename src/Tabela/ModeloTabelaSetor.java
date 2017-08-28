/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabela;

import entidades.Setor;

/**
 *
 * @author Thales Leal
 */
public class ModeloTabelaSetor extends TableModelAbstract<Setor> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    // Two arrays used for the table data
    private String[] columnNames = {"Nome", "Ativo"};
    private final int NOME = 0;
    private final int ATIVO = 1;

    public ModeloTabelaSetor() {
        setColumnNames(columnNames);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Setor item = getItem(rowIndex);

        switch (columnIndex) {
            case NOME:
                return item.getNome();
            case ATIVO:
                return item.getAtivo();
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
            case ATIVO:
                return Boolean.class;
            default:
                // Não deve ocorrer, pois só existem 2 colunas
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
}
