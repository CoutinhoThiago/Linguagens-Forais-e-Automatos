def keywordEncoding(text):
  keywords = {
    'carro': '%',
    'carro,': '%,',
    'acidente': '$',
    'acidente,': '$,',
    'acidente.': '$.',
    'senhor': '&',
    'senhor.': '&.',
    'do': '#'
  }

  textoCodificado = []
  for word in text.split():
    if word in keywords:
      textoCodificado.append(keywords[word])
    else:
      textoCodificado.append(word)

  textoCodificado = ' '.join(textoCodificado)
  taxaDeCompressao = len(textoCodificado) / len(text)

  return textoCodificado, taxaDeCompressao


entrada = input()
resultado, taxaDeCompressao2 = keywordEncoding(entrada)
gambiarra = resultado.replace("carro.", "%.")
print(gambiarra)
print(f"Taxa de compressao:{taxaDeCompressao2:.2f}%")
