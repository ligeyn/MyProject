package ru.kpfu.itis.toyshop.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Order_Goods")
public class Order_Good implements Serializable {
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
    @JoinColumn(name = "orders")
    private Order orders;

    @Column(name = "count")
    private Long count;

    public Order_Good() {
    }

    public Order_Good(Good goods, Order orders, Long count) {
        this.goods = goods;
        this.orders = orders;
        this.count = count;
    }

    public Order_Good(Good goods, Long count) {
        this.goods = goods;
        this.count = count;
    }


    public Good getGoods() {
        return goods;
    }

    public Order getOrders() {
        return orders;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public void setOrders(Order orders) {
        this.orders = orders;
    }

    public void setGoods(Good goods) {
        this.goods = goods;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
