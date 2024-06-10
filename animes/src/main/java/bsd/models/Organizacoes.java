package bsd.models;
//Define o pacote onde a classe Organizacões está localizado;

import jakarta.persistence.*;
//Importa todas as classes e interfaces do pacote
// jakarta.persistence,
// que é usado para a API de persistência Java (JPA).

import lombok.Data;
//Importa a anotação @Data da biblioteca Lombok,
// que gera automaticamente getters,
// setters, toString, equals, e hashCode métodos para a classe.


@Entity
//Indica que a classe é uma entidade JPA.
// Isso significa que ela será mapeada para uma tabela no banco de dados.



@Table(name = "Organizações")
//Especifica o nome da tabela no banco de dados que
// esta entidade será mapeada.

@Data
//Anotação do Lombok que gera automaticamente os métodos getters, setters,
// toString, equals, e hashCode.


public class Organizacoes {

    @Id
    //Indica que o campo id é a chave primária da entidade.

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Especifica que o valor do campo id será gerado automaticamente
    // pelo banco de dados usando a estratégia de identidade (auto-incremento).
    //private Long id;: Campo id do tipo Long, que é a chave primária da entidade.


    private Long id;
    private String nome;
    private String sigla;
    private String chefe;
    private int membros;
}


