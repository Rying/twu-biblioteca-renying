package com.twu.biblioteca;

public enum MainMenu {
    LIST("List Books");
    private String content;

    MainMenu(String content) {
        this.content = content;
    }

    public static String menuContent() {
        return "1\t" + LIST.content + '\n';
    }
}
