package br.com.ifpe.oxefood.modelo.produto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import br.com.ifpe.oxefood.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Produto")
@Where(clause = "habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produto extends EntidadeAuditavel  {

    private static final long serialVersionUID = -9147515922627050356L;

    @Column
    private String codigo;

    @Column
    private String titulo;

    @Column
    private String descricao;

    @Column
    private double valorUnitario;

    @Column
    private int tempoEntregaMinimo;

    @Column
    private int tempoEntregaMaximo;

}
//TABELA PRODUTO
/*{
    "codigo":"5050",
    "titulo":"haha",
    "descricao":"...",
    "valorUnitario":"40.00",
    "tempoEntregaMinimo":"1",
    "tempoEntregaMaximo":"10"
}*/