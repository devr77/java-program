package com.tvd12.master_design_patterns.entity;

import com.tvd12.master_design_patterns.visitor.Visitor;
import lombok.Data;

@Data
public class Author implements Cloneable {
    private long id;
    private String name;
    private String code;
    private String level;

    @Override
    public Author clone() {
        final Author clone = new Author();
        clone.name = name;
        return clone;
    }

    public void accept(Visitor<Author> visitor) {
        visitor.visit(this);
    }
}
