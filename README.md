# Gruppo29
Repository per il progetto del corso “programmazione ad oggetti”


# Divisione lavoro

carte -> mmikee0\n
plancia nave e componenti -> BatuFugo\n
giocatori e meccaniche di gioco -> nonfederico \n
plancia di volo -> reprogrammato \n


# programmi utilizzati

starUML per diagramma delle classi e macchina a stati

https://staruml.io/

SWING
https://web.cs.ucla.edu/~miryung/teaching/EE379K-Spring2014/SwingTutorial.html

# USO DEL TERMINALE

prima si compila con il comando javac e poi si esegue con il comando java \n

1)Per compilare tutte le classi, vai nella cartella che è la radice del progetto (nel nostro caso src) e usa il comando \n
	javac */*.java \n
*/* serve per riferirsi a tutti i file che si trovano in qualsiasi sottocartella \n

2)dopo aver compilato dobbiamo eseguire la classe contenente il main, avendo però importato altri package dobbiamo usare il comando \n
	java -cp . main.Gioco \n
-cp (-classpath) specifica dove la JVM o compilatore devono cercare i file.class e le librerie, in questo caso cercano partendo dalla cartella corrente ( . ) cioè quella in cui siamo quando usiamo il comando\n
