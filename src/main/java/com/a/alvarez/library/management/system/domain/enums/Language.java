package com.a.alvarez.library.management.system.domain.enums;

public enum Language {


    SPANISH("ES", "Español"),
    ENGLISH("EN", "Inglés"),
    FRENCH("FR", "Francés"),
    GERMAN("DE", "Alemán"),
    ITALIAN("IT", "Italiano"),
    PORTUGUESE("PT", "Portugués"),
    JAPANESE("JA", "Japonés"),
    CHINESE("ZH", "Chino"),
    KOREAN("KO", "Coreano"),
    RUSSIAN("RU", "Ruso"),
    ARABIC("AR", "Árabe"),
    UNKNOWN("UN", "Desconocido");

    private final String code;
    private final String displayName;

    Language(String code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }

    public String getCode() {
        return code;
    }

    public String getDisplayName() {
        return displayName;
    }
}
