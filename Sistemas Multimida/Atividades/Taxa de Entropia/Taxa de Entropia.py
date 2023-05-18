import math

simbolos = int(input())

frequencias = []
bits = []

for i in range(simbolos):
  entrada = input().split()
  frequencias.append(float(entrada[0]))
  bits.append(int(entrada[1]))

entropia = 0
for freq in frequencias:
    entropia -= freq * math.log2(freq)

mediaDeBits = sum([f * b for f, b in zip(frequencias, bits)])

print("{:.4f}".format(entropia))
print("{:.4f}".format(mediaDeBits))