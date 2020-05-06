# DIAGRAMAS DE CLASE Y DIAGRAMAS DE OBJETO

![](https://i.imgur.com/sMH8lWy.png)
>Primeramente podemos distinguir las clases: **Server, Profile, Admin, User, Chat y Update**.
* **Server:** Se conforma por los atributos **ip y name** de tipo **String** y el atributo **port** de tipo **int**.
Tambien constará de los metodos:
    * **Delete()**: Permitirá eliminar un servidor.
    * **ServerStart()**: Que esperara un true o false para confirmar el estado del servidor.
    *  **ServerConfig()**: Con este metodo podremos configurar el servidor.

* **Profile**: esta clase esta formada por los atributos **nickName** de tipo **String**, **connectingTimeMin, wallet y xp** de tipo **int**, y el atributo **rank** que guardara un caracter(**char**).
Sus metodos son:
    * **Money()**: este permitirá gestionar el dinero.
    * **UpgradeRank()**: nos dará acceso a un nuevo rango si se cumplen unos requisitos.
    * **LevelUP()**: podrémos subir de nivel para obtener, por ejemplo, emoticonos para el chat, colores para usar en el nombre, etc.

* **Admin**: será una clase contendrá dos atributos uno de tipo **String**, **name**, y otro de tipo **char** que sera el rango(**rank**).
Además esta clase estará formada por un unico método **editAppWeb()** el cual dará acceso a la edición de la plataforma.

* **User**: estará formada por los atributos **id, username, password y registerDate** que guardarán un **String** y el atributo **phoneNumber** que recibirá un entero(**int**).
Sus metodos serán:
    * **verifyLogin()**: este nos informará con un true si la cuenta se ha logueado correctamente o no false si no.
    *  **UpgradeAccount()**: permitirá asccender de rángo a vip para obtener mejores servicios(más RAM de servidor, mejor procesador de host,etc).

* **Chat**: es una clase cuyos atributos son un **nombre** que recogerá un dato de tipo **String** y dos elementos que recogerán enteros(**int**) que son: **roomNumber y capacity**.
Además la clase Chat, esta compuesta por tres metodos de momento que son:
    * **Open()**: Que recibirá una respuesta booleana, para confirmar si el chat esta habierto o no.
    * **Start()**: confirmará si el chat se ha iniciado o no, recibiendo un dato booleano.
    * **CreateGroup()**: este permitirá crear un nuevo grupo de chat.

* Por último respecto a las clases tenemos la clase **Update** formada por los atributos de tipo **String**, **id y name**, y el atributo **version** que espera un entero(**int**).
Tendra un unico metodo que será **UpdateAppSofware()**, este confirmará si se ha actualizado correctamente o no.

| Herramienta | Biografía | Markdown|
| ------ | ------ | ------ |
| Para realizar los diagramas he utilizado la pagina web [Creately](https://app.creately.com/), permite más elementos en su versión gratuita que Lucidchart. Me he apoyado en sus amplias vistas de pruebas para realizar los distintos diagramas | [Creately](https://app.creately.com/) [YT_Tutorial](https://www.youtube.com/watch?v=lFUfufCMLfM) [PDF](https://www.teatroabadia.com/es/uploads/documentos/iagramas_del_uml.pdf) [Lucidchart_tutorial](https://www.lucidchart.com/pages/es/que-es-el-lenguaje-unificado-de-modelado-uml)|La herramienta utilizada para realizar el markdown ha sido [Dillinger](https://dillinger.io/), esta guarda el progreso, además tiene muchos ejemplos en los que puedes apoyarte para la realizacion del mismo|