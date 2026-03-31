package service;

import model.Cliente;
import model.Reserva;

public class NotificacaoService {
    public void enviarConfirmacao(Cliente clinte, Reserva reserva){
        System.out.println("Confirmação enviada para " + clinte.getEmail() + " com código " + reserva.getCodigo());
    }
}