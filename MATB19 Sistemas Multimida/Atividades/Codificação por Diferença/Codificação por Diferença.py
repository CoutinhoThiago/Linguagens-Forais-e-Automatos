tamanho = int(input())
entrada = list(map(int, input().split()))

codificacao = [entrada[0]]
for i in range(1, tamanho):
    codificacao.append(entrada[i] - entrada[i-1])

print(" ".join(str(x) for x in codificacao))