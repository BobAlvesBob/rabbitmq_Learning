package com.microservice.estoquepreco.connections;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.stereotype.Component;
import org.springframework.amqp.core.Queue;

@Component
public class RabbitMQConnection {

    private static final String NOME_EXCHANGE = "amq.direct";

    private Queue<String> fila(String nomeFila) {
        return new Queue<>(nomeFila, true, false, false);
    }
    private DirectExchange trocaDireta() {
        return new DirectExchange(NOME_EXCHANGE);
    }

}
