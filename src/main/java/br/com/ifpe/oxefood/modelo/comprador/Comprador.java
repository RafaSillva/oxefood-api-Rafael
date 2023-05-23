package br.com.ifpe.oxefood.modelo.comprador;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Comprador")
@Where(clause = "habilitado = true") 
@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Comprador extends EntidadeAuditavel  {

    private String nome;

    private String enderecoComercial;

    private String enderecoResidencial;

    private double comissao;

    private String trabahoHomeOffice;

    private int qtdComprasMediasMes;
  
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate contratadoEm;
}
//TABELA Comprador
/*{
   "nome":"Rafael",
   "dataNascimento":"10/03/2004",
   "cpf":"2231415",
   "foneCelular":"12991",
   "foneFixo":"93848475"
} */

