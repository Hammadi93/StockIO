package stock.entities;

import javax.persistence.*;

@Entity
@AssociationOverrides({
		@AssociationOverride(name = "pk.produit",
			joinColumns = @JoinColumn(name = "refProduit")),
		@AssociationOverride(name = "pk.commandeFournisseur",
			joinColumns = @JoinColumn(name = "idCmdFounisseur")) })
public class LigneCmdFounisseur implements java.io.Serializable {

	private LigneCmdFournisseurId pk = new LigneCmdFournisseurId();
    private double qtt_cmd_four;
    
	public LigneCmdFounisseur() {
	}
    
	@EmbeddedId
	public LigneCmdFournisseurId getPk() {
		return pk;
	}
 
	public void setPk(LigneCmdFournisseurId pk) {
		this.pk = pk;
	}
	
	@Transient
	public Produit getProduit() {
		return getPk().getProduit();
	}

	public void setProduit(Produit produit) {
		getPk().setProduit(produit);
	}

	@Transient
	public CommandeFournisseur getCategory() {
		return getPk().getCommandeFournisseur();
	}

	public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
		getPk().setCommandeFournisseur(commandeFournisseur);
	}
	

	public double getQtt_cmd_four() {
		return qtt_cmd_four;
	}

	public void setQtt_cmd_four(double qtt_cmd_four) {
		this.qtt_cmd_four = qtt_cmd_four;
	}

	
}
