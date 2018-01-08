# BootVtech
Proyecto Demo para presentación en el VTECH 

El proyecto tiene dos perfiles, el perfil por defecto utiliza la base de datos H2, el perfil "prod" se conecta a una base de datos MySQL. 

Para correr el proyecto desde la consola, ir al directorio raiz y ejecutar el comando "mvn package" esto genera un jar en la carpeta target. Una vez generado el jar ingresar a la carpeta target y ejecutar "java -jar demo-0.0.1-SNAPSHOT.jar", para especificar un profile ejecutar java -Dspring.profiles.active=prod -jar demo-0.0.1-SNAPSHOT.jar

