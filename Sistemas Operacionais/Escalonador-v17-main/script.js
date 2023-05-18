//--------------------VARIAVEIS----------------------------------------------------------------------------------------------------------------------------------------------------------------
//--------------------INT------------------------
var contador = 0;
var numeroDeCoisas = 0;
let a = 0;
let b = 0;
//--------------------VECTOR---------------------
var nodes = [];
//--------------------BOOLEAN--------------------
var pause = false;
var criado = false;
var primeiraVez = false; // ( ͡° ͜ʖ ͡°) //
var FUNCIONANDO = false;
//--------------------VAZIAS---------------------
var matriz;
var tipoDeMemoria;
var simulacao;
var turnArround;
var ID;
//--------------------SCRIPTS BASICOS----------------------------------------------------------------------------------------------------------------------------------------------------------------

function processInfo(nodes, Algoritimo) {
    quantum = document.getElementById("entradaDeQuantum").value
    sobrecarga = document.getElementById("entradaDeSobrecarga").value
    numeroDePaginas = document.getElementById("entradaDeQuantidadeDePaginas").value
    tempoDeIO = document.getElementById("entradaDeTempoDeIO").value
    tipoDeMemoria = document.getElementById('entradaEscalonamentoDePaginas').value
    processos = []
    for(var i in nodes) {
        processos.push({
            idNome:parseInt(nodes[i]),
            id:parseInt(i),
            tempoDeChegada:document.getElementById("entradaDeTempoDeIO"+nodes[i]).value, 
            tempoDeExecucao:document.getElementById("entradaDeTempoDeExecucao"+nodes[i]).value, 
            deadline:document.getElementById("entradaDeDeadline"+nodes[i]).value, 
            tempoTotal:0,
            priority:0,
            noIO:false,
            naFilaDeIO:false,
            existe:false
        });
    }
    if(tipoDeMemoria == "FIFO" ) {
        memoria = new MemoriaFIFO(numeroDePaginas, processos.length)
    }
    if(tipoDeMemoria == "MRU" ) {
        memoria = new MemoriaMRU(numeroDePaginas, processos.length)
    }
    if(Algoritimo == "FIFO" ) {
        simulacao = new SimulacaoFIFO(processos, memoria, tempoDeIO, quantum, sobrecarga)
    }  
    if(Algoritimo == "EDF" ) {
        simulacao = new SimulacaoEDF(processos, memoria, tempoDeIO, quantum, sobrecarga)
    }
    if(Algoritimo == "SJF" ) {
        simulacao = new SimulacaoSJF(processos, memoria, tempoDeIO, quantum, sobrecarga)
    }
    if(Algoritimo == "ROUND" ) {
        simulacao = new SimulacaoROUND(processos, memoria, tempoDeIO, quantum, sobrecarga)
    }
}


function CriarTabelaDeMemoriaVirtual(paginas) {
    for (let i = 0; i < (nodes.length); i++) {
        tr = document.createElement('tr');
        tr.setAttribute('class',"shedule-mem-v");
        tr.setAttribute('align',"center");

        
        num = document.createElement('td');
        num.innerHTML = "P"+nodes[i];
        num.style.fontSize = '15pt';
        
        tr.appendChild(num);

        for(let j = 0; j<paginas; j++ ) {
            td = document.createElement('td');
            td.setAttribute('id', "celula" + ((parseInt(paginas)*parseInt(i))+parseInt(j)));
            td.setAttribute('align', "center");
            td.setAttribute('width', "5px");
            span = document.createElement('span');
            td.style.position = 'relative';
            span.style.position = 'absolute';
            span.style.top = '0px';
            span.style.left = '3px';
            span2 = document.createElement('span');
            span2.setAttribute('id', "span" + ((parseInt(paginas)*parseInt(i))+parseInt(j)));
            span2.innerHTML = '-';
            td.style.fontSize = '12pt';
            td.style.minWidth = '40px';
            td.style.maxWidth = '40px';
            span.style.fontSize = '8pt';
            span.innerHTML = i*parseInt(paginas) + j ;
            td.appendChild(span);
            td.appendChild(span2);
            tr.appendChild(td);
        }
        document.getElementById('primeiraLinhaDaMemoriaVirtual').setAttribute('colspan', paginas + 1);
        document.getElementById('memoriaVirtual').appendChild(tr);
    }
}
function criarTabelaDeMemoriaReal() {   
    for (let i = 0; i < 50; i++) {
        td = document.createElement('td');
        td.setAttribute('align',"center");
        td2 = document.createElement('td');
        td2.setAttribute('align',"center");
        td2.setAttribute('class', "replaceMem");
        td2.setAttribute('id', "real"+i);
        td.style.fontSize = "8pt";
        td.innerHTML = i;
        td.style.backgroundColor = "lightgrey";
        td2.innerHTML = "-";
        td2.style.fontSize = "13pt";
        td2.style.minWidth = "60px";
        td2.style.maxWidth = "60px";
        document.getElementById('primeiraLinhaDaMemoriaReal').appendChild(td);
        document.getElementById('segundaLinhaDaMemoriaReal').appendChild(td2);
    }
}

