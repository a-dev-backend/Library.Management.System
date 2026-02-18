package com.a.alvarez.library.management.system.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ConsoleImputUtil {

    private static final Scanner scanner = new Scanner(System.in);
    private static final DateTimeFormatter[] FORMATTERS = {
            DateTimeFormatter.ofPattern("yyyy-M-d"),
            DateTimeFormatter.ofPattern("yyyy/M/d")
    };

    public ConsoleImputUtil() {
    }

    public static String readString(String message) {
        System.out.print(message);
        return scanner.nextLine().strip();
    }

    public static int readInt(String message) {
        while (true) {
            try {
                return Integer.parseInt(readString(message));
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
            }
        }
    }

    public static LocalDate readLocalDate(String message) {
        while (true) {
            String input = readString(message + " (yyyy-MM-dd): ");

            for (DateTimeFormatter formatter : FORMATTERS) {
                try {
                    return LocalDate.parse(input, formatter);
                } catch (DateTimeParseException ignored) {
                }
            }

            System.out.println("Invalid date format. Please use yyyy-MM-dd or yyyy/MM/dd.");
        }
    }
}
