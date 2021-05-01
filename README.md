# Alexa Skill with Chuck Norris famous phrases #

This is a Skill for Alexa with famous Chuck Norris phrases developed in Java 8 to be deployed as a Lambda on AWS.

In the **src/model** folder, there is the model defined for the Alexa skill with the *intents* and training phrases.

Gradle has been used instead of Maven in order to be able to use the plugin that exists for AWS that allows to deploy the function directly in Lambda with the help of the command:

```bash
gradlew clean deploy
```

The plugin requires a file with the credentials **AWSAccessKeyId** and **AWSSecretKey** to be saved in the folder:

```bash
~/.aws/credentials
```

Example:

```
[default]
aws_access_key_id=XXXXXXXXXXXXXXXXXXXX
aws_secret_access_key=XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
```

These credentials are used to access the API. The format of the credentials file is described in the [Amazon AWS documents](https://docs.aws.amazon.com/sdk-for-java/v2/developer-guide/credentials.html#credentials-file-format).

Enjoy!!!
