package com.DealsAndCoupons.user.entity;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Document("deals")
public class DealsandCoupons {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String _id;
    private  String lmd_id;
    private  String store;
    private String offer_text;
    private String offer_value;
    private String title;
    private String description;
    private String code;
    private String terms_and_conditions;
    private String categories;
    private String category_array;
    private String featured;
    private String url;
    private String smartLink;
    private String image_url;
    private String type;
    private String offer;
    private String status;
    private String start_date;
    private String end_date;
}
