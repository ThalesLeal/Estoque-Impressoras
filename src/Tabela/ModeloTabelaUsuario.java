/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabela;

import entidades.Setor;
import entidades.Usuario;

/**
 *
 * @author Thales Leal
 */
public class ModeloTabelaUsuario  extends TableModelAbstract<Usuario>
{
    private static final long serialVersionUID = 1L;
    // Two arrays used for the table data
    private String[] columnNames = {"Nome", "Matricula"};
    private final int NOME = 0;
    private final int MATRICULA = 1;

    public ModeloTabelaUsuario() {
        setColumnNames(columnNames);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario item = getItem(rowIndex);

        switch (columnIndex) {
            case NOME:
                return item.getNome();
            case MATRICULA:
                return item.getMatricula();
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
            case MATRICULA:
                return String.class;
            default:
                // Não deve ocorrer, pois só existem 2 colunas
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
}
