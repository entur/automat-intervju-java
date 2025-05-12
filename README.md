# Automat Intervju Java

Utgangspunkt for intervju oppgave til utviklerstilling i Team Automat i Entur.
Oppgaven skal løses med Java og Gradle.
Dette repoet inneholder grunnleggende oppsett for å komme i gang med oppgaven;
selve oppgaven vil bli gitt under intervjuet.
Utover Java og Gradle vil du få forklart evt. andre verktøy som brukes.
Før intervjuet skal kandidaten ha satt opp dette prosjektet
som beskrevet i denne README-filen,
og verifisert at bygg og tester kjører.

## Oppsett

Du må ha Java installert, versjonen nevnt i `.tool-versions`
(kan f.eks. installeres vha [asdf](https://asdf-vm.com)).

1. Klon repoet
2. Bygg og last ned avhengigheter med `./gradlew build`

## Utvikling

Bygg og tester kjøres via Gradle:

- `./gradlew build` - Bygger applikasjonen
- `./gradlew test` - Kjører testene
- `./gradlew run --console=plain` - Kjører applikasjonen som en kommandlinje-applikasjon
