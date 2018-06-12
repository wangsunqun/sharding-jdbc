package com.nakedhub.shardingjdbc.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "t_user")
public class User {
    @Id
    private long userId;
    private long orderId;
}
