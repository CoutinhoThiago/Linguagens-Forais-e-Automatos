#n = int(input())
for i in range(int(input())):
  x = int(input())

  chamada = [1, 1]
  fatorial = [0, 1]

  for j in range(2, x + 1):
    chamada.append(chamada[j - 1] + chamada[j - 2] + 1)
    fatorial.append(fatorial[j - 1] + fatorial[j - 2])
  
  print(
    "fib(" + str(x) +
    ") = " + str(chamada[x] - 1) +
    " calls = " + str(fatorial[x]))