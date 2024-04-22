def keywordDecoding(text, keywords):
  simbolos = {}
  for keyword, meaning in keywords.items():
    simbolos[meaning] = keyword
  textoDecodificado = ""
  words = text.split()
  for word in words:
    if word in simbolos:
      textoDecodificado += simbolos[word] + " "
    else:
      textoDecodificado += word + " "
  return textoDecodificado.strip()


tabelaDeSimbolos = {
  "carro": "%",
  "carro,": "%,",
  "carro.": "%.",
  "acidente": "$",
  "acidente,": "$,",
  "acidente.": "$.",
  "senhor": "&",
  "senhor.": "&.",
  "senhor,": "&,",
  "do": "#",
  "do.": "#.",
  "do,": "#,",
  "coitado": "coita#"
}

entrada = input()
resultado = keywordDecoding(entrada, tabelaDeSimbolos)
print(resultado)