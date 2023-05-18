package com.UST.StudentServicesfeign.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book {
    public Integer bookId;
    public String bookName;
    public Double bookCost;
}
