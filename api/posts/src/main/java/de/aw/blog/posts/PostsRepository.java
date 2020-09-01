package de.aw.blog.posts;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "posts", path = "posts")
public interface PostsRepository extends PagingAndSortingRepository<Post, Long> {

}
