#Test alta de Bug
curl -i -X POST -H "Content-Type:application/json" -d '{"videojoc": "videojoc", "usuari": "Marcela1","dataDelBug":"2001-01-01","plataforma":"pc","paisDeConexio":"santcugat","email":"mail@mail.com","descripcioBreu":"hola","descripcio":"hola","categoria":"arcade","prioridad":"alta","estat":"pdt"}' http://localhost:8080/bug
curl -i -X POST -H "Content-Type:application/json" -d '{"videojoc": "videojoc", "usuari": "Marcela2","dataDelBug":"2001-01-01","plataforma":"pc","paisDeConexio":"santcugat","email":"mail@mail.com","descripcioBreu":"hola","descripcio":"hola","categoria":"arcade","prioridad":"alta","estat":"pdt"}' http://localhost:8080/bug
curl -i -X POST -H "Content-Type:application/json" -d '{"videojoc": "videojoc", "usuari": "Marcela3","dataDelBug":"2001-01-01","plataforma":"pc","paisDeConexio":"santcugat","email":"mail@mail.com","descripcioBreu":"hola","descripcio":"hola","categoria":"arcade","prioridad":"alta","estat":"pdt"}' http://localhost:8080/bug
#Test modificación
curl -i -X PUT -H "Content-Type:application/json" -d '{"videojoc": "videojoc_modificado", "usuari": "Marcela_modificado","dataDelBug":"2002-02-02","plataforma":"pc_modificado","paisDeConexio":"santcugat_modificado","email":"mail@mail.com_modificado","descripcioBreu":"hola_modificado","descripcio":"hola_modificado","categoria":"arcade_modificado","prioridad":"alta_modificado","estat":"pdt_modificado"}' http://localhost:8080/bug/1
#Test Obtener todos los datos
curl -i -X GET http://localhost:8080/bug
#Test Obtener los datos de 1 usuario
curl -i -X GET http://localhost:8080/bug/1
#Test modificar un atributo
curl -i -X PATCH -H "Content-Type:application/json" -d '{"usuari": "Marcela_modificado_unitariamente" }' http://localhost:8080/bug/1
#Test Lista de funciones disponibles 
curl -i -X GET http://localhost:8080/bug/search
#Test Buscar por email
curl -i -X GET  http://localhost:8080/bug/search/findByEmail?email=mail@mail.com
#Test Borrar por email
curl -i -X GET  http://localhost:8080/bug/search/deleteByEmail?email=mail@mail.com
#Test Borrar por id
curl -i -X DELETE  http://localhost:8080/bug/2

