### Modul Praktikum Objektorientierte Programmierung

## Aufgabe 4.1: Fische im Aquarium
<br>

### Beschreibung

Wer ein Aquarium mit exotischen Fischen einrichten will, kommt nicht ohne den Rat des Experten aus. Wer außerdem bei beschränktem Geldbeutel versucht, Fische möglichst vieler verschiedener Arten gemeinsam unterzubringen, fragt besser gleich den Computer. Der Grund ist einfach: Nicht jede Art verträgt sich mit jeder anderen und natürlich sollten keine Fische unverträglicher Arten zusammen im Aquarium leben und sich bekämpfen oder gar - bei Fischen eine durchaus gängige Methode - gegenseitig

<br>

### Aufgabenstellung

Schreiben Sie ein Programm, welches Fische, ihre Verträglichkeit und ihre Preise verwaltet und rekursiv eine maximale Anzahl verschiedener verträglicher Fischarten zu einem vorgegebenen Preis für das Aquarium zusammenstellt.

<br>

### Testprogramm

Testen Sie Ihr Programm mit dem folgenden Beispiel, einer Summe von 170,- Euro sowie mehreren zusätzlichen Geldbeträgen.

|Fisch|Preis|Unverträglich mit|
---|---|---|
|Grüne Migräne|70,- Euro|Breitmaulmolch, Grottensprotte|
|Korallenqualle|50,- Euro|Breitmaulmolch, Prachtpiranha|
|Schuppenschatulle|30,- Euro||
|Breitmaulmolch|40,- Euro|Grüne Migräne, Schuppenschatulle|
|Prachtpiranha|40,- Euro|Schuppenschatulle, Grottensprotte|
|Zitterling|30,- Euro|Grottensprotte|
|Grottensprotte|20,- Euro|Grüne Migräne, Prachtpiranha, Zitterling|

Eingabe

    Erhältliche Fischarten mit Preisen für einzelne Fische und Unverträglichkeiten der Arten unter-einander, für den Fischkauf verfügbare Summe.

Ausgabe

    Einkaufsliste mir einer maximalen Anzahl verschiedener verträglicher Fischarten.

Abbruch

    Das Programm bricht nach der Ausführung ab.
