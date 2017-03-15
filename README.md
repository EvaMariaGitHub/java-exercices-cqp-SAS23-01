# java-exercices-cqp-SAS23-01
L'objectif est de créer une application "LifeGarage" qui permet de gérer des véhicules.

La classe Car

Un voiture est caractérisée par sa marque, sa couleur et son prix. Ses attributs ne sont pas visibles. 

Il existe seulement 3 types de couleurs 

	Rouge = #FFFF00

	Vert = #008000

	Bleu =  #0000FF


La classe Garage

Le garage est caractérisé par son nom et une liste de voitures qui est initialisée à vide.

Elle peut avec les méthodes addCar, ajouter une voiture ou plusieurs.

L'application LifeGarage

1/implémenter les classes et l'enum Color

2/ajouter et afficher la voiture suivante

marque, couleur, prix

renault, rouge, 999.9

3/ajouter et afficher les voitures suivantes:

marque,couleur,prix

"peugeot",Color.GREEN, 1000

"volkswagen",Color.BLUE, 1500

"renault",Color.RED, 2000.5

Partie Abstrait + UML


Nous allons continuer l'exercice précédent

On veut ajouter des motos dans le garage et afficher les véhicules avec leur prix taxé.

La taxe pour une moto est plus 1 euro

La taxe pour une voiture est plus 2 euros

1/créer une classe abstract Vehicle et la classe Bike suivant le diagramme UML


Dans LifeGarage

1/ajouter les motos suivantes dans le garage

marque, couleur, prix

"harley", Color.RED, 800

"ducati", Color.BLUE, 1000

"bmw", Color.GREEN, 1999.9

2/afficher les véhicules dans le garage avec leurs prix taxés
