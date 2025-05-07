package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {

    private Long id; // 물건의 고유 id
    private String name; // 물건의 이름
    private Long count; // 물건의 개수 (재고)

}
