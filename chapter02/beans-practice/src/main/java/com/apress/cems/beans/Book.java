
package com.apress.cems.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book implements Item {

    @Value(value = "Brief History")
    private String title;


    public Book() {
    }

    @Override
    public String getTitle() {
        return title;
    }
}
