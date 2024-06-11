package bsd.models;

import jakarta.persistence.*;
import lombok.Data;


    @Entity
    @Table(name = "Personagens")
    @Data

    public class PersonagensModels {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Long id;
        private String nome;
        private int idade;
        private String nacionalidade;
        private String nascimento;
        private String organizacao;
        private String sexo;

    }