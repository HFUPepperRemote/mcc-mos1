<h1>Beschreibung Vorgehen und Ergebnisse LU04 - Gruppe Seibert </h1>

Demonstration:

siehe: demoLu04.mp4 (video war zu groß um es hier in der Vorschau anzuzeigen)



Schritt 1:
* Installation Docker und Einleitung
* Installation von Ionic in einem Container
    * (pull from Docker hub) docker pull beevelop/ionic:latest
    * (container aus Image bauen) docker build -t beevelop/ionic github.com/beevelop/docker-ionic
    * (Container starten + Port festlegen) docker run -p 8100:8100 -it beevelop/ionic bash
 
Schritt 2:
* apt-get update/upgrade
* ionic start myApp tabs
* cd myApp
* ionic serve --external (ich wollte mal schauen wie das auf einem anderen Gerät aussieht)
* Zeige im Browser: localhost:8100

*zum ändern der tab1 Beschreibung musss man in der tab1.page.html die Beschreibung ändern

![bild02](https://user-images.githubusercontent.com/75586118/112783495-bea17300-904f-11eb-8983-bd2b05f58d8d.png)

Schritt 3:

* Das Tutorial machen...
* Ändern der Farben von den Grundrechenarten von Gelb auf Blau ... wie? :
      * In der tab6.page.html wurden die Farben definiert. Wechsel von "Warnung" auf "Primary" (ich hatte erst im Stylesheet gesucht)
      
 <img width="750" alt="bild01" src="https://user-images.githubusercontent.com/75586118/112783699-37a0ca80-9050-11eb-9966-c5e1c2dc2be8.png">


Schritt 4:

* zusätzliche Tabs erstellen unter: 

<img width="763" alt="bild03" src="https://user-images.githubusercontent.com/75586118/112783885-9b2af800-9050-11eb-8f6c-66a4017bbea3.png">

hier kann man dann die neuen tabs auf dem .html Element und auch die Abhängigkeiten festlegen. Es müssen die entsprechenden Ordner noch im Verzeichnis erstellt werden und die Abhängigkeiten müssen richtig gesetzt sein.

<img width="566" alt="bild06" src="https://user-images.githubusercontent.com/75586118/112784003-d7f6ef00-9050-11eb-89d9-4249cc64dd88.png">


nachdem man die Tabs erstellt hat kann man die ion-radio buttons, die bild einbindung, den Button und den date und time picker einfach aus der ion-dokumentation entnehmen


