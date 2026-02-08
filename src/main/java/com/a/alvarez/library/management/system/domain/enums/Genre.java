package com.a.alvarez.library.management.system.domain.enums;

public enum Genre {

    ACTION("Acción"),
    ADVENTURE("Aventura"),
    BIOGRAPHY("Biografía"),
    CHILDREN("Infantil"),
    CLASSIC("Clásico"),
    COMEDY("Comedia"),
    CRIME("Crimen"),
    DRAMA("Drama"),
    EDUCATION("Educación"),
    ESSAY("Ensayo"),
    FANTASY("Fantasía"),
    FICTION("Ficción"),
    GRAPHIC_NOVEL("Novela gráfica"),
    HISTORICAL("Histórico"),
    HISTORY("Historia"),
    HORROR("Terror"),
    MYSTERY("Misterio"),
    NON_FICTION("No ficción"),
    PHILOSOPHY("Filosofía"),
    POETRY("Poesía"),
    PSYCHOLOGY("Psicología"),
    ROMANCE("Romance"),
    SCIENCE("Ciencia"),
    SCIENCE_FICTION("Ciencia ficción"),
    SELF_HELP("Autoayuda"),
    SPIRITUALITY("Espiritualidad"),
    TECHNOLOGY("Tecnología"),
    THRILLER("Suspenso"),
    YOUNG_ADULT("Juvenil"),
    UNKNOWN("Desconocido");

    private final String displayName;

    Genre(String displayName) {   // 👈 constructor del enum
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
