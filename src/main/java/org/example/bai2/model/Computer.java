package org.example.bai2.model;

import javax.persistence.*;

@Entity
    @Table(name = "computer")
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nameComputer;
    private String manufacturer;
    private String type;
    private String operating;
    private String CPU;
    private String RAM;
    private String internalMemory;
    private String Card;
    private String screen;
    private int price;
    private String dateOfManufacture;
    private String Status;
    private String describes;




public Computer() {
}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameComputer() {
        return nameComputer;
    }

    public void setNameComputer(String nameComputer) {
        this.nameComputer = nameComputer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOperating() {
        return operating;
    }

    public void setOperating(String operating) {
        this.operating = operating;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getInternalMemory() {
        return internalMemory;
    }

    public void setInternalMemory(String internalMemory) {
        this.internalMemory = internalMemory;
    }

    public String getCard() {
        return Card;
    }

    public void setCard(String card) {
        Card = card;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }

    public Computer(long id, String nameComputer, String manufacturer, String type, String operating, String CPU, String RAM, String internalMemory, String card, String screen, int price, String dateOfManufacture, String status, String describes) {
        this.id = id;
        this.nameComputer = nameComputer;
        this.manufacturer = manufacturer;
        this.type = type;
        this.operating = operating;
        this.CPU = CPU;
        this.RAM = RAM;
        this.internalMemory = internalMemory;
        Card = card;
        this.screen = screen;
        this.price = price;
        this.dateOfManufacture = dateOfManufacture;
        Status = status;
        this.describes = describes;
    }
}
