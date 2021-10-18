package com.google.utils;

public enum LANGUAGES {
    HINDI("हिन्दी"),
    BENGAL("বাংলা"),
    TELUGU("తెలుగు"),
    MARATI("मराठी"),
    KANNADA("ಕನ್ನಡ"),
    ENGLISH("English"),
    INVALID("invalid");

    private final String value;

    LANGUAGES(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
