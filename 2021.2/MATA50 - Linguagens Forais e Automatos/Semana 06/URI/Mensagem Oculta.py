entrada = int(input())

for i in range(entrada):
    saida = ""
    mensagem = input()
    tamanhomensagem = len(mensagem)

    if (mensagem[0] != " "):
        saida = saida + mensagem[0]

    for j in range(tamanhomensagem-1):
        if (mensagem[j] == " ") and (mensagem[j + 1] != " "):
            saida = saida + mensagem[j+1]
    print (saida)
