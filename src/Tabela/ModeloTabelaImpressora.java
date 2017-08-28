/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabela;

import entidades.Impressora;

/**
 *
 * @author Thales Leal
 */
public class ModeloTabelaImpressora extends TableModelAbstract<Impressora> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    // Two arrays used for the table data
    private String[] columnNames = {"Nome", "Ip","Locada","Setor","Modelo","Ativo"};
    private final int NOME = 0;
    private final int IP = 1;
    private final int LOCADA = 2;
    private final int SETOR = 3;
    private final int MODELO = 4;
    private final int ATIVO = 5;
    public ModeloTabelaImpressora() {
        setColumnNames(columnNames);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Impressora item = getItem(rowIndex);

        switch (columnIndex) {
            case NOME:
                return item.getNome();
            case IP:
                return item.getIp();
            case LOCADA:
                return item.getLocada();
            case SETOR:
                return item.getSetor();
            case MODELO:
                return item.getModelo();
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
            case IP:
                return String.class;
            case LOCADA:
                return String.class;
            case SETOR:
                return String.class;
            case MODELO:
                return String.class;
            case ATIVO:
                return Boolean.class;
            default:
                // Não deve ocorrer, pois só existem 2 colunas
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
}
