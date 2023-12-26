package ru.netology.domain;

public class PosterManager {
    private String[] movies = new String[0]; // поле массива
    private int limit; // переменная для ограничения фильмов

    // КОНСТРУКТОРЫ
    public PosterManager() {
        this.limit = 5;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    // МЕТОДЫ

    public void addMovie(String movie) { // Добавление нового фильма
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() { // Вывод всех фильмов по порядку
        return movies;

    }

    public String[] findLast() { // Вывод последних фильмов
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}




