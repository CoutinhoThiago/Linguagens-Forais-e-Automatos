# Casos de teste

## Testes simples
* str = null
* padStr = ESPACO
* padStr = string vazia
* padStr = null
* padStr = ESPACO
* padStr = string vazia
* size = 0
* size = -1
* size = null OU "" OU ESPACO //da  erro de compliação

## Combinações entre str e padsTR
* str e padStr = null
* str e padStr = ""
* str e padStr = ESPACO
* str = null e padStr = ""
* str = null e padStr = ESPACO
* str = "" e padStr = null
* str = ESPACO e padStr = null

## Combinações de size e tamanho do resultado
* size = tamanho do resultado
* size = tamanho do resultado +1
* size = tamanho do resultado +1
* size = tamanho do resultado -1
* size = tamanho do resultado -2

## Combinações de size e tamanho de str
* size = tamanho de str & tamanho de padStr = 0
* size = tamanho de str & tamanho de padStr = 1
* size = tamanho de str & tamanho de padStr = 2
* size = tamanho de str +1 & tamanho de padStr = 0
* size = tamanho de str +1 & tamanho de padStr = 1
* size = tamanho de str +1 & tamanho de padStr = 2

## Combinação entre size e padStr
* str = ESPACO & size = padStr -1
* str = ESPACO & size = padStr
* str = ESPACO & size = padStr +1
* str = string vazia & size = padStr -1
* str = string vazia & size = padStr
* str = string vazia & size = padStr +1