package service;

import model.Reserva;

public class ComprovanteService {
    public Reserva gerarComprovante(String destino){
        System.out.println("Comprovante gerado");
        return new Reserva(destino, "RES 123");
    }
}