package Technics;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Notebook {


    private int id;
    private String company;
    private String model;
    private double monitorDiagonal;
    private int color;
    private int hdd;
    private int ram;
    private String os;

    public String getOs() {
        return os;
    }

    public int getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public double getMonitorDiagonal() {
        return monitorDiagonal;
    }

    public int getColor() {
        return color;
    }

    public int getHdd() {
        return hdd;
    }

    public int getRam() {
        return ram;
    }

    public String os() {
        return os;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMonitorDiagonal(double monitorDiagonal) {
        this.monitorDiagonal = monitorDiagonal;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Notebook(int id, String company, String model, double monitorDiagonal, int color, int hdd, int ram, String os) {
        this.id = id;
        this.company = company;
        this.model = model;
        this.monitorDiagonal = monitorDiagonal;
        this.color = color;
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return id == notebook.id && Double.compare(notebook.monitorDiagonal, monitorDiagonal) == 0 && color == notebook.color && hdd == notebook.hdd && ram == notebook.ram && os == notebook.os && Objects.equals(company, notebook.company) && Objects.equals(model, notebook.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, company, model, monitorDiagonal, color, hdd, ram, os);
    }

    @Override
    public String toString() {
        return
                "id = " + id +
                ", Компания производитель = '" + company + '\'' +
                ", Модель = '" + model + '\'' +
                ", Диагональ монитора = " + monitorDiagonal +
                ", Цвет = " + color +
                ", Объём HDD = " + hdd +
                ", ОЗУ = " + ram +
                ", ОС = " + os
                ;
    }

    public void onPower()
    {
        System.out.println("Ноутбук включон");
    }

    public void offPower()
    {
        System.out.println("Ноутбук выключен");
    }


}
