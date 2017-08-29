package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tb_impressoras")
public class Impressora implements EntidadeBase {

    @Id
    @GenericGenerator(name = "impressoras_generate_id", strategy = "org.hibernate.id.IncrementGenerator")
    @GeneratedValue(generator = "impressoras_generate_id")
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "ip")
    private String ip;

    @Column(name = "Locada")
    private String locada;

    @Column(name = "Setor")
    private String setor;

    @Column(name = "Modelo")
    private String modelo;
    
    @Column(name = "Fornecedor")
    private String fornecedor;
    
    @Column(name = "Ativo")
    private Boolean ativo;

    public Impressora() {
        setNome("String");
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLocada() {
        return locada;
    }

    public void setLocada(String locada) {
        this.locada = locada;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setCor(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
