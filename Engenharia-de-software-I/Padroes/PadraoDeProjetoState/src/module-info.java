//PadraoDeProjetoState
//
//Descrição:
//Considere a seguinte situação. Um aplicativo simples de comunicação via web tem três estados: Online, Offline e Conectado. As seguintes operações podem variar a depender do estado do aplicativo: Fazer login, Conectar e Sair. A seguir é descrito o que acontece com cada operação a depender do estado. Implemente, usando o padrão de projeto State, a solução para essa situação. Mostre as mensagens usando “System.out.println”.
//
//- OFFLINE
//Fazer login: Apresenta mensagem “Fazendo login...” e muda o estado para Online;
//Sair: Apresenta a mensagem “Você não está online”;
//Conectar: Apresenta a mensagem “Impossível conectar, pois você está offline”; 
//
//- ONLINE
//Fazer login: Apresenta mensagem “Você já está online”;
//Sair: Apresenta a mensagem “Saindo...” e muda o estado para Offline;
//Conectar: Apresenta a mensagem “Conectando...” e muda o estado para Conectado; 
//
//- CONECTADO
//Fazer login: Apresenta mensagem “Você já está online”;
//Sair: Apresenta a mensagem “Desconectando...” e muda o estado para Online;
//Conectar: Apresenta a mensagem “Você já está conectado”;