bool inserirTarefa(List<Map<String, Object>> tarefas, String titulo, [int prioridade = 5]) {
  if (prioridade < 1) return false;

  tarefas.add(<String, Object>{'titulo': titulo, 'prioridade': prioridade});
  return true;
}