# ✈️ Agência de Viagens — Padrão de Projeto Facade
> Atividade prática da disciplina de **Padrões de Projeto**, aplicando o padrão **Facade** para simplificar o processo de reserva de viagem com múltiplos serviços.

---

## 📌 Sobre o projeto

Este projeto simula o sistema de reservas de uma agência de viagens, onde uma única chamada ao cliente é suficiente para disparar todas as etapas necessárias. Em vez de expor ao cliente a complexidade de cada serviço envolvido, utilizamos o **padrão Facade** para unificar tudo em uma interface simples e direta.

---

## 🎯 Objetivo

Aplicar o padrão **Facade** para:
- Simplificar o acesso a múltiplos subsistemas de reserva
- Ocultar a complexidade interna do processo de viagem
- Garantir que o fluxo de operações siga sempre a ordem correta

---

## 🧠 O Padrão Facade

O **Facade** é um padrão estrutural que fornece uma interface simplificada para um conjunto de interfaces de um subsistema. Em vez de o cliente precisar conhecer e orquestrar cada serviço individualmente, ele interage apenas com a fachada.
```
ViagemFacade.reservarViagem(cliente, destino)
  ├── 1. VooService         → reserva o voo
  ├── 2. HotelService       → reserva o hotel
  ├── 3. TransportService   → reserva o transporte
  ├── 4. ComprovanteService → gera o comprovante
  └── 5. NotificacaoService → envia a confirmação ao cliente
```

A `Main` não conhece nenhum subsistema — ela fala apenas com a `ViagemFacade`.

---

## 👨‍💻 Autor

Desenvolvido como atividade prática da disciplina de **Padrões de Projeto**.
