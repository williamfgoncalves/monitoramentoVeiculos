package br.com.crescer.monitorveiculos.controle;

import br.com.crescer.monitorveiculos.entidade.Cidade;
import br.com.crescer.monitorveiculos.servico.CidadeServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cidade")
public class CidadeControle {

    @Autowired
    private CidadeServico cidadeServico;

    //Todos Objetos Cidade
    @GetMapping(value = "/obtertodas")
    public Iterable<Cidade> pegarCidades() {
        return cidadeServico.listarCidades();
    }
    
    //Todos numrero de cidades
    @GetMapping(value = "/obternumerocidades")
    public Long pegarNumeroCidades(){
        return cidadeServico.totalCidades();
    }
    
    //obter numero de cidades com registros
    @GetMapping(value = "/cidadescomregistro") 
    public Long pegarNumeroCidadesComRegistros(){ 
        return cidadeServico.numeroCidadesComRegistros(); 
    } 
}
