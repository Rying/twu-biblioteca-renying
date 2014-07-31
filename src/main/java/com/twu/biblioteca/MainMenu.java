package com.twu.biblioteca;

public enum MainMenu {
    LIST("List Books"), QUIT("Quit"), MOVIELIST("List Movies");
    private String content;

    MainMenu(String content) {
        this.content = content;
    }

    public static String menuContents() {
        return "1\t" + LIST.content + '\n'
                + "2\t" + QUIT.content + '\n'
                + "3\t" + MOVIELIST.content + '\n';
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
