package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newBuilder().
                version(HttpClient.Version.HTTP_2).build();

        HttpRequest httpRequest = HttpRequest.newBuilder().
                uri(URI.create("https://api.monobank.ua/bank/currency")).build();

        HttpResponse<String> httpResponse = httpClient.
                send(httpRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status Cod: " + httpResponse.statusCode());



    }
}