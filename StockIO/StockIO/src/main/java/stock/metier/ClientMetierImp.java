package stock.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stock.dao.ClientRepository;
import stock.entities.Client;
@Service
public class ClientMetierImp implements ClientMetier{
	@Autowired
    private ClientRepository clientRepository;
	@Override
	public Client ajouterClient(Client c) {
		// TODO Auto-generated method stub
		return clientRepository.save(c);
	}

	@Override
	public List<Client> listClient() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}

}
