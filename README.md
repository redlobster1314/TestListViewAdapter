# TestListViewAdapter  

1. Aufgabe ist es aus Übungszwecken eine Custom Listview zu erstellen.  
Grundlage soll eine ArrayList sein, bei der eine eigene Datenklasse: Daten genutzt wird  
  
Daten haben folgende Felder vom Typ String:  
  - Name  
  - Nachricht  
  
Die Listview soll ein TextView enthalten, bei dem der Name eines Datenelements ausgegeben wird und einen Button, der bewirkt, dass die Nachricht als Toast ausgegeben wird.
  
  
2. Aufgabe ist es das Programm so zu erweitern, dass in der Main Activity 2 EditText-Felder existieren und ein Button.  
Das erste Edittextfeld ist für Namen, das zweite für Beschreibungen.  
Der Button bewirkt, dass aus Namensfeld und Beschreibungsfeld ein neues Daten-Objekt erstellt wird und dieses der Liste hinzugefügt wird. (Anschließend wird der Inhalt der Edittext-Felder gelöscht.  
Die Initialisierenmethode aus der MainActivity wirdkomplett rausgenommen. (Und eben dadurch ersetzt, dass man jetzt dynamisch Felder einfügen kann.  
Man sollte auch Felder löschen können, indem die daten_layout.xml durch einen ImageButton mit Mülltonnensymbol ergänzt wird.  
