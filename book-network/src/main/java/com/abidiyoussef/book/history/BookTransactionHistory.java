package com.abidiyoussef.book.history;


import com.abidiyoussef.book.book.Book;
import com.abidiyoussef.book.common.BaseEntity;
import com.abidiyoussef.book.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BookTransactionHistory extends BaseEntity {

//    @ManyToOne keycloak
//    @JoinColumn(name = "user_id")
//    private User user;
    //in case of keycloak
    @Column(name="user_id")
    private String userId;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
    private boolean returned;
    private boolean returnApproved;
}