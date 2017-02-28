package stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import stock.entities.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer>{

}
