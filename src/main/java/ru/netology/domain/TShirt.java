package ru.netology.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@EqualsAndHashCode
@NoArgsConstructor
public class TShirt extends Product {
    private String color;
    private String size;


}