# [Imersão Java ☕](https://github.com/Wall90s/imersao-java/tree/main)
![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge?style=flat&logo=appveyor)

Neste repositório ficaram os códigos feitos durante a semana de Imersão Java da Alura, ou seja, os exercícios das aulas e desafios.

## 🧑‍💻  Tecnologias utilizadas 
Durante a imersão é feito o uso do VS Code, porém decidi seguir usando o ``IntelliJ IDEA Community``, para explorar um pouco mais do que vi durante o curso Java do [Programando Seu Futuro](https://github.com/Wall90s/Curso_Java).

## 📝 Aula 1
Os arquivos da primeira aula ficarão separados na branch [aula1](https://github.com/Wall90s/imersao-java/tree/aula1).<br>

### O que foi feito durante a aula:
- Fizemos a conexão com uma API de filmes
- Extraímos os dados que interessavam, que no caso foram: título, poster e classificação
- Exibimos os dados coletados no terminal

## 📝 Aula 2
Os arquivos da segunda aula ficarão separados na branch [aula2](https://github.com/Wall90s/imersao-java/tree/aula2).<br>

### O que foi feito durante a aula:
Criamos uma classe para gerar stickers a partir da API que trabalhamos na aula passsada. Nessa nova classe foi feito:
- A leitura da imagem
- Geramos uma nova imagem com um tamanho novo e transparência
- Escrevemos uma frase personalizada na área transparente
- Salvamos a imagem em um novo arquivo

Com o gerador de stickers funcional:
- Fizemos a sua implementação na classe app para utilizar a API de filmes
- Geramos stickers personalizados para todos os posters disponíveis na API

### Resultados
Captura do Terminal<br>
<img width="500" src="https://raw.githubusercontent.com/Wall90s/imersao-java/aula2/aluraStickers/captura-do-terminal.png">

Exemplo de sticker personalizado<br>
<img width="300" src="https://raw.githubusercontent.com/Wall90s/imersao-java/aula2/aluraStickers/The%20Shawshank%20Redemption.png">

## 📝 Aula 3
Os arquivos da terceira aula ficarão separados na branch [aula3](https://github.com/Wall90s/imersao-java/tree/aula3).<br>

### O que foi feito durante a aula:
Tentamos utilizar a aplicação para consumir uma [API da NASA](https://api.nasa.gov/) (Astronomy Picture of the Day), porém o nosso código não estava pronto para receber uma API diferente, então foram feitas algumas alterações para que se tornasse mais adaptável:
- Incluímos a url para acessar a API com busca para três "fotos do dia"

Depois organizamos o código, divindo as ações da classe principal em outras classes busca a adaptação, distribuindo em:
- Cliente HTTP para separar o <i>body da API
- Conteúdo que Armazena a parte da API em título e url da imagem
- Extrator para pegar os dados da API da IMDb
- Extrator para pegar os dados da API da NASA

Por último, criamos uma interface Extrator que irá exigir um método aos outros dois extratores, garantindo assim a retirada dos dados seguindo os parâmetros que precisamos.<br>
Vale notar que dessa forma não alteramos o JsonParser e nem o Gerador de Stickers, pois já ficaram modulares o suficente para funcionar sem alterações como as que fizemos, gerando assim stickers para as duas API com uma simples alteração de url.