function deleteno(id) {
    x = nodes.indexOf(id); 
    aux = document.getElementsByClassName("form-group execucaoFluid removivel")[x];
    document.getElementById("process").removeChild(aux);
    aux = document.getElementsByClassName("form-group ProcessosFluid delete-button")[x];
    document.getElementById("process").removeChild(aux); 
    aux = document.getElementsByClassName("intdiv")[x];
    document.getElementById("process").removeChild(aux);  
    aux = document.getElementById("linha"+id);
    document.getElementById('tabela').removeChild(aux);
    graf = document.getElementById('grafico').style.height;
    graf.replace("px", '');
    graf = parseInt(graf);
    if(graf>200) {
        graf -= 30;
        document.getElementById('grafico').style.height = graf+"px";
    }
    nodes.splice(x, 1);
}

function show(id) {
    x = nodes.indexOf(id); 
    aux = document.getElementsByClassName("intdiv")[x];
    var height;
    var id;
    if(aux.style.height == "0px") {
        height = 0;
        id = setInterval(quadro, 5);
        function quadro() {
            if (height == 210) {
                limparIntervalo(id);
            } 
            else {
                height+=5; 
                aux.style.height = height + 'px'; 
                aux.style.height = height + 'px'; 
            }
        }
    }
    else {
        height = 210;
        id = setInterval(quadro, 5);
        function quadro() {
            if (height == 0) {
                limparIntervalo(id);
            } 
            else {
                height-=5; 
                aux.style.height = height + 'px'; 
                aux.style.height = height + 'px'; 
            }
        }
    }    
}

function pausarSimulacao() {
    pause = true;    
    $('#botaoPausar').attr("disabled" , true);
    $('#botaoLimpar').attr("disabled", false);
    $('#iniciarSimulacao').attr("disabled", false);
}

