# Gruppo29
Repository per il progetto del corso “programmazione ad oggetti”


# Divisione lavoro

carte -> mmikee0  
plancia nave e componenti -> BatuFugo  
giocatori e meccaniche di gioco -> nonfederico  
plancia di volo -> reprogrammato  


# programmi utilizzati

starUML per diagramma delle classi e macchina a stati  

https://staruml.io/  

ECLIPSE  

https://www.eclipse.org/downloads/


# SWING  
https://web.cs.ucla.edu/~miryung/teaching/EE379K-Spring2014/SwingTutorial.html  
https://youtube.com/playlist?list=PLU8dZfh0ZIUn7-TDZfSmX9QRnBgmdJJWD&si=ME4XUM83XkB-9CHQ  

# USO DEL TERMINALE

prima si compila con il comando javac e poi si esegue con il comando java  

1)Per compilare tutte le classi, vai nella cartella che è la radice del progetto (nel nostro caso src) e usa il comando  
	![image](https://github.com/user-attachments/assets/61924dc1-c66a-4eba-be45-23bcee4b88b9)  
"*/*" serve per riferirsi a tutti i file che si trovano in qualsiasi sottocartella  

2)dopo aver compilato dobbiamo eseguire la classe contenente il main, avendo però importato altri package dobbiamo usare il comando  
	![image](https://github.com/user-attachments/assets/7ce5000c-c62a-4ddd-9917-cfa8eae124f7)  
-cp (-classpath) specifica dove la JVM o compilatore devono cercare i file.class e le librerie, in questo caso cercano partendo dalla cartella corrente ( . ) cioè quella in cui siamo quando usiamo il comando  

# interfaccia gioco

![Screenshot From 2025-05-23 01-15-22](https://github.com/user-attachments/assets/fea8e131-7457-4397-aada-10c747e625b3)
 
frame formato da 4 panel fissi  
il primo contenente il testo  
il secondo contenente la plancia di volo  
il terzo contenente le informazioni di gioco (batterie, soldi ecc)   
il quarto contenente la plancia nave  
