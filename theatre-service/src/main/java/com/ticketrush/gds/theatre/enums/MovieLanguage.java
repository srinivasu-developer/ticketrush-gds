package com.ticketrush.gds.theatre.enums;

public enum MovieLanguage {

    HINDI("Hindi"),
    TELUGU("Telugu"),
    ENGLISH("English");

    private final String language;

    MovieLanguage(final String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}