package br.com.leocr.server.model;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "number")
public class Number {

    private Integer number1;

    private Integer number2;

    private Integer number3;

    public Integer getNumber1() {
        return number1;
    }

    public void setNumber1(Integer number1) {
        this.number1 = number1;
    }

    public Integer getNumber2() {
        return number2;
    }

    public void setNumber2(Integer number2) {
        this.number2 = number2;
    }

    public Integer getNumber3() {
        return number3;
    }

    public void setNumber3(Integer number3) {
        this.number3 = number3;
    }

    @Override
    public String toString() {
        return "Number{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                ", number3=" + number3 +
                '}';
    }
}
