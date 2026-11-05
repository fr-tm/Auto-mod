# Francesco Companion 1.1.0 (Minecraft 26.3, Fabric)

## Bauen
Voraussetzung: Java 25. Im Projektordner:

    ./gradlew build        (Windows: gradlew.bat build)

Die fertige Mod liegt danach in `build/libs/francesco-companion-1.1.0.jar`.
Zum Testen im Spiel: `./gradlew runClient`.
Benötigt wird zusätzlich die Fabric API (0.165.x für 26.3) im mods-Ordner.

## Steuerung
* **F + R + A gleichzeitig halten**: Francesco erscheint vor dir. Ist er schon da, verschwindet er wieder.
  Funktioniert in Survival und Creative, ohne /summon, ohne Cheats, auch auf Servern mit der Mod.
  Die Kombination wird nur ausgewertet, wenn kein Menü und kein Chat offen ist.
* Rechtsklick auf Francesco: folgen / warten (wie bisher).
* Francesco ist unsterblich (auch gegen /kill und Void). Wegschicken geht nur mit F + R + A.

