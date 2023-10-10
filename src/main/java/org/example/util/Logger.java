package org.example.util;

import java.time.LocalDateTime;

public class Logger implements Loggable{
    public Logger() {
    }

    @Override
    public void log(String message) {
        System.err.printf("%n%s : INFO Пользователь получил результат вычисления: %s%n", LocalDateTime.now(), message);
    }


}
