package com.jam.example.paymentservice;

import java.io.Serializable;


//тип ошибки предназначен для отправки клиенту grpc

public class LastException extends Error  implements Serializable {
    //private final Logger log = LoggerFactory.getLogger(UploadSrv.class);

    public LastException(String message) {

        super(message);
    }
}