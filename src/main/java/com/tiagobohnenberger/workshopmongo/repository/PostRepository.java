package com.tiagobohnenberger.workshopmongo.repository;

import com.tiagobohnenberger.workshopmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository <Post, String> {
}
