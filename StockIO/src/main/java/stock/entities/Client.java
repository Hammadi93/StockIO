package stock.entities;

import java.util.*;

import javax.persistence.*;

@Entity
public class Client implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idClient;
	private String nomClient;
	private String addrClient;
	private String telClient;
	@OneToMany(mappedBy="client",fetch=FetchType.LAZY)
	private Set<CommandeClient> commandeClient = new HashSet<CommandeClient>(0);

	public Client() {
	}

	public Client(String nomClient, String addrClient, String telClient) {
		this.nomClient = nomClient;
		this.addrClient = addrClient;
		this.telClient = telClient;
	}

	public Integer getIdClient() {
		return this.idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	public String getNomClient() {
		return this.nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getAddrClient() {
		return this.addrClient;
	}

	public void setAddrClient(String addrClient) {
		this.addrClient = addrClient;
	}

	public String getTelClient() {
		return this.telClient;
	}

	public void setTelClient(String telClient) {
		this.telClient = telClient;
	}

	public Set<CommandeClient> getCommandeClient() {
		return commandeClient;
	}

	public void setCommandeClient(Set<CommandeClient> commandeClient) {
		this.commandeClient = commandeClient;
	}
	
	

}
