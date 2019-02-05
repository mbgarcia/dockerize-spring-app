# Construindo a imagem Docker

Para construir a imagem docker do template, abra uma janela de terminal na pasta do projeto.

Execute o seguinte comando Maven para chamar a rotina do plugin [Spotify docker plugin](https://github.com/spotify/docker-maven-plugin) definido no pom.xml.  

   **mvn clean package docker:build**

Ao final do processo, uma mensagem deve mostrar que tudo ocorreu conforme o esperado.