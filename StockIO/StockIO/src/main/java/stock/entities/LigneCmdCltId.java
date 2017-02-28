package stock.entities;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class LigneCmdCltId implements java.io.Serializable {

	private Produit produit;
	private CommandeClient commandeClient;

	public LigneCmdCltId() {
	}
    
	@ManyToOne
	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}
    
	@ManyToOne
	public CommandeClient getCommandeClient() {
		return commandeClient;
	}

	public void setCommandeClient(CommandeClient commandeClient) {
		this.commandeClient = commandeClient;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commandeClient == null) ? 0 : commandeClient.hashCode());
		result = prime * result + ((produit == null) ? 0 : produit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LigneCmdCltId other = (LigneCmdCltId) obj;
		if (commandeClient == null) {
			if (other.commandeClient != null)
				return false;
		} else if (!commandeClient.equals(other.commandeClient))
			return false;
		if (produit == null) {
			if (other.produit != null)
				return false;
		} else if (!produit.equals(other.produit))
			return false;
		return true;
	}
	
	

}
