package com.example.springbootapplab.DAO;

        import com.example.springbootapplab.Entity.Book;
        import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {


}