package stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import stock.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Integer>{

}
