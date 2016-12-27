package stock.entities;

import javax.persistence.*;

@Embeddable
public class LigneCmdFournisseurId implements java.io.Serializable {

	private Produit produit;
	private CommandeFournisseur commandeFournisseur;

	public LigneCmdFournisseurId() {
	}
    
	@ManyToOne
	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}
    
	@ManyToOne
	public CommandeFournisseur getCommandeFournisseur() {
		return commandeFournisseur;
	}

	public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commandeFournisseur == null) ? 0 : commandeFournisseur.hashCode());
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
		LigneCmdFournisseurId other = (LigneCmdFournisseurId) obj;
		if (commandeFournisseur == null) {
			if (other.commandeFournisseur != null)
				return false;
		} else if (!commandeFournisseur.equals(other.commandeFournisseur))
			return false;
		if (produit == null) {
			if (other.produit != null)
				return false;
		} else if (!produit.equals(other.produit))
			return false;
		return true;
	}
	
	
}
