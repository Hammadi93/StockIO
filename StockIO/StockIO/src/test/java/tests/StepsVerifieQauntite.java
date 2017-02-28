package tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stock.entities.*;

public class StepsVerifieQauntite {
    
	private LigneCmdClt LigneCmdClt = new LigneCmdClt();
	private Produit produit = new Produit();
	int qttTotal;
	
	@Given("^le systeme de gestion des produits est initalise comme suit : $")
	public void initialise_Salaire_employes(DataTable DATAproduits) throws Throwable { 
		Produit produit; 
		List<Map<String, String>> data = DATAproduits.asMaps(String.class, String.class); 
		for (Map row : data) { 
		    String id = row.get("id").toString(); 
		    String designationProduit = row.get("designationProduit").toString(); 
		    Fournisseur fournisseur = (Fournisseur) row.get("fournisseur");
		    Categorie categorie = (Categorie) row.get("Categorie");
		    String quantiteProduit = row.get("quantiteProduit").toString(); 
		    String prixProduit = row.get("prixProduit").toString(); 
		    String seuilMin = row.get("seuilMin").toString();
		    String imageProduit = row.get("imageProduit").toString();
		    
		    produit=new Produit(categorie, fournisseur, designationProduit, Integer.parseInt(quantiteProduit),
		    		            Float.parseFloat(prixProduit), Integer.parseInt(seuilMin),  imageProduit); 
		    LigneCmdClt.addProduit(produit); 
		}
	 }
	
	@When("^le client commande le produit avec id (\\d+) pour quantité de (\\d+) :$")
	public void le_client_commande_le_produit(int qttCommande) throws Throwable { 
		    qttTotal = produit.demunierQuantite(qttCommande);
		} 
	
	@Then("^la quantité du produit avec id (\\d+) sera (\\d+)$") 
	public void la_nouv_quantite_produit(int qtt) throws Throwable { 
		assertThat(qtt).isEqualTo(qttTotal);
		}
}
