package bsd.models;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table  (name = "Aniversários")
@Data

public class Aniversarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private int dia;
    private int ano;
    private int mes;
    private int idade_atual;


}