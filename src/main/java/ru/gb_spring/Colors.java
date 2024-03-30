package ru.gb_spring;
import org.apache.commons.lang3.builder.ToStringBuilder;
/**
 * Подцветка текста в консоли
 */
public enum Colors {
    RESET("\033[0m"),
    RED("\033[0;31m"),
    GREEN("\033[0;32m"),
    YELLOW("\033[0;33m"),
    BLUE("\033[0;34m"),
    MAGENTA("\033[0;35m");

    private final String code;

    Colors(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append(code)
                .toString();
    }
}
