from fractions import gcd # from math import gcd

for i in range(int(input())): # número de casos de teste
  numeros = input().split()
  a = int(numeros[0])
  b = int(numeros[1])
  print(gcd(a, b))