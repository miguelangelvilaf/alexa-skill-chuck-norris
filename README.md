# Skill para Alexa con frases sobre Chuck Norris #

Este es un Skill para Alexa con frases sobre Chuck Norris desarrollado en Java 8 para ser desplegado como una Lambda en AWS.

En la carpeta **src/model** está definido el skill de Alexa con los *intents* y frases de entrenamiento.

Se ha utilizado Gradle en lugar de Maven para poder usar el plugin que existe para AWS que permite desplegar la función directamente en Lambda con ayuda del comando:

```bash
gradlew clean deploy
```

El plugin requiere un fichero con las credenciales **AWSAccessKeyId** y **AWSSecretKey** que debe guardarse en la carpeta:

```bash
~/.aws/credentials
```

Ejemplo:

```
[default]
aws_access_key_id=XXXXXXXXXXXXXXXXXXXX
aws_secret_access_key=XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
```

Estas credenciales se utilizan para poder acceder a la API. El formato del archivo de credenciales se describe en los documentos de [Amazon AWS](https://docs.aws.amazon.com/sdk-for-java/v2/developer-guide/credentials.html#credentials-file-format).

Enjoy!!!