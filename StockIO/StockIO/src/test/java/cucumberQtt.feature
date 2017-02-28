Feature: Gestion des produits

    Scenario: Modifier la quantité du produit lorsque une commande client été effectué
       Given le systeme de gestion des produits est initalise comme suit 
       
           |id |  produit       | qtt     | 
           | 1 |  Imprimante    | 600.0   | 
           | 2 |  TV            | 620.0   | 
           | 3 |  PC            | 550.0   | 
           | 4 |  Tablette      | 700.0   | 
           | 5 |  Phone         | 500.0   | 
           | 6 |  Table         | 620.0   | 
           | 7 |  Clavier       | 910.0   | 
           | 8 |  Souris        | 965.0   | 
           
      When le client commande le produit avec id 1 pour quantité de 200
      Then la quantité du produit avec id 1 sera 400