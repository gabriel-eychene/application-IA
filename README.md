# application-IA

Ce programme simule le problème suivant, posé initialement par Lewis Caroll :
Cinq  amis,  Barnabé,  Casimir,  Désiré,  Ludovic  et  Martial,  se  retrouvent  chaque  jour  au restaurant.
Ils ont établi les règles suivantes, qu'ils appliquent chaque fois qu'on leur sert du boeuf :
Barnabé prend du sel si et seulement si Casimir ne prend que du sel ou que de la moutarde.
Il prend de la moutarde si et seulement si, ou bien Désiré ne prend ni sel ni moutarde, ou bien Martial prend les deux.
Casimir  prend  du  sel  si  et  seulement  si,  ou  bien Barnabé  ne  prend  qu'un  des  deux condiments, ou bien Martial n'en prend aucun.
Il prend de la moutarde si et seulement si Désiré ou Ludovic prennent les deux condiments.
Désiré prend du sel si et seulement si ou bien Barnabé ne prend aucun condiment, ou bien Casimir prend les deux.
Il prend de la moutarde si et seulement si Ludovic ou Martial ne prennent ni sel ni moutarde.
Ludovic prend du sel si et seulement si Barnabé ou Désiré ne prennent ni sel ni moutarde.
Il  prend  de  la  moutarde  si  et  seulement  si  Casimir  ou  Martial  ne  prennent  ni  sel,  ni moutarde.
Martial prend du sel si et seulement si Barnabé ou Ludovic prennent des deux condiments.
Il  prend  de  la  moutarde  si  et  seulement  si  Casimir  ou  Désiré  ne  prennent  qu'un  seul condiment.
En fin de compte, que vont-ils mettre sur leurs steaks ?

La simulation est effectuée par le solveur choco : https://choco-solver.org/

Pour la compilation, un Makefile est fournis avec les commandes suivant :
-make all : pour compiler le programme.
-make run : pour compiler et exécuter.
-make clean : pour supprimer les fichiers générés par la compilation
