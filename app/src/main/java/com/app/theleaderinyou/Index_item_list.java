package com.app.theleaderinyou;

public class Index_item_list {
    String chapter_num;
    String chapter_name;

    public Index_item_list(String chapter_num, String chapter_name) {
        this.chapter_num = chapter_num;
        this.chapter_name = chapter_name;
    }

    public String getChapter_num() {
        return chapter_num;
    }

    public void setChapter_num(String chapter_num) {
        this.chapter_num = chapter_num;
    }

    public String getChapter_name() {
        return chapter_name;
    }

    public void setChapter_name(String chapter_name) {
        this.chapter_name = chapter_name;
    }
}
