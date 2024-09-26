dados = input()
anterior = ''
cont = 1
for i in range(len(dados)):
    if dados[i] == anterior:
        cont += 1
    else:
        if cont >= 2 and anterior == '0':
            print('@' + str(cont), end='')
        else:
            print(anterior*cont, end='')
        cont = 1
    anterior = dados[i]
if cont >= 2 and anterior == '0':
    print('@' + str(cont), end='')
else:
    print(anterior*cont, end='')
