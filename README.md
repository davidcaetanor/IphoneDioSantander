## Diagrama UML do Projeto

diagrama UML das classes e interfaces (abstraçao) implementadas para o desafio do iPhone

```mermaid
classDiagram
    Iphone ..|> AparelhoTelefonico
    Iphone ..|> NavegadorInternet
    Iphone ..|> ReprodutorMusical

    class Iphone {
        +userName: String
        +musicName: String
        +number: String
    }

    class AparelhoTelefonico {
        +startCall(call: String)
        +endCall()
        +answer()
    }

    class NavegadorInternet {
        +newTab()
        +refreshPage()
    }

    class ReprodutorMusical {
        +playMusic(music: String)
        +stopMusic()
        +changeMusic()
    }
```

## Desafio:
https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo#exemplo-de-diagrama-uml-mermaid
