package com.example.demo.productShop.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "users")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserImportDTO {
    @XmlElement(name = "user")
    private List<UserNameDTO> users;

    public UserImportDTO() {}

    public List<UserNameDTO> getUsers() {
        return users;
    }
}
