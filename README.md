![alt text](https://github.com/rodrigovenancio/movyz/blob/main/app/src/main/res/mipmap-xxxhdpi/ic_launcher.webp?raw=true)

# Movyz
App Android de listagem de filmes usando Jetpack Compose, Hilt, Coroutines, Retrofit, Coil, MVVM e Clean Architeture.


## Configuração

### Chave API:
Como o app acessa a API do [The Movie DB](https://api.themoviedb.org), é necessário criar o arquivo `apikeys.properties` na raiz do projeto com o seguinte conteúdo:
```gradle
API_KEY = "<api-key>"
```
A api-key será enviada ao recrutador junto ao link do repositório.

## Preview
![alt text](https://github.com/rodrigovenancio/movyz/blob/main/preview/movyz-preview.png?raw=true)

## Principais bibiliotecas, técnicas e tecnologias utilizadas:
- Jetpack Compose: layout declarativo em Kotlin
- Navigation: padrão single-activity 
- Retrofit: requisições HTTP para a API
- MVVM & Clean Architeture: Separação de responsabilidades para melhor manutenção, testabilidade e reaproveitamento de código. Salvamento de estado em caso de mudança de configurações como rotação de tela. Melhor gerenciamento de lifecycle e memória.
- Coroutines: correta utilização de threads para background tasks
- Coil: carregamento e cacheamento de imagens da API
- Version Catalog: melhor controle e versionamento de dependências
- Type-Safe Navigation: Navegação de telas segura sem precisar de strings hardcoded


## TO-DO
- Pagination3: Versões mais recentes agora oferecem suporte para Compose
- Desevolver busca de filmes
- Desenvolver tela de detalhes do filme para demonstrar o uso de Navigation
- Melhorias de layout
- Testes unitários e instrumentados (Espresso)
- Criptografar chave da API

