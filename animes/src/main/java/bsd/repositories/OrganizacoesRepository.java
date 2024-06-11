package bsd.repositories;
//Define o pacote onde esta interface está localizada.
//Pacotes são usados para organizar classes e interfaces em grupos lógicos.

import bsd.models.OrganizacoesModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Importa a classe OrganizacoesModels do pacote bsd.models.
// Esta é a entidade que será gerenciada pelo repositório.


//Importa a interface JpaRepository do Spring Data JPA, que fornece métodos padrão para
//operações CRUD (Create, Read, Update, Delete) e outras operações de banco de dados.

//Importa a anotação @Repository, que indica que a interface é um repositório Spring.

@Repository
//Indica que a interface é um repositório Spring.
//Esta anotação é usada para autodetecção de classes de repositório e para tratamento de
//exceções específicas de persistência.


public interface OrganizacoesRepository extends JpaRepository<OrganizacoesModels, Long> {

}


// public interface OrganizacoesRepository: Declara uma interface pública chamada OrganizacoesRepository.
// extends JpaRepository<OrganizacoesModels, Long>: A interface OrganizacoesRepository estende a interface
// JpaRepository fornecida pelo Spring Data JPA. Isso significa que OrganizacoesRepository herda todos os
// métodos padrão de JpaRepository para operações CRUD e outras operações de banco de dados.

//OrganizacoesModels: A entidade que será gerenciada pelo repositório.
//Long: O tipo do identificador (ID) da entidade OrganizacoesModels.

// este código define um repositório Spring Data JPA para a entidade OrganizacoesModels.
// A interface OrganizacoesRepository herda métodos padrão de JpaRepository, permitindo realizar operações
// CRUD e outras operações de banco de dados sem a necessidade de implementar esses métodos manualmente.
// A anotação @Repository indica que esta interface é um componente Spring que interage com a camada de
// persistência.