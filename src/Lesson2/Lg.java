package Lesson2;

import java.io.IOException;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*
 * Пример логера из семинара3
 *  */
public class Lg {
    public static void main(String[] args) throws IOException {

        // Создание экземпляра логгера
        Logger logger = Logger.getLogger(Lg.class.getName());

        // Указание пути к файлу логов
        String logsPath = "log.txt";

        // Создание обработчика файлов для записи логов
        FileHandler fh = new FileHandler(logsPath, true);
        FileHandler fh1 = new FileHandler("logsPath.txt", true);

        // Добавление обработчиков файлов в логгер
        logger.addHandler(fh);
        logger.addHandler(fh1);

        // Создание форматтера для записи логов в файл
        SimpleFormatter formatter = new SimpleFormatter();
        // XMLFormatter formatter = new XMLFormatter();

        // Установка форматтера для обработчиков файлов
        fh.setFormatter(formatter);
        fh1.setFormatter(formatter);

        // Создание генератора случайных чисел
        Random random = new Random();

        // Цикл для генерации случайных чисел и записи их в лог
        for (int i = 0; i < 10; i++) {
            int a = random.nextInt(10);
            logger.log(Level.INFO, "element: " + a);
        }

        // Запись сообщения в лог с уровнем WARNING
        logger.log(Level.WARNING, "logger off");

        // Запись сообщения в лог с уровнем INFO
        logger.info("test");

        // Запись сообщения в лог с уровнем WARNING
        logger.warning("logsPath");
    }
}

