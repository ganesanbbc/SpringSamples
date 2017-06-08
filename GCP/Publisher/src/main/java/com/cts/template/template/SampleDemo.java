package com.cts.template.template;


public class SampleDemo {

    private int tmpCounter;

    public void demoFunction() {
        tmpCounter = 10;
    }

    public int calculate(int action, int i1, int i2) {
        int result = 0;

        switch (action) {
            case 1:
                result = i1 + i2;
                break;
            case 2:
                result = i1 - i2;
                break;
        }
        return result;
    }
}
