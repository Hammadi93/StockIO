package stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import stock.entities.*;

public interface CategorieRepository extends JpaRepository<Categorie, Integer>{

}
