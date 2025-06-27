package com.example.mockito;

public class Service2 {
	private Repository2 repository;

    public Service2(Repository2 repository) {
        this.repository = repository;
    }

    public String processData() {
        String data = repository.getData();
        return "Processed " + data;
    }
}