function quadro() {
    if(!pause) {
        informations = simulacao.simularTempo();
        FUNCIONANDO = true;
    }     
    else {
        limparIntervalo(ID);
        FUNCIONANDO = false;
    }
       
    if(informations == null) {
        pause = true;
        limparIntervalo(ID);
        document.getElementById('iniciarSimulacao').setAttribute('disabled',"true");
        document.getElementById('botaoPausar').setAttribute('disabled',"true");
        $('#botaoLimpar').attr("disabled", false);
    }
    if(!pause) {
        numTime = document.createElement('td');
        numTime.setAttribute('class',"square");
        numTime.innerHTML = numeroDeCoisas;
        numTime.setAttribute('align', "center");
        document.getElementById('nomes-tabela').appendChild(numTime);
        numeroDeCoisas++;        
        excluirAFilaDeProcessos();
        for (b ; b < informations.column.length; b++) {
            if(pause)
                break; 
            atualTr = document.getElementById("linha" + nodes[b]);
            newCol = document.createElement('td');
            newCol.setAttribute('class',"square");
            newCol.style.height = "30px";
            newCol.style.width = "30px";
            newCol.style.border = "solid 5px lightgrey";
            if(informations.column[b] == 'D' ) {
                newCol.style.backgroundColor = "gray";
                spanIO = document.createElement('span');
                spanIO.style.backgroundColor = "gray";
                spanIO.setAttribute('class',"processo-principal");
                spanIO.innerHTML = $(atualTr).first()[0].innerHTML;
                document.getElementById('IODoProcess').appendChild(spanIO);
            }
            if(informations.column[b] == 'E' ) {
                newCol.style.backgroundColor = "rgb(64, 224, 32)";
                spanEXEC = document.createElement('span');
                spanEXEC.style.backgroundColor = "rgb(64, 224, 32)";
                spanEXEC.setAttribute('class',"processo-principal");
                spanEXEC.innerHTML = $(atualTr).first()[0].innerHTML;
                document.getElementById('processoExecutando').appendChild(spanEXEC);
            }
            if(informations.column[b]=='L' ) {
                newCol.style.backgroundColor = "rgb(132, 201, 116)";
                spanEXEC = document.createElement('span');
                spanEXEC.style.backgroundColor = "rgb(64, 224, 32)";
                spanEXEC.setAttribute('class',"processo-principal");
                spanEXEC.innerHTML = $(atualTr).first()[0].innerHTML;
                document.getElementById('processoExecutando').appendChild(spanEXEC);
            }
            if(informations.column[b]=='X') {
                newCol.style.backgroundColor = "rgb(198, 73, 73)";
            }
            if(informations.column[b]=='-') {
                newCol.style.backgroundColor = "rgb(252, 241, 67)";
            }
            if(informations.column[b]=='Q') {
                newCol.style.backgroundColor = "lightgray";  
            }
            atualTr.appendChild(newCol);       
            var maxScrollLeft = document.getElementById('grafico').scrollWidth - document.getElementById('grafico').clientWidth;
            $('#grafico').scrollLeft(maxScrollLeft);
            document.getElementById('turnaround').innerHTML = "Turnaround médio = " + informations.ta;
            
        }
        for(let x=0; x<informations.vm.length; x++ ) {
            let celula = document.getElementById('celula'+x);
            let spanDentroDaCelula = document.getElementById('span'+x);
            if(informations.vm[x]==null) {                
                if(spanDentroDaCelula.innerHTML != '-' ) {
                    celula.style.backgroundColor = 'gray'
                    celula.style.color = 'white'
                }
                else {
                    celula.style.backgroundColor = 'transparent'
                    celula.style.color = 'black' 
                }
                spanDentroDaCelula.innerHTML = '-';
            }    
            else {
                spanDentroDaCelula.innerHTML = informations.vm[x];
            }            
        }
        for(let x=0; x<informations.rm.length; x++) {
            if(informations.rm[x]==null) {
                document.getElementById("real"+(x)).innerHTML = '-';
            }
            else {
                document.getElementById("real"+(x)).innerHTML = informations.rm[x];
            }
        }
        turnArround = informations.ta;  
        for(let i in informations.exec) {
            tdFilaDeExecucao = document.createElement('td');
            tdFilaDeExecucao.setAttribute('class', "secundarios")
            filaDeExtensaoExecutavel = document.createElement('span');
            filaDeExtensaoExecutavel.setAttribute('class',"processoSecundario");
            filaDeExtensaoExecutavel.style.backgroundColor = "rgb(221, 207, 42)";
            filaDeExtensaoExecutavel.innerHTML = "P" + informations.exec[i].idNome;
            tdFilaDeExecucao.appendChild(filaDeExtensaoExecutavel);
            document.getElementById('listaDeExecucao').appendChild(tdFilaDeExecucao);
        }
        for(let i = 1; i < informations.io.length; i++) {
            tdFilaDeExecucao = document.createElement('td');
            tdFilaDeExecucao.setAttribute('class', "secundarios")
            filaDeExtensaoExecutavel = document.createElement('span');
            filaDeExtensaoExecutavel.setAttribute('class',"processoSecundario");
            filaDeExtensaoExecutavel.style.backgroundColor = "lightgray";
            filaDeExtensaoExecutavel.innerHTML = "P"+informations.io[i].idNome;
            tdFilaDeExecucao.appendChild(filaDeExtensaoExecutavel);
            document.getElementById('listaDeIO').appendChild(tdFilaDeExecucao);
        }
    }      
    b = 0;   
}

function VelocidadeDeExecucao() {
    if(FUNCIONANDO) {
        limparIntervalo(ID);
        ID = setInterval(quadro,  1000 - document.getElementById('velocidadeExecucao').value);
    }    
}

