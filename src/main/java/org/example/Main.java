package org.example;

import java.net.http.HttpClient;

public class Main {
    public static void main(String[] args) {
        HttpClient httpClient = HttpClient.newBuilder().
                version(HttpClient.Version.HTTP_2).build();

    }
}