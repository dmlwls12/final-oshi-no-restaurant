package kr.oshino.eataku.restaurant.admin.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "menu")
public class Menu {

    @Id
    @Column(name = "menu_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int menuNo;

    @ManyToOne()
    @JoinColumn(name = "restaurant_no")
    private Restaurant restaurantNo;

    @Column(name = "menu_name")
    private String menuName;

    @Column(name = "description")
    private String description;

    @Column(name = "photo_url")
    private String photoUrl;
}