function excluirAFilaDeProcessos() {
    let trIO = document.getElementById('listaDeIO');
    let trEXE = document.getElementById('listaDeExecucao');
    let tdIO = document.getElementById('IODoProcess');
    let tdEXE = document.getElementById('processoExecutando');
    if(tdIO.childNodes.length > 0 ) {
        tdIO.removeChild(tdIO.childNodes[0]);
    }
    if(tdEXE.childNodes.length > 0 ) {
        tdEXE.removeChild(tdEXE.childNodes[0]);
    }
    $('.secundarios').remove()
}

function iniciarASimulacao(Algoritimo) {    
    $('#iniciarSimulacao').attr("disabled", true);
    $('.botaoRemover').css("display" , "none");
    $('body :input').attr("disabled" , true);
    $('#botaoPausar').attr("disabled" , false);
    $('#botaoLimpar').attr("disabled", true);
    $('.button-process').attr("disabled", false);
    $('#velocidadeExecucao').attr("disabled", false);
    pause = false;
    if(!criado) {
        criarTabelaDeMemoriaReal()
        CriarTabelaDeMemoriaVirtual(document.getElementById("entradaDeQuantidadeDePaginas").value);
        criado = true;
    }
    if(primeiraVez == false) {
        processInfo(nodes, Algoritimo);
        primeiraVez = true;
    } 
    quadro();
    document.getElementById('botaoInserirProcesso').setAttribute('disabled', "true");
    ID = setInterval(quadro, 1000 - document.getElementById('velocidadeExecucao').value);
}

function limparDados() {
    pause = true;
    $('.square').remove();
    $('.botaoRemover').css("display" , "block");
    $('body :input').attr("disabled" , false);
    $('#botaoPausar').attr("disabled", true);
    $('#botaoLimpar').attr("disabled", true);
    $('#iniciarSimulacao').attr("disabled", false);
    $('.shedule-mem-v').remove();
    $('.replaceMem').html('-');
    $('#turnaround').html('Tunraround médio = ...');
    excluirAFilaDeProcessos();
    primeiraVez = false;
    criado = false;
    a, b, numeroDeCoisas = 0;
}

