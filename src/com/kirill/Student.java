package com.kirill;

import java.util.Arrays;

public class Student {
    private String surname;
    private int  groupNumber;
    private int[] progress=new int[5];

    public Student(String surname, int groupNumber, int[] progress) {
        this.surname = surname;
        this.groupNumber = groupNumber;
        this.progress = progress;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getProgress() {
        return progress;
    }

    public void setProgress(int[] progress) {
        this.progress = progress;
    }

    @Override
    public String toString() {
        return String.format("Фамилия: %s%nНомер группы: %d%nУспеваемость: %s%n",surname,groupNumber,Arrays.toString(progress));
    }
}
