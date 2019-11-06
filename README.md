POUR NE PAS PERDRE DU TEMPS A INDEXER TOUTE UNE COLLECTION, on préfere indexer une collection trés réduite ou DATA SET.
1/ pour créer un DATA SET à partir d'une collection, on choisi le nombre de requete qu'on veuut utiliser (dans mon cas c'est 5).
2/ on met dans un fichier texte tous les jujements de pertinences correspendant à ces dernières (Qrels.txt).
3/ on exécute la classe Ids.java : celle ci nous extrait tous les ids correspondant à ses requetes.
4/ on exécute la classe Recup.java : celle ci fera une corespondance entre les ids du fichier Ids.txt et ceux de la collection(le    	fichier texte ou se trouve votre collection totale).
5/ on execute la classe Recup1.java : afin de faire du btuit, on extrera aussi les tweets non corespondant aux ids.
6/ on rassemble les deux fichier issus de l'étape 4 et 5 dans un nouveau fichier.
7 on procéde à l'indexation de ce dernier.


	 
	 

  
  
