import 'dart:io';

class Endereco {
  String? cep = null;
  String? cidade = null;
  Endereco(this.cep, this.cidade);
}

class Cliente {
  final String nome;
  Endereco? endereco = null;
  Cliente(this.nome, [this.endereco]);
}

String criaEtiqueta(Cliente cliente) {
  return '${cliente.nome} - CEP ${cliente.endereco?.cep null 'não informado'}';
}