function inserirProcesso() {
    var i3 = document.createElement("div");
    i3.setAttribute('class', "form-group execucaoFluid removivel");
    i3.setAttribute('style',"margin-bottom: 0px;");
    if(nodes.length == 0) {
        contador = 1;
    }
    else {
        min = 0;
        for (let i = 0; i < nodes.length; i++) {
           if(nodes[i]>=min) {
             min = nodes[i];  
           } 
        }
        contador = min+1;
    }
    var botao = document.createElement("input");
    botao.setAttribute('value', "Processo " + contador);
    botao.setAttribute('type', "button");
    botao.setAttribute('onClick', "show(" + contador+")");
    botao.setAttribute('style', "opacity: 0;");
    botao.setAttribute('class', "col-12 button-process");
    i3.appendChild(botao);
    var opacity = 0;
    var idOpa = setInterval(quadro, 30);
    function quadro() {
        if (botao.style.opacity == "1") {
            limparIntervalo(idOpa);
        } 
        else {
            opacity += 0.1; 
            botao.style.opacity = opacity;
        }
    }
    var i2emeio = document.createElement("div");
    i2emeio.setAttribute('class', "intdiv");
    i2emeio.setAttribute('style',"margin: -10px 0px 10px 5px;");
    var i2 = document.createElement("div");
    i2.setAttribute('class', "form-row");
    var i = document.createElement("div");
    i.setAttribute('class',"form-group col-sm-5");
    var p = document.createElement("label");
    p.setAttribute('for', "nsei");
    p.innerHTML = "<br>Chegada";
    var t = document.createElement("input");
    t.setAttribute('type', "number");
    t.setAttribute('class', "form-control ajuste");
    t.setAttribute('min', "0");
    t.setAttribute('id', "entradaDeTempoDeIO" + parseInt(contador));//
    t.setAttribute('value', "0");
    i.appendChild(p);
    i.appendChild(t);
    i2.appendChild(i);
    //
    i = document.createElement("div");
    i.setAttribute('class',"form-group col-sm-5");
    p = document.createElement("label");
    p.setAttribute('for', "nsei");
    p.innerHTML = "<br>Tempo";
    t = document.createElement("input");
    t.setAttribute('type', "number");
    t.setAttribute('class', "form-control ajuste");
    t.setAttribute('min', "0");
    t.setAttribute('id', "entradaDeTempoDeExecucao"+parseInt(contador));//
    t.setAttribute('value', "0");
    i.appendChild(p);
    i.appendChild(t);
    i2.appendChild(i);
    i2emeio.appendChild(i2);
    document.getElementById('parametrosBasicos').appendChild(i3);
    i2.appendChild(i);
    //
    i = document.createElement("div");
    i.setAttribute('class',"form-group col-sm-5");
    p = document.createElement("label");
    p.setAttribute('for', "nsei");
    p.innerHTML = "<br>Deadline";
    t = document.createElement("input");
    t.setAttribute('type', "number");
    t.setAttribute('class', "form-control ajuste");
    t.setAttribute('min', "0");
    t.setAttribute('id', "entradaDeDeadline"+parseInt(contador));
    //
    t.setAttribute('value', "0");
    i.appendChild(p);
    i.appendChild(t);
    i2.appendChild(i);
    //
    i2emeio.appendChild(i2);
    i2emeio.style.overflowY = "hidden";
    i2emeio.style.overflowX = "hidden";
    i2emeio.style.height = "0px";
    i = document.createElement("div");
    i.setAttribute('class',"form-group processosFluid delete-button");
    i.setAttribute('style',"position: relative;");    
    t = document.createElement("button");
    t.setAttribute('type', "button");
    t.setAttribute('class', "botaoRemover btn btn-primary");
    t.setAttribute('style', "height: 43px !important; top: 0px; position: absolute;");
    t.setAttribute('onClick', "deleteno("+contador + ")");
    t.innerHTML = "X";
    i.appendChild(t);
    document.getElementById('process').appendChild(i3);
    document.getElementById('process').appendChild(i);
    document.getElementById('process').appendChild(i2emeio);
    item = document.createElement('tr');
    item.setAttribute('id', "linha"+contador);
    item.style.border = "solid 5px lightgrey";
    itemCol = document.createElement('td');
    itemCol.setAttribute('width', "76.4px")
    itemCol.setAttribute('align', "center");
    itemCol.innerHTML = 'P'+contador;
    item.appendChild(itemCol);
    atualHeight = document.getElementById('grafico').style.height;
    if (atualHeight == "") atualHeight = 200;
    else {    
        atualHeight.replace('px','');
        atualHeight = parseInt(atualHeight);
    }
    if(atualHeight <= ((nodes.length+2)*35) ) {
        atualHeight += 35;
        document.getElementById('grafico').style.height = atualHeight + "px";
    }
    document.getElementById('tabela').appendChild(item);
    nodes.push(contador);    
}

//--------------------MEMORIA----------------------------------------------------------------------------------------------------------------------------------------------------------------
class Memoria {
	constructor(numeroDePaginas) {
        this.memoriaReal = Array(50).fill(null)
        this.ponteiro = 0
        this.numeroDePaginas = numeroDePaginas
    }
    referencePages(numeroDoProcesso, tempoPercorrido ) {}
    botador(oNumeroDoProcesso) {}
    PonteiroDeIncremento() {
    	this.ponteiro++
    	if(this.ponteiro == 50) {
    		this.ponteiro = 0
    	}
    }   
    temTodasAsPaginas(oNumeroDoProcesso) {
    	for (var i = oNumeroDoProcesso*(this.numeroDePaginas); i < (oNumeroDoProcesso+1)*this.numeroDePaginas; i++ ) {
    		if(this.memoriaVirtual[i] == null) {
    			return false
    		}
    	}
    	return true
    }
}

