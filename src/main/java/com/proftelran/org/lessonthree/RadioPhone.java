package com.proftelran.org.lessonthree;

public class RadioPhone extends Phone {
    private String radioModule;

    private void changeWave() {

    }

    @Override
    public void receiveCall() {
        changeWave();
        if (radioModule != null) {
            System.out.println("I am ready to get call");
        }
    }
}
