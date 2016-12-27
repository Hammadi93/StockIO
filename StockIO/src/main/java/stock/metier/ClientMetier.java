package stock.metier;

import java.util.*;

import stock.entities.Client;

public interface ClientMetier {
    public Client ajouterClient(Client c);
    public List<Client> listClient();
}
