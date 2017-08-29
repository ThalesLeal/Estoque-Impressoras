package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tb_cor")
public class Cor implements EntidadeBase {

    @Id
    @GenericGenerator(name = "cor_generate_id", strategy = "org.hibernate.id.IncrementGenerator")
    @GeneratedValue(generator = "cor_generate_id")
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    public Cor() {
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

 
    @Override
    public String toString(){
        return this.nome;
    }
}
