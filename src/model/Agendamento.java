package model;

public class Agendamento {
    private Cliente cliente;
    private String data;
    private String horario;

    public Agendamento(Cliente cliente, String data, String horario){
        this.cliente = cliente;
        this.data = data;
        this.horario = horario;
    }

    @Override
    public String toString(){
        return cliente.getNome() + "-" + data + " ás " + horario;
    }
}
