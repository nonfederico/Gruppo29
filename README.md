# Gruppo29
Repository per il progetto del corso “programmazione ad oggetti”

# interfaccia gioco
![layoutUltimaVersione - Page 01](https://github.com/user-attachments/assets/2c2e263d-cc89-4577-8909-9d731c2e2678)

frame formato da 4 panel fissi  
composti da sottoContenitori contenenti gli elementi grafici 

non c'è un controllo sull'inserimento di nomi giocatori duplicati poichè ogni giocatore è caratterizzato da un id univoco e da un colore univoco  
identifichiamo un giocatore con nome + id + colore
# programmi utilizzati

starUML per diagramma delle classi e macchina a stati  

https://staruml.io/  

ECLIPSE  

https://www.eclipse.org/downloads/


# SWING  
https://web.cs.ucla.edu/~miryung/teaching/EE379K-Spring2014/SwingTutorial.html  
https://youtube.com/playlist?list=PLU8dZfh0ZIUn7-TDZfSmX9QRnBgmdJJWD&si=ME4XUM83XkB-9CHQ  

# COMPILAZIONE ED ESECUZIONE
1) installare WINDOWBUILDER da eclipse marketplace
2) compilare ed eseguire direttamente da eclipse
   
Consigliato:
installare jdk 24 https://www.oracle.com/java/technologies/downloads/
Compilare ed eseguire direttamente dal terminale

# ISTALLA WINDOWBUILDER 
https://marketplace.eclipse.org/content/windowbuilder

# USO DEL TERMINALE

++LINUX++
prima si compila con il comando javac e poi si esegue con il comando java  

1)Per compilare tutte le classi, vai nella cartella che è la radice del progetto (nel nostro caso src) e usa il comando  
	![image](https://github.com/user-attachments/assets/61924dc1-c66a-4eba-be45-23bcee4b88b9)  
"*/*" serve per riferirsi a tutti i file che si trovano in qualsiasi sottocartella  

2)dopo aver compilato dobbiamo eseguire la classe contenente il main, avendo però importato altri package dobbiamo usare il comando  
	![image](https://github.com/user-attachments/assets/7ce5000c-c62a-4ddd-9917-cfa8eae124f7)  
-cp (-classpath) specifica dove la JVM o compilatore devono cercare i file.class e le librerie, in questo caso cercano partendo dalla cartella corrente ( . ) cioè quella in cui siamo quando usiamo il comando  

++WINDOWS++
(esempio, dovete sostituire con il percorso locale del vostro progetto)
1) C:\percorso..\Gruppo29\CodiceGruppo29UML\src>for /R %f in (*.java) do javac -d ..\bin "%f"
2) C:\percorso..\Gruppo29\CodiceGruppo29UML\src>cd ../bin
3) C:\percorso..\Gruppo29\CodiceGruppo29UML\bin>java gruppo29.Main


# Divisione lavoro

carte -> mmikee0  
plancia nave e componenti -> BatuFugo  
giocatori, meccaniche di gioco e grafica -> nonfederico  
plancia di volo -> reprogrammato  



