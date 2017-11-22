Esse projeto é um WebService e foi desenvolvido utilizando Eclipse Neon, Java 8, Maven e [Spring Boot 2.0.0](https://projects.spring.io/spring-boot/). <br>
Para sua configuração inicial foi utilizado o [Spring Initializr](https://start.spring.io/), utilizando as dependências Web, Actuator e DevTools presentes no Initializr. 


## Instruções para rodar o WebService

Para poder rodar o WebService basta copiar o código utilizando o [Link](https://gitlab.com/andradebruno/lanchonete-indra/repository/master/archive.zip).

Ou utilizar o comando para clonar o projeto através do git
```
git clone git@gitlab.com:andradebruno/lanchonete-indra.git
```

Após copiar o código, abra no Eclipse e selecione a classe LanchoneteApplication.java no pacote com.indracompany.lanchonete e rode como Java Application. Também é possível fazer o download do jar e utilizar o CMD/Terminal para rodar através do comando:

```
java -jar lanchonete-api-0.0.1-SNAPSHOT.jar
```

## Link para requisições no WebService
- [Api Lanchonete](http://localhost:8080/api/)

## Lista de possíveis requisições.

* Requisição Post
	- [Post Request /pedidos](#post-request-pedidos)
	- [Post Request /lanche/calcula](#post-request-lanche-calcula)
* Requisição Get
	- [Get Request /pedidos](#get-request-pedidos)
	- [Get Request/lanches](#get-request-lanches)
	- [Get Request /lanche/{idLanche}](#get-request-lanche-idlanche)



## Post Request /pedidos

A requisição post [/pedidos](http://localhost:8080/api/pedidos) realiza o cadastro do pedido no sistema.<br>
JSON presente no body da requisição:

```
 {
        "idLanche":		1,
		"alface": 		0,
		"bacon":		1,
		"carne":		1,
		"ovo":			0,
		"queijo":		1,
		"total":		6.5
    }
```

## Post Request /lanche/calcula

A requisição post /lanche/calcula utiliza as informações presente no formulário de cadastro de pedido para que seja calculado o valor do pedido, a mesma é acionada utilizando o botão de calcular.<br>

JSON presente no body da requisição:

```
{
        "idLanche":		1,
		"alface": 		0,
		"bacon":		1,
		"carne":		1,
		"ovo":			0,
		"queijo":		1,
    }
```


## Get Request /pedidos

A requisição get [/pedidos](http://localhost:8080/api/pedidos) recupera todas os pedidos já cadastrados no sistema. Por default já vem um pedido cadastrado.<br>
Resposta dá requisição no formato JSON:

```
[
    {
        "idPedido": 1,
        "lanchePedido": {
            "idLanche": 1,
            "nomeLanche": "X-Bacon",
            "ingredientesLanche": [
                {
                    "idIngrediente": 1,
                    "nomeIngrediente": "Alface",
                    "quantidadeIngrediente": 0,
                    "precoIngrediente": 0.40000000000000002220446049250313080847263336181640625
                },
                {
                    "idIngrediente": 2,
                    "nomeIngrediente": "Bacon",
                    "quantidadeIngrediente": 1,
                    "precoIngrediente": 2
                },
                {
                    "idIngrediente": 3,
                    "nomeIngrediente": "Hambúrger de carne",
                    "quantidadeIngrediente": 1,
                    "precoIngrediente": 3
                },
                {
                    "idIngrediente": 4,
                    "nomeIngrediente": "Ovo",
                    "quantidadeIngrediente": 0,
                    "precoIngrediente": 0.8000000000000000444089209850062616169452667236328125
                },
                {
                    "idIngrediente": 5,
                    "nomeIngrediente": "Queijo",
                    "quantidadeIngrediente": 1,
                    "precoIngrediente": 1.5
                }
            ]
        },
        "totalPedido": 6.5
    }
 ]
```


## Get Request/lanches

A requisição get /pedidos [/pedidos](http://localhost:8080/api/pedidos) recupera todas os lanches já pré cadastrados no sistema.<br>
Resposta dá requisição no formato JSON:

```
[
    {
        "idLanche": 1,
        "nomeLanche": "X-Bacon",
        "ingredientesLanche": [
            {
                "idIngrediente": 1,
                "nomeIngrediente": "Alface",
                "quantidadeIngrediente": 0,
                "precoIngrediente": 0.40000000000000002220446049250313080847263336181640625
            },
            {
                "idIngrediente": 2,
                "nomeIngrediente": "Bacon",
                "quantidadeIngrediente": 1,
                "precoIngrediente": 2
            },
            {
                "idIngrediente": 3,
                "nomeIngrediente": "Hambúrger de carne",
                "quantidadeIngrediente": 1,
                "precoIngrediente": 3
            },
            {
                "idIngrediente": 4,
                "nomeIngrediente": "Ovo",
                "quantidadeIngrediente": 0,
                "precoIngrediente": 0.8000000000000000444089209850062616169452667236328125
            },
            {
                "idIngrediente": 5,
                "nomeIngrediente": "Queijo",
                "quantidadeIngrediente": 1,
                "precoIngrediente": 1.5
            }
        ]
    },
    {
        "idLanche": 2,
        "nomeLanche": "X-Burger",
        "ingredientesLanche": [
            {
                "idIngrediente": 1,
                "nomeIngrediente": "Alface",
                "quantidadeIngrediente": 0,
                "precoIngrediente": 0.40000000000000002220446049250313080847263336181640625
            },
            {
                "idIngrediente": 2,
                "nomeIngrediente": "Bacon",
                "quantidadeIngrediente": 0,
                "precoIngrediente": 2
            },
            {
                "idIngrediente": 3,
                "nomeIngrediente": "Hambúrger de carne",
                "quantidadeIngrediente": 1,
                "precoIngrediente": 3
            },
            {
                "idIngrediente": 4,
                "nomeIngrediente": "Ovo",
                "quantidadeIngrediente": 0,
                "precoIngrediente": 0.8000000000000000444089209850062616169452667236328125
            },
            {
                "idIngrediente": 5,
                "nomeIngrediente": "Queijo",
                "quantidadeIngrediente": 1,
                "precoIngrediente": 1.5
            }
        ]
    },
    {
        "idLanche": 3,
        "nomeLanche": "X-Egg",
        "ingredientesLanche": [
            {
                "idIngrediente": 1,
                "nomeIngrediente": "Alface",
                "quantidadeIngrediente": 0,
                "precoIngrediente": 0.40000000000000002220446049250313080847263336181640625
            },
            {
                "idIngrediente": 2,
                "nomeIngrediente": "Bacon",
                "quantidadeIngrediente": 0,
                "precoIngrediente": 2
            },
            {
                "idIngrediente": 3,
                "nomeIngrediente": "Hambúrger de carne",
                "quantidadeIngrediente": 1,
                "precoIngrediente": 3
            },
            {
                "idIngrediente": 4,
                "nomeIngrediente": "Ovo",
                "quantidadeIngrediente": 1,
                "precoIngrediente": 0.8000000000000000444089209850062616169452667236328125
            },
            {
                "idIngrediente": 5,
                "nomeIngrediente": "Queijo",
                "quantidadeIngrediente": 1,
                "precoIngrediente": 1.5
            }
        ]
    },
    {
        "idLanche": 4,
        "nomeLanche": "X-Egg Bacon",
        "ingredientesLanche": [
            {
                "idIngrediente": 1,
                "nomeIngrediente": "Alface",
                "quantidadeIngrediente": 0,
                "precoIngrediente": 0.40000000000000002220446049250313080847263336181640625
            },
            {
                "idIngrediente": 2,
                "nomeIngrediente": "Bacon",
                "quantidadeIngrediente": 1,
                "precoIngrediente": 2
            },
            {
                "idIngrediente": 3,
                "nomeIngrediente": "Hambúrger de carne",
                "quantidadeIngrediente": 1,
                "precoIngrediente": 3
            },
            {
                "idIngrediente": 4,
                "nomeIngrediente": "Ovo",
                "quantidadeIngrediente": 1,
                "precoIngrediente": 0.8000000000000000444089209850062616169452667236328125
            },
            {
                "idIngrediente": 5,
                "nomeIngrediente": "Queijo",
                "quantidadeIngrediente": 1,
                "precoIngrediente": 1.5
            }
        ]
    }
]
```

## Get Request /lanche/{idLanche}

A requisição /lanche/{idLanche} recupera a lista de ingredientes de um dos lanche já pré cadastrados no sistema, utilizando seu ID como forma de pesquisa.<br>

Resposta da requisição para o lanche de ID 1: 
 
```
[
    {
        "idIngrediente": 1,
        "nomeIngrediente": "Alface",
        "quantidadeIngrediente": 0,
        "precoIngrediente": 0.40000000000000002220446049250313080847263336181640625
    },
    {
        "idIngrediente": 2,
        "nomeIngrediente": "Bacon",
        "quantidadeIngrediente": 1,
        "precoIngrediente": 2
    },
    {
        "idIngrediente": 3,
        "nomeIngrediente": "Hambúrger de carne",
        "quantidadeIngrediente": 1,
        "precoIngrediente": 3
    },
    {
        "idIngrediente": 4,
        "nomeIngrediente": "Ovo",
        "quantidadeIngrediente": 0,
        "precoIngrediente": 0.8000000000000000444089209850062616169452667236328125
    },
    {
        "idIngrediente": 5,
        "nomeIngrediente": "Queijo",
        "quantidadeIngrediente": 1,
        "precoIngrediente": 1.5
    }
]
```
