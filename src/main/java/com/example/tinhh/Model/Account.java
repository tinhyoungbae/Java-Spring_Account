package com.example.tinhh.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Entity


@NamedNativeQuery(
        name = "getAccount_name",
        query =
                "SELECT " +
                        "  id_account, " +
                        "  name_account " +
                        "FROM Account ",
        resultSetMapping = "getAccount_map"
)
@SqlResultSetMapping(
        name = "getAccount_map",
        classes = @ConstructorResult(
                targetClass = Account.class,
                columns = {
                        @ColumnResult(name = "id_account", type = int.class),
                        @ColumnResult(name = "name_account", type = String.class)
                }
        )
)

@Data
@Table(name = "Account")
public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAccount")
    private int idAccount;
    @Column(name = "nameAccount")
    private String nameAccount;

    public Account(){

    }

    public Account(int idAccount, String nameAccount) {
        this.idAccount = idAccount;
        this.nameAccount = nameAccount;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }
}
