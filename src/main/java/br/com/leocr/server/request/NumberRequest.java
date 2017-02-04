package br.com.leocr.server.request;

import br.com.leocr.server.model.Number;

import java.util.List;

public class NumberRequest {

    private List<Number> number;

    public List<Number> getNumber() {
        return number;
    }

    public void setNumber(List<Number> number) {
        this.number = number;
    }
}
