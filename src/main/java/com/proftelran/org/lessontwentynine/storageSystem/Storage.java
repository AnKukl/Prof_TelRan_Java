package com.proftelran.org.lessontwentynine.storageSystem;

public class Storage {
    private final String[] cells;
    private int currentIndex;

    public Storage() {
        cells = new String[10];
        currentIndex = 0;
    }

    public boolean putGood(String good) {
        if (currentIndex == cells.length) {
            System.out.println("Storage is full !!");
            currentIndex = 0;
            return false;
        }
        cells[currentIndex] = good;
        currentIndex++;
        return true;
    }

    public String getGood( int index ) {
        if (currentIndex == cells.length) {
            System.out.println("Storage is empty !!");
            currentIndex = 0;
            return null;
        }
        String good = cells[currentIndex];
        synchronized (this) {
            cells[currentIndex] = null;
            currentIndex++; // 0,2,4,6,8  //1,3,5,7,9
        }
        return good;
    }
}
