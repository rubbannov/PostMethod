package ru.netology.post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();

        post.name = "Сергей";
        post.surname = "Иванов";
        post.patronomic = "Петрович";
        post.passport = "4444 №444444";
        post.phone = "+7(900)123-45-67";
        post.subscription = true;
        post.birthday.day = 4;
        post.birthday.month = 3;
        post.birthday.year = 1990;
    }
}
