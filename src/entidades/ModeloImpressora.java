package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tb_modelo_impressora")
public class ModeloImpressora implements EntidadeBase, Serializable {

    @Id
    @GenericGenerator(name = "modelo_impressora_generate_id", strategy = "org.hibernate.id.IncrementGenerator")
    @GeneratedValue(generator = "modelo_impressora_generate_id")
    @Column(name = "id")
    private Long id;

    @Column
    private String nome;
    
    @Column
    private Boolean ativo;

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
