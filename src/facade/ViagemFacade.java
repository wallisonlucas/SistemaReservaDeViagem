package facade;

import model.Cliente;
import model.Reserva;
import service.*;

public class ViagemFacade {
    private VooService vooService;
    private HotelService hotelService;
    private TransporteService transporteService;
    private ComprovanteService comprovanteService;
    private NotificacaoService notificacaoService;

    public ViagemFacade(){
        this.vooService = new VooService();
        this.hotelService = new HotelService();
        this.transporteService = new TransporteService();
        this.comprovanteService = new ComprovanteService();
        this.notificacaoService = new NotificacaoService();
    }

    public Reserva reservasViagem(Cliente cliente, String destino){
        vooService.reservaVoo(destino);
        hotelService.reservaHotel(destino);
        transporteService.reservaTransporte(destino);
        Reserva reserva = comprovanteService.gerarComprovante(destino);
        notificacaoService.enviarConfirmacao(cliente, reserva);
        return reserva;
    }
}