package bsd.dtos;


import lombok.Data;

@Data
public class OrganizacoesDtos {

    private Long id;
    private String nome;
    private String sigla;
    private String chefe;
    private int membros;
}