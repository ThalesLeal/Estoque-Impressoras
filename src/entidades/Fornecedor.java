package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.TableGenerator;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tb_fornecedor")
public class Fornecedor implements EntidadeBase {

    @Id
    @GenericGenerator(name = "fornecedor_generate_id", strategy = "org.hibernate.id.IncrementGenerator")
    @GeneratedValue(generator = "fornecedor_generate_id")
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "ativo")
    private Boolean ativo;

    public Fornecedor() {
        setAtivo(true);
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

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString(){
        return this.nome;
    }
}
