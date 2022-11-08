/**
 * 
 */
/**
 * @author tcout
 *
 */
module PadraoDeProjetoObserver {
}

/*

Considere que você tem o código parcial de um sistema de monitoramento 
de valores de títulos públicos. 

Considere que você tem uma classe Titulo. 

Cada título tem 
	um código, 
	valor de compra, 
	valor de venda, 
	tipo, 
	data vencimento, 
	data lançamento. 

Toda vez que os valores são alterados, ele deve ser alterado em sistemas de 
visualização sites: 
	Google, 
	Uol, 
	GGN etc.  

Considere que você tem uma classe para cada site. 

Como atualização de cada site, apenas mostre no console o nome do site, 
e todos os dados do título que foi alterado. 

Implemente essa situação usando o padrão Observer. 

Crie uma classe ExemploMonitoramento, que tenha o método “main”, onde você instanciará os objetos e implementará exemplos de alteração de valores. 

Crie objetos para mais de um título. 

No mínimo três títulos. 

Crie apenas um objeto para cada site (Google, UOL, GGN). 

Faça com que cada título tenha uma lista diferente de sites interessados. 

Por exemplo, um título tem o interesse do UOL e do Google, outro título, do GGN, outro dos três sites, etc.

*/