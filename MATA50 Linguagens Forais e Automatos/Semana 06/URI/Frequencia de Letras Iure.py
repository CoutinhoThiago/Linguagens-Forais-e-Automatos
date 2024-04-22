# Define a quantidade de casos de teste
n = int(input())

# Executa os casos de teste
for i in range(n):
  # Insere a palavra e transforma em minúsculas
  w = input().lower()

  # Inicializa o conjunto
  setOfChars = {}

  # Checa cada caractere e a ocorrência
  for char in w:
    if char.isalpha() and char not in setOfChars:
      setOfChars[char] = w.count(char)

  # Ordena o conjunto
  setOfChars = sorted(setOfChars.items(), key=lambda x:(-x[1],x[0]))

  # Pega o valor da maior ocorrencia
  qtd = setOfChars[0][1]
  str = ''

  # Adiciona os caracteres na string
  for k in setOfChars:
    if k[1] == qtd:
      str += k[0]

  #Imprime os caracteres
  print(str)
