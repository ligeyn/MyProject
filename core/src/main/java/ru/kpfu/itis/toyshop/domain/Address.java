package ru.kpfu.itis.toyshop.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Address")
public class Address {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "house")
    private int house;

    @Column(name = "flat")
    private int flat;

    @Column(name = "index")
    private String index;

    @Column(name = "area")
    private String area;

    @ManyToOne
            (cascade = {CascadeType.REFRESH},
                    fetch = FetchType.LAZY)
    @JoinColumn(name = "users")
    private User users;

    @OneToMany(cascade = CascadeType.REFRESH,
            fetch = FetchType.LAZY,
            mappedBy="address")
    private List<Order> orders;

    public Address() {
    }

    public Address(String city, String street, int house, int flat, String index, String area, User users, List<Order> orders) {
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
        this.index = index;
        this.area = area;
        this.users = users;
        this.orders = orders;
    }

    public Address(String city, String street, int house, int flat, String index, String area, User users) {
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
        this.index = index;
        this.area = area;
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouse() {
        return house;
    }

    public double getFlat() {
        return flat;
    }

    public String getIndex() {
        return index;
    }

    public String getArea() {
        return area;
    }

    public User getUsers() {
        return users;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setUsers(User users) {
        this.users = users;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}