class MemoriaFIFO extends Memoria {
    constructor(numeroDePaginas, nProcessos) {
        super(numeroDePaginas)
        this.memoriaVirtual = Array(nProcessos*numeroDePaginas).fill(null)
        this.filaFIFO = []
    }
    botador(oNumeroDoProcesso, numeroAtual) {
    	for (var i = (oNumeroDoProcesso) * (this.numeroDePaginas); i < (oNumeroDoProcesso+1)*this.numeroDePaginas; i++) {
            if(this.memoriaVirtual[i] == null) {
                this.filaFIFO.push(i)
                if(this.memoriaReal[this.ponteiro] == null) {
                    this.memoriaVirtual[i] = this.ponteiro
                    this.memoriaVirtual[this.memoriaReal[this.ponteiro]] = null
                    this.memoriaReal[this.ponteiro] = i
                    this.PonteiroDeIncremento()
                }
                else {
                    let aux = []
                    while(parseInt(this.filaFIFO[0]/this.numeroDePaginas) == numeroAtual || parseInt(this.filaFIFO[0]/this.numeroDePaginas) == oNumeroDoProcesso) {
                        aux.push(this.filaFIFO[0])
                        this.filaFIFO.splice(0, 1)
                    }
                    let victmPage = this.filaFIFO[0]
                    let quadro = this.memoriaVirtual[victmPage]
                    this.memoriaVirtual[victmPage] = null
                    this.memoriaVirtual[i] = quadro
                    this.memoriaReal[quadro] = i
                    this.filaFIFO.splice(0, 1)
                    this.filaFIFO = aux.concat(this.filaFIFO)
                }
    		}            
    	}  	
    }

}

class MemoriaMRU extends Memoria {
	constructor(numeroDePaginas, nProcessos) {
		super(numeroDePaginas)
        this.memoriaVirtual = Array(nProcessos*this.numeroDePaginas).fill(null)
        this.contadorDeReferencias = Array(nProcessos*this.numeroDePaginas).fill(0)
	}

    referencePages(oNumeroDoProcesso, tempoPercorrido) {
        let firstPage = (oNumeroDoProcesso) * (this.numeroDePaginas)
        for(var i=0; i < this.numeroDePaginas; i++) {
            this.contadorDeReferencias[parseInt(firstPage)+parseInt(i)] = tempoPercorrido;
        }
    }

    enontrarContagemMinima(oNumeroDoProcesso, numeroAtual) {
        let min = Infinity
        let chosen = null
        for(var i=0; i < this.memoriaReal.length; i++) {            
            let owner = parseInt(this.memoriaReal[i]/this.numeroDePaginas)
            let oContadorDeReferencia = this.contadorDeReferencias[this.memoriaReal[i]]
            if(owner != oNumeroDoProcesso && owner != numeroAtual && oContadorDeReferencia < min) {
                min = this.contadorDeReferencias[this.memoriaReal[i]]
                chosen = this.memoriaReal[i]
            }
        }
        return chosen
    }

    botador(oNumeroDoProcesso, numeroAtual) {
        let firstPage = (oNumeroDoProcesso)*this.numeroDePaginas

        for (var i = 0; i < this.numeroDePaginas; i++) {
            let aPaginaAtual = parseInt(firstPage)+parseInt(i)

            if(this.memoriaVirtual[aPaginaAtual] == null) {
                if(this.memoriaReal[this.ponteiro] == null ) {

                    this.memoriaVirtual[aPaginaAtual] = this.ponteiro
                    this.memoriaVirtual[ this.memoriaReal[this.ponteiro] ] = null
                    this.memoriaReal[this.ponteiro] = aPaginaAtual
                    this.PonteiroDeIncremento()
                }
                else {
                    let victmPage = this.enontrarContagemMinima(oNumeroDoProcesso, numeroAtual)
                    let quadro = this.memoriaVirtual[victmPage]
                    this.memoriaVirtual[victmPage] = null
                    this.memoriaVirtual[aPaginaAtual] = quadro
                    this.memoriaReal[quadro] = aPaginaAtual
                }
            }
        }
    }
}

//--------------------SIMULACOES----------------------------------------------------------------------------------------------------------------------------------------------------------------
function getTempoDeExecucaoMaxima(processos) {
    execucaoMaxima = processos[0].tempoDeExecucao
    for(var i in processos) {
        if(processos[i].tempoDeExecucao > execucaoMaxima) {
            execucaoMaxima = processos[i].tempoDeExecucao
        }
    }
    return execucaoMaxima
}

class FilaNormal {
    constructor( ) {
        this.arr = []
        this.length = 0
    }
    fila(a) {
        if(a != null) {
            this.arr.push(a)
            this.length++
        }        
    }
    deFila() {
        if(this.arr.length > 0) {
            this.length--
            return this.arr.shift()
        }
    }
    procurar() {
        return this.arr[0]
    }
}

