Enunciado: Sistema de Reservas de Viagem

Você foi contratado para desenvolver um sistema de reservas de viagem para uma agência de turismo. O sistema deve permitir aos clientes reservar diferentes tipos de pacotes de viagem, como "Pacote Luxo" e "Pacote Padrão". Cada pacote pode incluir diferentes serviços, como voo, hospedagem e passeios turísticos.

Requisitos:

1. Implemente o padrão de projeto Factory Method para criar instâncias dos diferentes pacotes de viagem (PacoteLuxo e PacotePadrao).

2. Crie uma interface PacoteViagem que contenha métodos para adicionar serviços como voo, hospedagem e passeios.

3. Implemente o padrão de projeto Abstract Factory para criar instâncias de diferentes serviços de viagem, como Voo, Hospedagem e Passeio.

4. Cada serviço de viagem deve implementar uma interface correspondente (ServicoVoo, ServicoHospedagem, ServicoPasseio) com métodos relacionados a esse serviço.

5. Implemente o padrão de projeto Singleton para garantir que haja apenas uma instância da agência de turismo responsável por gerenciar as reservas.

6. Crie um Adapter que permita que um serviço de voo seja usado como um serviço de transporte terrestre. Isso significa que o método agendar do serviço de voo será adaptado para ser usado na interface de transporte terrestre.

7. Crie um programa principal (Main) onde um cliente escolhe um pacote de viagem, seleciona os serviços desejados e faz uma reserva. A reserva deve ser processada corretamente, independentemente dos serviços escolhidos.

Dica: Concentre-se em definir as interfaces apropriadas, implementar as classes e organizar a estrutura do programa de acordo com os padrões de projeto mencionados.