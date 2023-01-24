package com.fastcampus.springbootpractice.domain;

//@Value
public record StudentRecode(
    String name,
    Integer age,
    Grade grade
) {
    public enum Grade {
        A, B, C, D
    }
}