class Simulacao {
    constructor(processos, memoriaDoAlgoritimo, tempoDeIO, quantum, sobrecarga) {
        this.processos = processos
        this.memoria = memoriaDoAlgoritimo
        this.tempoDeIO = tempoDeIO
        this.tempoDeIOUsado = this.tempoDeIO
        this.atual = null
        this.tempoPercorrido = 0
        this.contador = processos.length
        this.filaDeTempoDeIO = new FilaNormal()
        this.quantum = quantum
        this.sobrecarga = sobrecarga
        this.overloadUsado = sobrecarga
        this.quantumUsado = quantum
        this.preemption = false
        this.increment = (1/(processos.length+1))
    }

    simulate() {
        var matrix = []
        let turn = 0
        while(true) {
            var x = this.simularTempo()
            if(x == null) break;
            matrix.push(x.column)
            turn = x.ta
        }
        console.log("TurnAround Médio = "+turn)
        return matrix
    }

    simularTempo() {
        this.checkArrived()
        this.atualizarInformacoesdeInicializacao()

        let turnAround = 0
        let contador = 0
        for(var i=0; i < this.processos.length; i++ ) {
            if(this.tempoPercorrido >= this.processos[i].tempoDeChegada) {
                turnAround = parseInt(turnAround) + parseInt(this.processos[i].tempoTotal)
                contador++;
            }
        }
        if(contador != 0) {
            turnAround = turnAround/contador
        }
        if(this.contador <= 0) {
            return null
        }
        if(this.overloadUsado <= 0 && this.quantumUsado <= 0) {
            this.preemption = false
        }
        if(this.quantumUsado <= 0) {
            this.preemption = true
        }
        if(this.tempoDeIOUsado <= 0) {
            this.tempoDeIOUsado = this.tempoDeIO
            let x = this.filaDeTempoDeIO.deFila()
            x.naFilaDeIO = false
            if(x != null) {
                x.noIO = false
                if(this.atual != null && this.preemption == false) {
                    this.memoria.botador(x.id, this.atual.id)
                }
                else {
                    this.memoria.botador(x.id, -1)
                }
                this.aFilaTaPronta.fila(x)
            }      
        }            
        if(this.overloadUsado <= 0 && this.quantumUsado <= 0 ) {
            this.preemption = false
            this.overloadUsado = this.sobrecarga
            this.quantumUsado = this.quantum
            if(this.atual != null ) {
                this.aFilaTaPronta.fila(this.atual)
            }            
            this.atual = null
        }
        if(this.quantumUsado <= 0 ) {
            this.preemption = true
            this.overloadUsado--
        }
        if(this.preemption == false ) {
            if(this.atual == null ) {
                let contadorAuxiliar = 0;
                while(this.aFilaTaPronta.length != 0 ) {
                    var x = this.aFilaTaPronta.deFila()
                    this.memoria.referencePages(x.id, this.tempoPercorrido + contadorAuxiliar)
                    if(this.memoria.temTodasAsPaginas(x.id) ) {
                        this.atual = x
                        break
                    }
                    else {
                        this.filaDeTempoDeIO.fila(x)
                        x.naFilaDeIO=true
                        contadorAuxiliar += this.increment
                    }
                }
            }
            if(this.atual != null ) {                
                this.atual.tempoDeExecucao--
            }
        }
        if(this.filaDeTempoDeIO.length != 0 ) {
            this.tempoDeIOUsado--
            this.filaDeTempoDeIO.procurar().noIO = true
        }
        let colunaAtual = this.createColumn(this.preemption, this.atual)
        if(this.atual != null && this.atual.tempoDeExecucao == 0 ) {            
            this.quantumUsado = this.quantum
            this.atual.existe = false
            this.atual = null
            this.contador--
        }
        if (this.atual != null && this.preemption == false && this.atual.noIO == false ) {
            this.quantumUsado--
        }
        this.tempoPercorrido++
        let aFilaDeIO = this.filaDeTempoDeIO.arr
        let aFilaDeExecucao = this.aFilaTaPronta.arr;
        return {column:colunaAtual, rm:this.memoria.memoriaReal, vm:this.memoria.memoriaVirtual, ta:turnAround, io:aFilaDeIO, exec:aFilaDeExecucao}
    }

