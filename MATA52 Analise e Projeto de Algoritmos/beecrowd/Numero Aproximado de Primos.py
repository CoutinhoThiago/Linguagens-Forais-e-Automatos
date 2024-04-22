import math

n = int(input()) # A entrada é um número natural n (17 ≤ n ≤ 109).

p = float(n/(math.log(n))) 
p = "%.1f" % p
m = float(1.25506 * n/(math.log(n)))
m = "%.1f" % m

print(p, m)