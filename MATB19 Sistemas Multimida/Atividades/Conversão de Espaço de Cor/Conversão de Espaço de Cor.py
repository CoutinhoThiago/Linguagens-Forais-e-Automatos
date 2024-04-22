def rgbToYcbcr(rgb):
  R, G, B = rgb
  Er = R / 255
  Eg = G / 255
  Eb = B / 255
  Ey = 0.299 * Er + 0.587 * Eg + 0.114 * Eb
  Ecb = -0.169 * Er - 0.331 * Eg + 0.5 * Eb
  Ecr = 0.5 * Er - 0.419 * Eg - 0.081 * Eb
  Y = round(219 * Ey + 16)
  Cb = round(224 * Ecb + 128)
  Cr = round(224 * Ecr + 128)
  return Y, Cb, Cr


R, G, B = map(int, input().split())
Y, Cb, Cr = rgbToYcbcr((R, G, B))
print(Y, Cb, Cr)