    checkArrived() {
        for(var i in this.processos) {
            
            if(this.processos[i].tempoDeChegada == this.tempoPercorrido) {
                if(this.processos[i].tempoDeExecucao == 0 ) {
                    this.contador--
                    break;
                }
                this.processos[i].existe = true
                this.aFilaTaPronta.fila(this.processos[i])
            }
        }
    }

    atualizarInformacoesdeInicializacao() {
        for(var i in this.processos ) {
            if(this.processos[i].existe) {
                this.processos[i].tempoTotal++
            }
        }
    }

    createColumn(isPreemption, atual) {
        var column = []
        var value
        for(var i in this.processos) {
            if(this.atual == this.processos[i]) {
                if(isPreemption == true) {
                    value = "X"
                }
                else {
                    if(this.atual.deadline < 0) {
                        value = "L"
                    }
                    else {
                        value = "E"
                    }
                }                
            }
            else if (this.processos[i].existe) {
                value = "-"
            }
            else {
                value = " "
            }
            if(this.processos[i].existe) {
                if(this.processos[i].naFilaDeIO)
                    value = "Q"
                if(this.processos[i].noIO)
                    value = "D"
            }
            column.push(value)
        }
        return column
    }
}

class SimulacaoFIFO extends Simulacao {
    constructor(processos, memoriaDoAlgoritimo, tempoDeIO, quantum, sobrecarga) {
        super(processos, memoriaDoAlgoritimo, tempoDeIO, quantum, sobrecarga)
        this.aFilaTaPronta = new FilaNormal() 
        this.quantum = getTempoDeExecucaoMaxima(processos) + 1
        this.quantumUsado = this.quantum
        this.sobrecarga = 0       
    }
}

class FilaDePriorridade {
    constructor(comparadorDeFuncao ) {
        this.arr = []
        this.length = 0
        this.comparadorDeFuncao = comparadorDeFuncao
    }
    fila(a) {
        if(a != null ) {
            for(var i=0; i < this.arr.length; i++) {
                if(this.comparadorDeFuncao(a,this.arr[i]) < 0 ) {
                    this.arr.splice(i, 0, a);
                    this.length++
                    return;
                }
            }
            this.arr.push(a)
            this.length++
        }
    }
    deFila() {
        if(this.arr.length > 0) {
            this.length--
            return this.arr.shift()
        }
    }
    procurar() {
        return this.arr[0]
    }
}

class SimulacaoSJF extends Simulacao{
    constructor(processos, memoriaDoAlgoritimo, tempoDeIO, quantum, sobrecarga ) {
        super(processos, memoriaDoAlgoritimo, tempoDeIO)

        this.compararFncao = function(a,b)
        {
           if(a.tempoDeExecucao != b.tempoDeExecucao ) {
               return a.tempoDeExecucao - b.tempoDeExecucao
           }
           else if(a.tempoDeChegada != b.tempoDeChegada ) {
               return a.tempoDeChegada - b.tempoDeChegada
           }
           else {
                return a.id - b.id
           }
        }
        this.aFilaTaPronta = new FilaDePriorridade(this.compararFncao)
        this.quantum = quantum = getTempoDeExecucaoMaxima(processos) + 1
        this.quantumUsado = this.quantum
        this.sobrecarga = 0 
    }
} 

class SimulacaoROUND extends Simulacao{
    constructor(processos, memoriaDoAlgoritimo, tempoDeIO, quantum, sobrecarga ) {
        super(processos, memoriaDoAlgoritimo, tempoDeIO, quantum, sobrecarga)
        this.aFilaTaPronta = new FilaNormal()
    }
}

class SimulacaoEDF extends Simulacao{
    constructor(processos, memoriaDoAlgoritimo, tempoDeIO, quantum, sobrecarga ) {
        super(processos, memoriaDoAlgoritimo, tempoDeIO, quantum, sobrecarga)
        this.compararFncao = function(a,b)
        {
            return a.deadline - b.deadline
        }
        this.aFilaTaPronta = new FilaDePriorridade(this.compararFncao)
    }
    atualizarInformacoesdeInicializacao( ) {
        super.atualizarInformacoesdeInicializacao()
        for(var i in this.processos ) {
            if(this.processos[i].existe ) {                
                this.processos[i].deadline -= 1;
            }
        }
    }
}