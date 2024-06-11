package bsd.repositories;


import bsd.models.OrganizacoesModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizacoesRepository extends JpaRepository<OrganizacoesModels, Long> {

}