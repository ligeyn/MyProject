package ru.kpfu.itis.toyshop.domain;

import javax.persistence.*;

@Entity
@Table(name="Cart")
public class Cart {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
            (cascade = {CascadeType.REFRESH},
                    fetch = FetchType.LAZY)
    @JoinColumn(name = "goods")
    private Good goods;

    @ManyToOne
            (cascade = {CascadeType.REFRESH},
                    fetch = FetchType.LAZY)
    @JoinColumn(name = "users")
    private User users;

    @Column(name = "count")
    private Long count;

    public Cart() {
    }

    public Cart(Good goods, User users, Long count) {
        this.goods = goods;
        this.users = users;
        this.count = count;
    }

    public Cart(Long count, Good goods) {
        this.count = count;
        this.goods = goods;
    }

    public Good getGoods() {
        return goods;
    }

    public User getUsers() {
        return users;
    }

    public Long getCount() {
        return count;
    }

    public void setGoods(Good goods) {
        this.goods = goods;
    }

    public void setUsers(User users) {
        this.users = users;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

