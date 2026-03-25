package service;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.Agendamento;

public class BarbeariaService {
    private List <Agendamento> agendamentos = new ArrayList<>();

    public void agendar(Cliente cliente, String data, String horario){
        Agendamento agendamento =  new Agendamento(cliente, data, horario);
        agendamentos.add(agendamento);
    }

    public void ListarAgendamentos(){
          System.out.println();
        };
    }
