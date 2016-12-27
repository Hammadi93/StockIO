package stock.service;

import stock.entities.Client;
import stock.metier.ClientMetier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientRestService {
    @Autowired
	private ClientMetier clientMetier;
    @RequestMapping(value="/clients", method=RequestMethod.POST)
	public Client ajouterClient(@RequestBody Client c) {
		return clientMetier.ajouterClient(c);
	}
    @RequestMapping(value="/clients", method=RequestMethod.GET)
	public List<Client> listClient() {
		return clientMetier.listClient();
	}
	
}
