package stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import stock.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{

}
